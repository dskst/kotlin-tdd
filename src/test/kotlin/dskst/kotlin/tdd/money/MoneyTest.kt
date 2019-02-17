package dskst.kotlin.tdd.money

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class JUnit5ExampleTest {

    @Test
    fun testMultiplication() {
        val five = Dollar(5)
        five.times(2)
        assertEquals(10, five)
    }
}