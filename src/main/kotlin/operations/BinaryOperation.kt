package operations

import expressions.Expression

interface BinaryOperation : Operation {
    val lhs: Expression
    val rhs: Expression
}