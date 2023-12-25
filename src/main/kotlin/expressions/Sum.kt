package expressions

import operations.BinaryOperation
import terms.Rational

class Sum(lhs: Expression, rhs: Expression) : BinaryOperation {
    override val lhs = lhs.simplify()
    override val rhs = rhs.simplify()

    override fun value() = lhs + rhs

    override fun simplify(): Expression {
        return when {
            lhs is Rational && rhs is Rational -> (lhs + rhs).simplify()

            else -> this
        }
    }

    override fun toString() = "Product($lhs, $rhs)"
}