package terms

import expressions.Expression
class Variable(val label: String) : Expression {
    override fun value() = label
    override fun simplify() = this

    override fun toString() = label
}