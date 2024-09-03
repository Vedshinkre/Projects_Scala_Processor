package RISCV.implementation.RV32M

import chisel3._
import chisel3.util._
import RISCV.interfaces.generic.AbstractExecutionUnit
import RISCV.model._
import arithmetic.Divider  // Ensure the Divider module is imported

class BonusDivisionUnit extends AbstractExecutionUnit {
  // Define the width of the operands (assuming 32-bit)
  val bitWidth = 32

  // Instantiate the Divider module
  val divider = Module(new Divider(bitWidth))

  // Default values for control signals
  io.misa := "b01_0000_0_00000_00000_00100_00000_00000".U
  io.valid := false.B    
  io.stall := STALL_REASON.NO_STALL

  // Initialize outputs to default values
  io_data <> DontCare
  io_reg <> DontCare
  io_pc <> DontCare
  io_reset <> DontCare

  // Extract instruction fields
  val opcode = io.instr(6, 0)
  val rd = io.instr(11, 7)
  val funct3 = io.instr(14, 12)
  val rs1 = io.instr(19, 15)
  val rs2 = io.instr(24, 20)
  val funct7 = io.instr(31, 25)
  io_reg.reg_rs1 := rs1
  io_reg.reg_rs2 := rs2
  io_reg.reg_rd := rd

  // Default write enable to false
  io_reg.reg_write_en := false.B
  io.stall := STALL_REASON.NO_STALL

  

  
  when(opcode === "b0110011".U && funct7 === "b0000001".U  && (funct3 === "b100".U || funct3 === "b101".U || funct3 === "b110".U || funct3 === "b111".U) ) {
     
    
    divider.io.start := true.B
    divider.io.dividend := io_reg.reg_read_data1
    divider.io.divisor := io_reg.reg_read_data2

   
    

    // now here the division has alraedy been performed in task 1 and we are  transfering the reszlts
    when(divider.io.done) {
      io.valid := true.B

      // Write the appropriate result based on the funct3 field
      when(funct3 === "b100".U) {
        io_reg.reg_write_en := true.B
        io_reg.reg_write_data := divider.io.quotient
      }
      when(funct3 === "b101".U) {
        io_reg.reg_write_en := true.B
        io_reg.reg_write_data := divider.io.quotient
      }
      when(funct3 === "b110".U) {
        io_reg.reg_write_en := true.B
        io_reg.reg_write_data := divider.io.remainder
      }
      when(funct3 === "b111".U) {
        io_reg.reg_write_en := true.B
        io_reg.reg_write_data := divider.io.remainder
      }

      
    }
  }

  // Update the program counter once the instruction is complete
  when(opcode === "b0110011".U && funct7 === "b0000001".U  && (funct3 === "b100".U || funct3 === "b101".U || funct3 === "b110".U || funct3 === "b111".U) ) {
    io_pc.pc_we := true.B
    io_pc.pc_wdata := io_pc.pc + 4.U
  }
}