package expressions

class Identity(val value: Expression) : Expression {
    override fun value() = value
}