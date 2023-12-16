package operations

interface BinaryOperation : Operation {
    val lhs: Operation
    val rhs: Operation
}