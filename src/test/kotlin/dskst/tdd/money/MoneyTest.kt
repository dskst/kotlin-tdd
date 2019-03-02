package dskst.tdd.money

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class MoneyTest {

    @Test
    fun testMultiplication() {
        val five = Money.dollar(5)
        assertEquals(Money.dollar(10), five.times(2))
        assertEquals(Money.dollar(15), five.times(3))
    }

    @Test
    fun testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)))
        assertFalse(Money.dollar(5).equals(Money.dollar(6)))
        assertTrue(Franc(5).equals(Franc(5)))
        assertFalse(Franc(5).equals(Franc(6)))
        assertFalse(Money.dollar(5).equals(Franc(5)))
    }

    @Test
    fun testFrancMultiplication() {
        val five = Franc(5)
        assertEquals(Franc(10), five.times(2))
        assertEquals(Franc(15), five.times(3))
    }
}