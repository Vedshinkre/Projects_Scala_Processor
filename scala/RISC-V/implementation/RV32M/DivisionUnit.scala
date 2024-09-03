package RISCV.implementation.RV32M

import chisel3._
import chisel3.util._

import RISCV.interfaces.generic.AbstractExecutionUnit
import RISCV.model._


class DivisionUnit extends AbstractExecutionUnit {

    io.misa := "b01_0000_0_00000_00000_00100_00000_00000".U

    io.valid := false.B    
    io.stall := STALL_REASON.NO_STALL

    io_data <> DontCare
    io_reg <> DontCare
    io_pc <> DontCare
    io_reset <> DontCare
   val opcode = io.instr(6, 0)
  val rd = io.instr(11, 7)
  val funct3 = io.instr(14, 12)
  val rs1 = io.instr(19, 15)
  val rs2 = io.instr(24, 20)
  val funct7 = io.instr(31, 25)
  io_reg.reg_rs1 := rs1
  io_reg.reg_rs2 := rs2
  io_reg.reg_rd := rd

    io_reg.reg_write_en := false.B // currently we havent checked anything and dont want to write anything into the register file
     io.valid := false.B    //intially the opertaion is not valid    
    io.stall := STALL_REASON.NO_STALL
   
   when(opcode === "b0110011".U && funct7 === "b0000001".U  && (funct3 === "b100".U || funct3 === "b101".U || funct3 === "b110".U || funct3 === "b111".U) ) {
      
      //divison being done
      when(funct3 === "b100".U) {
        io.valid := true.B 
        io_reg.reg_write_en := true.B
        when(io_reg.reg_read_data2 === 0.U) {
          io_reg.reg_write_data :=  io_reg.reg_read_data1
        } .elsewhen(io_reg.reg_read_data2.asSInt === -1.S && io_reg.reg_read_data1 === Int.MinValue.S.asUInt) {
          io_reg.reg_write_data := io_reg.reg_read_data1
        } .otherwise {
          io_reg.reg_write_data := (io_reg.reg_read_data1.asSInt / io_reg.reg_read_data2.asSInt).asUInt
        }
      }

      // divsion on unsigned bits
      when(funct3 === "b101".U) {
        io.valid := true.B 
        io_reg.reg_write_en := true.B
        when(io_reg.reg_read_data2 === 0.U) {
          io_reg.reg_write_data := io_reg.reg_read_data1
        } .otherwise {
          io_reg.reg_write_data := io_reg.reg_read_data1.asUInt / io_reg.reg_read_data2.asUInt
        }
      }

      // REMAINDER THROUGH MODULO
      when(funct3 === "b110".U) {
        io.valid := true.B 
        io_reg.reg_write_en := true.B
        when(io_reg.reg_read_data2 === 0.U) {
          io_reg.reg_write_data := 0.U
        } .elsewhen(io_reg.reg_read_data2.asSInt === -1.S && io_reg.reg_read_data1 === Int.MinValue.S.asUInt) {
          io_reg.reg_write_data := 0.U
        } .otherwise {
          io_reg.reg_write_data := (io_reg.reg_read_data1.asSInt % io_reg.reg_read_data2.asSInt).asUInt
        }
      }

      // REMU
      when(funct3 === "b111".U) {
        io.valid := true.B 
        io_reg.reg_write_en := true.B
        when(io_reg.reg_read_data2 === 0.U) {
          io_reg.reg_write_data := 0.U
        } .otherwise {
          io_reg.reg_write_data := io_reg.reg_read_data1.asUInt % io_reg.reg_read_data2.asUInt
        }
      }

      when(opcode === "b0110011".U && funct7 === "b0000001".U  && (funct3 === "b100".U || funct3 === "b101".U || funct3 === "b110".U || funct3 === "b111".U) ) {
   io_pc.pc_we := true.B
  io_pc.pc_wdata := io_pc.pc + 4.U  
  } 
    }
  }
  
