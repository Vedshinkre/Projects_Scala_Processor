package arithmetic

import chisel3._
import scala.reflect.ClassTag
import chisel3.util._
import chisel3.experimental.hierarchy.{Definition, Instance, instantiable, public}

abstract class ComputationalUnit(width: Int) extends Module {
    val io = IO(new Bundle {
        val a = Input(UInt(width.W))
        val b = Input(UInt(width.W))
        val c = Output(UInt(width.W))
    })  
}

class ParallelUnit(vectorSize: Int, arraySize: Int, unitWidth: Int, comp : (Int) => ComputationalUnit) extends Module {
    require(vectorSize % arraySize == 0)
    val io = IO(new Bundle {
        val a = Input(Vec(vectorSize, UInt(unitWidth.W)))
        val b = Input(Vec(vectorSize, UInt(unitWidth.W)))
        val start = Input(Bool())
        val done = Output(Bool())
        val c = Output(Vec(vectorSize, UInt(unitWidth.W)))
    })

    
    
    val count = RegInit(0.U(log2Ceil(vectorSize / arraySize).W))
    val running = RegInit(false.B)
    val check2 = RegInit(false.B)
    val units = Seq.fill(arraySize)(Module(comp(unitWidth)))
    val inter = RegInit(VecInit(Seq.fill(vectorSize)(0.U((unitWidth).W))))
    val inter2 = RegInit(false.B)
    
    // Default values
    io.c := inter
    io.done := inter2
    for (i <- 0 until arraySize) { //setting all units index of the array chunk to zero to prevent garbage values
        units(i).io.a := 0.U
        units(i).io.b := 0.U
    }
    
    when(io.start ) {
        count := 0.U
        running := true.B
        inter2 :=false.B
    }
    
    when(running) { //UNTIL THE CALCULATIONS ARE RUNNING BECAUSE THE CYCLE IS NOT YET OVER
        for (i <- 0 until arraySize) {
              val index = (count * arraySize.U) + i.U //THE INDEX CAN BE ONLY COMPLETED AND MOVES FORWARD MORE THAN THE ARRAYSIZE PART BECAUSE WE NEED TO ACCESS THE COMPUTATIONAL UNIT
            
         
           
            units(i).io.a := io.a(index)
            units(i).io.b :=io.b(index)
            inter(index) := units(i).io.c //the computation has already be done and recievd in c 
          //  printf(p"Unit $i: A = ${io.a(i.U)}, B = ${io.b(i.U)}, C = ${units(i).io.c}\n")
            check2 := true.B
        } 
        count := count + 1.U

       // printf(p"${clock}\n")
       
        
        when(count === (vectorSize / arraySize).U) { //PROCESSING THE INTIAL CHUNK
            running := false.B
            inter2 := true.B //USING REGISTERS IN BETWEEN TO MAINTAIN THE VALUE CHNAGE
             
           
        }
    }
}