package e.roman.calculator

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun addition_isCorrect1() {
        assertEquals(4.0f, Calculator.makeOperation("2", "2", Operation.Plus))
    }

    @Test
    fun addition_isCorrect2() {
        assertEquals(123.0f, Calculator.makeOperation("11", "112", Operation.Plus))
    }

    @Test
    fun addition_isCorrect3() {
        assertEquals(0.0f, Calculator.makeOperation("0", "0", Operation.Plus))
    }

    @Test
    fun addition_isCorrect4() {
        assertEquals(222222.0f, Calculator.makeOperation("111111", "111111", Operation.Plus))
    }

    @Test
    fun minus_isCorrect1() {
        assertEquals(222222.0f, Calculator.makeOperation("333333", "111111", Operation.Minus))
    }

    @Test
    fun minus_isCorrect2() {
        assertEquals(0.0f, Calculator.makeOperation("456", "456", Operation.Minus))
    }

    @Test
    fun minus_isCorrect3() {
        assertEquals(10.0f, Calculator.makeOperation("210", "200", Operation.Minus))
    }

    @Test
    fun minus_isCorrect4() {
        assertEquals(-8841.0f, Calculator.makeOperation("99", "8940", Operation.Minus))
    }

    @Test
    fun multiply_isCorrect1() {
        assertEquals(0.0f, Calculator.makeOperation("99", "0", Operation.Multiply))
    }

    @Test
    fun multiply_isCorrect2() {
        assertEquals(0.0f, Calculator.makeOperation("0", "130", Operation.Multiply))
    }

    @Test
    fun multiply_isCorrect3() {
        assertEquals(100.0f, Calculator.makeOperation("100.0", "1", Operation.Multiply))
    }

    @Test
    fun multiply_isCorrect4() {
        assertEquals(123.4f, Calculator.makeOperation("12.34", "10.0", Operation.Multiply))
    }

    @Test
    fun division_isCorrect1() {
        assertEquals(0.0f, Calculator.makeOperation("0", "18525", Operation.Divide))
    }

    @Test
    fun division_isCorrect2() {
        assertEquals(123.0f, Calculator.makeOperation("1230", "10", Operation.Divide))
    }

    @Test
    fun division_isCorrect3() {
        assertEquals(1.0f, Calculator.makeOperation("52", "52.0", Operation.Divide))
    }

    @Test
    fun division_isCorrect4() {
        assertEquals(-13.0f, Calculator.makeOperation("104", "-8.0", Operation.Divide))
    }
}