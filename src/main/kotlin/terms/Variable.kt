package terms

import expressions.Expression

class Variable(val label: String) : Expression {
    override fun value() = label
}