package expressions

import operations.BinaryOperation

class Sum(override val lhs: Expression, override val rhs: Expression) : BinaryOperation {
    override fun value() = lhs + rhs
}