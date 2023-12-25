package expressions

import operations.BinaryOperation
import terms.Rational

class Product(lhs: Expression, rhs: Expression) : BinaryOperation {
    override val lhs = lhs.simplify()
    override val rhs = rhs.simplify()

    override fun value() = lhs * rhs

    fun factors(): Array<Expression> = when {
        lhs is Product && rhs is Product -> arrayOf(*lhs.factors(), *rhs.factors())
        lhs is Product && rhs is Rational -> arrayOf(*lhs.factors(), rhs)
        lhs is Rational && rhs is Product -> arrayOf(lhs, *rhs.factors())

        else -> arrayOf(lhs, rhs)
    }

    // this method is currently NOT commutative
    // i've written the factors method above to change that
    // the goal is, when simplifying, to get all the factors
    // and then compose all rationals, no matter how deep
    // this logic can then be extended to like-terms easily
    //
    // TODO: use factors to do the above
    override fun simplify(): Expression = when {
        lhs is Rational && rhs is Rational -> (lhs * rhs).simplify()
        lhs is Product && rhs is Product -> Product(lhs.lhs * rhs.lhs, lhs.rhs * rhs.rhs)
        else -> this
    }

    override fun toString() = "Product($lhs, $rhs)"
}