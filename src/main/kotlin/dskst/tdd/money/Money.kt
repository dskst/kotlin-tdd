package dskst.tdd.money

open class Money(amount: Int, currency: String) {

    protected val amount: Int = amount

    protected val currency: String = currency

    open fun times(multiplier: Int): Money {
        return Money(multiplier, "")
    }

    companion object {
        fun dollar(amount: Int, currency: String = ""): Dollar {
            return Dollar(amount, "USD")
        }

        fun franc(amount: Int, currency: String = ""): Franc {
            return Franc(amount, "CHF")
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
}