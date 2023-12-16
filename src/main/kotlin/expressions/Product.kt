package expressions

import operations.BinaryOperation
import operations.Operation

class Product(override val lhs: Operation, override val rhs: Operation) : BinaryOperation