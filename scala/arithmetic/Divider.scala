package arithmetic

import chisel3._
import chisel3.util._

class Divider(bitWidth: Int) extends Module {
  val io = IO(new Bundle {
    val start = Input(Bool())
    val done = Output(Bool())
    val dividend = Input(UInt(bitWidth.W))
    val divisor = Input(UInt(bitWidth.W))
    val quotient = Output(UInt(bitWidth.W))
    val remainder = Output(UInt(bitWidth.W))
  })

  // Registers for state storage
  val remainder = RegInit(0.U(bitWidth.W))       //current remainder
    val quotient = RegInit(VecInit(Seq.fill(bitWidth)(0.U(1.W))))   //= {dividend[i:0], quotient[N−1:i+1]}, where dividend is the input dividend and quotient is the final output quotient, and i is the current cycle
    val divisor = RegInit(0.U(bitWidth.W))         //divisor
  val count = RegInit(0.U(log2Ceil(bitWidth + 1).W)) // Counter for bit position
  val loop = RegInit(0.U(log2Ceil(bitWidth + 1).W)) // Loop counter for iterations

  // Initial done signal
  io.done := false.B

  // Start computation on start signal
  when(io.start) {
    remainder := 0.U
    quotient := VecInit(io.dividend.asBools.map(_.asUInt))
    divisor := io.divisor
    count := (bitWidth - 1).U
    loop := bitWidth.U
  }

  // Main division loop
  when(loop =/= 0.U) {
    val nextRemainder = (remainder << 1) | io.dividend(count)

    // Check if remainder is greater than or equal to divisor
    when(nextRemainder >= divisor) {
      remainder := nextRemainder - divisor
      quotient(count) := 1.U
    } .otherwise {
      remainder := nextRemainder
      quotient(count) := 0.U
    }

    // Shift to the next bit position
    count := count - 1.U
    loop := loop - 1.U

  /*  when(loop =/= 0.U && io.dividend(count) === 0.U) {
      // Convert quotient to UInt and create a mask
      val quotientUInt = quotient.asUInt
      val mask = (1.U << count) - 1.U

      // Apply the mask to zero out bits from count to 0
      io.quotient := quotientUInt & ~mask

      // Reset count and loop
      count := 0.U
      loop := 0.U
    }*/
  }

  // Check if all iterations are done
  when(loop === 0.U) {
    io.done := true.B
  }

  // Output the final quotient and remainder
  io.quotient := quotient.asUInt
  io.remainder := remainder
}
