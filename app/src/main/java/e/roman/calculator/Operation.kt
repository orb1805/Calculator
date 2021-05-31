package e.roman.calculator

enum class Operation(val operation: String) {
    Plus("+"),
    Minus("-"),
    Multiply("*"),
    Divide("/"),
    Solve("=");

    companion object {
        fun getOperation(a: String): Operation {
            return when (a) {
                "+" -> Plus
                "-" -> Minus
                "*" -> Multiply
                "/" -> Divide
                "=" -> Solve
                else -> Plus
            }
        }
    }

    override fun toString(): String {
        return when(super.toString()) {
            "Plus" -> "+"
            "Minus" -> "-"
            "Multiply" -> "*"
            "Divide" -> "/"
            else -> "="
        }
    }
}