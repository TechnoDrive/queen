package expressions

interface Expression {
    fun <VALUE> value(): VALUE

    operator fun plus(other: Expression) = Sum(this, other)
    operator fun times(other: Expression) = Product(this, other)
}