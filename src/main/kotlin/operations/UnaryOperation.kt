package operations

import expressions.Expression

interface UnaryOperation : Operation {
    val operand: Expression
}