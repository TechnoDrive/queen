import expressions.Product
import terms.Rational
import terms.Variable

fun main() {
    val a = Product(Rational(3), Variable("x"))
    val b = Product(Variable("y"), Rational(2))

    val c = a * b

    println(c.simplify().value().toString())
}