package expressions

class Identity(private val value: Expression) : Expression {
    override fun value() = value
}