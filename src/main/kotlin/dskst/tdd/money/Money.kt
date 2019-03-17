package dskst.tdd.money

open class Money(amount: Int, currency: String) {

    private val amount: Int = amount

    private val currency: String = currency

    open fun times(multiplier: Int): Money {
        return Money(amount * multiplier, currency)
    }

    companion object {
        fun dollar(amount: Int): Money {
            return Money(amount, "USD")
        }

        fun franc(amount: Int): Money {
            return Money(amount, "CHF")
        }
    }

    fun currency(): String {
        return currency
    }

    override fun equals(money: Any?): Boolean {
        if (money is Money) {
            return amount == money.amount
                    && currency().equals(money.currency())
        }
        return false
    }

    override fun toString(): String {
        return "$amount $currency"
    }

    fun plus(addend: Money): Money {
        return Money(amount + addend.amount, currency)
    }
}