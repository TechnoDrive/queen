package terms

import expressions.Expression

// TODO: replace with a `Rational` class with a denominator of 1
class Integer(val number: Int) : Expression {
    override fun value() = number
}