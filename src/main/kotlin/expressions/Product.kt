package expressions

import operations.BinaryOperation

class Product(override val lhs: Expression, override val rhs: Expression) : BinaryOperation {
    override fun value() = lhs * rhs
}