package operations

interface UnaryOperation : Operation {
    val operand: Operation
}