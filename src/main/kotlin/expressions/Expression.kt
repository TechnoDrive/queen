package expressions

interface Expression {
    fun value(): Expression

    operator fun plus(other: Expression): Expression
    operator fun times(other: Expression): Expression
}