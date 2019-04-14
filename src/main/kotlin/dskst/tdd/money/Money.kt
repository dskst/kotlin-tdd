package dskst.tdd.money

open class Money(amount: Int, currency: String): Expression {

    val amount: Int = amount

    private val currency: String = currency

    override fun times(multiplier: Int): Expression {
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

    override fun plus(addend: Expression): Expression {
        return Sum(this, addend)
    }

    override fun reduce(bank: Bank, to: String): Money {
        val rate = bank.rate(currency, to)
        return Money(amount / rate, to)
    }
}