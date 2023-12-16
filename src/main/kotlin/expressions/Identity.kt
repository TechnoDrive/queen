package expressions

class Identity<A>(private val value: A) : Expression {
    override fun <A> value(): A = value
}