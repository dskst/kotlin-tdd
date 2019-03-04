package dskst.tdd.money

class Franc(amount: Int, currency: String):Money(amount) {

    init {
        this.currency = currency
    }

    override fun times(multiplier: Int): Money {
        return franc(amount * multiplier)
    }
}