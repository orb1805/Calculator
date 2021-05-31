package e.roman.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var firstNumberTv: TextView
    private lateinit var secondNumberTv: TextView
    private lateinit var operationTv: TextView
    private var firstNumber = ""
    private var secondNumber = ""
    private var operation = Operation.Plus

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNumberTv = findViewById(R.id.tv_first_number)
        secondNumberTv = findViewById(R.id.tv_second_number)
        operationTv = findViewById(R.id.tv_operation)
        val numbersBtns = mutableListOf<Button>()
        numbersBtns.add(findViewById(R.id.btn_0))
        numbersBtns.add(findViewById(R.id.btn_1))
        numbersBtns.add(findViewById(R.id.btn_2))
        numbersBtns.add(findViewById(R.id.btn_3))
        numbersBtns.add(findViewById(R.id.btn_4))
        numbersBtns.add(findViewById(R.id.btn_5))
        numbersBtns.add(findViewById(R.id.btn_6))
        numbersBtns.add(findViewById(R.id.btn_7))
        numbersBtns.add(findViewById(R.id.btn_8))
        numbersBtns.add(findViewById(R.id.btn_9))
        numbersBtns.add(findViewById(R.id.btn_dot))
        val operationsBtns = mutableListOf<Button>()
        operationsBtns.add(findViewById(R.id.btn_plus))
        operationsBtns.add(findViewById(R.id.btn_minus))
        operationsBtns.add(findViewById(R.id.btn_multiply))
        operationsBtns.add(findViewById(R.id.btn_divide))
        operationsBtns.add(findViewById(R.id.btn_solve))
        for (i in numbersBtns)
            i.setOnClickListener { addDigit(i.text.toString()) }
        for (i in operationsBtns)
            i.setOnClickListener {
                parseOperation(
                        Operation.getOperation(i.tag.toString())
                )
            }
    }

    private fun addDigit(digit: String) {
        if (digit == ".") {
            if (!firstNumber.contains("."))
                firstNumber += digit
        } else
            firstNumber += digit
        firstNumberTv.text = firstNumber
    }

    private fun parseOperation(operation: Operation) {
        if (secondNumber == "") {
            secondNumberTv.text = firstNumber
            secondNumber = firstNumber
            firstNumber = ""
            firstNumberTv.text = ""
            operationTv.text = operation.toString()
            this.operation = operation
        } else {
            if (firstNumber == "") {
                this.operation = operation
                operationTv.text = operation.toString()
            } else {
                secondNumber = Calculator.makeOperation(secondNumber, firstNumber, this.operation).toString()
                secondNumberTv.text = secondNumber
                if (operation == Operation.Solve)
                    operationTv.text = ""
                else
                    operationTv.text = operation.toString()
                firstNumberTv.text = ""
                firstNumber = ""
                this.operation = operation
            }
        }
    }
}