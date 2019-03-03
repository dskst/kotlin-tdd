package dskst.tdd.money

class Dollar(amount: Int):Money(amount) {

    init {
        this.currency = "USD"
    }

    override fun times(multiplier: Int): Money {
        return Dollar(amount * multiplier)
    }
}