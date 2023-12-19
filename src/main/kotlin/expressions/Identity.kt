package expressions

class Identity<T>(private val value: T) : Expression {
    override fun value() = value
    override fun simplify() = this
}