package dskst.tdd.money

abstract class Money(amount: Int) {

    protected var amount: Int = amount

    abstract fun currency(): String

    abstract fun times(multiplier: Int): Money

    companion object {
        fun dollar(amount: Int): Dollar {
            return Dollar(amount)
        }

        fun franc(amount: Int): Franc {
            return Franc(amount)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (other is Money) {
            return amount == other.amount
                    && this::class == other::class
        }
        return false
    }
}