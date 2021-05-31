package e.roman.calculator

class Calculator {

    companion object {

        fun makeOperation(a: String, b: String, operation: Operation): Float {
            val first = a.toFloat()
            val second = b.toFloat()
            return when(operation) {
                Operation.Plus ->
                    first + second
                Operation.Minus ->
                    first - second
                Operation.Multiply ->
                    first * second
                Operation.Divide ->
                    first / second
                else ->
                    first
            }
        }

    }

}