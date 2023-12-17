package terms

import expressions.Expression
import kotlin.math.pow

class Rational(val n: Int, val d: Int) : Expression {
    constructor(n: Int) : this(n, 1)

    override fun value() = n.toDouble() / d.toDouble()

    operator fun plus(other: Rational) = add(this, other)
    operator fun times(other: Rational) = multiply(this, other)
    operator fun minus(other: Rational) = subtract(this, other)
    operator fun div(other: Rational) = divide(this, other)

    operator fun unaryMinus() = negate(this)

    val reciprocal = invert(this)

    companion object {
        fun from(pair: Pair<Int, Int>) = Rational(pair.first, pair.second)
        fun Pair<Int, Int>.toRational() = from(this)

        fun add(a: Rational, b: Rational) = Rational((a.n * b.d) + (b.n * a.d), a.d * b.d)
        fun multiply(a: Rational, b: Rational) = Rational(a.n * b.n, a.d * b.d)

        fun subtract(a: Rational, b: Rational) = add(a, negate(b))
        fun divide(a: Rational, b: Rational) = multiply(a, invert(b))

        // you read this right.
        fun pow(a: Rational, n: Int) =
            listOf(a.n, a.d).map { it.toDouble().pow(n).toInt() }
                .zipWithNext()
                .single()
                .toRational()

        fun negate(x: Rational) = Rational(-x.n, x.d)
        fun invert(x: Rational) = Rational(x.d, x.n)
    }
}