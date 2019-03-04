package dskst.tdd.money

class Dollar(amount: Int, currency: String):Money(amount) {

    init {
        this.currency = currency
    }

    override fun times(multiplier: Int): Money {
        return dollar(amount * multiplier)
    }
}