package dskst.tdd.money

class Franc(amount: Int):Money(amount) {

    fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }

    override fun equals(other: Any?): Boolean {
        if (other is Franc) {
            return amount == other.amount
        }
        return false
    }
}