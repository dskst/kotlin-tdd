package dskst.tdd.money

abstract class Money(amount: Int, currency: String) {

    protected val amount: Int = amount

    private val currency: String = currency

    abstract fun times(multiplier: Int): Money

    companion object {
        fun dollar(amount: Int): Dollar {
            return Dollar(amount, "USD")
        }

        fun franc(amount: Int): Franc {
            return Franc(amount, "CHF")
        }
    }

    fun currency(): String {
        return currency
    }

    override fun equals(other: Any?): Boolean {
        if (other is Money) {
            return amount == other.amount
                    && this::class == other::class
        }
        return false
    }
}