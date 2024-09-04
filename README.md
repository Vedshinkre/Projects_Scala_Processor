# Chisel Processor
This project is focused on creating the hardware design of a basic processor using Chisel. The project is divided into two main parts: designing arithmetic circuits and extending a RISC-V processor implementation. The aim is to gain hands-on experience with digital design and processor architecture using Chisel, a hardware description language embedded in Scala.

## Project Overview
### Part 1: Arithmetic Circuits in Chisel
In this section, the focus was on implementing arithmetic circuits, specifically:
### Division Circuit:
Implemented a sequential circuit for integer division based on the grade school method.The circuit produces the quotient and remainder after n clock cycles.
### Vector Unit:
Developed a generator for a vector unit that can perform parallel arithmetic or logic operations on multiple data elements.The unit can handle multiple data elements in parallel based on the specified array size, vector size, and bit width.

### Part 2: Extending RISC-V Processor
The second part involved extending an existing RISC-V processor implementation by adding support for:

### Function Calls:
Implemented support for jal (jump and link) and jalr (jump and link register) instructions, enabling function calls in RISC-V.
Load Instructions: Added support for various load instructions such as lw, lb, lbu, lh, and lhu.
### Multiplication and Division:
Implemented the RISC-V M-Extension, which includes multiplication and division instructions.

## Setup and Installation
### Prerequisites
### Java and Scala:
Ensure you have Java and Scala installed, along with sbt (Simple Build Tool).
Chisel: This project is built using Chisel, so you'll need to have a working Scala environment with sbt.

## Installation Steps
### Clone the Repository:


git clone https://github.com/yourusername/chisel-hardware-design.git
cd chisel-hardware-design
Install Dependencies:


sbt compile
Run Tests:

sbt test
Testing
Testing is an integral part of this project. Use the provided test cases, and consider adding your own to ensure the correctness of your implementation. Tests are located in the src/test/scala directory.

To run the tests:

sbt test
