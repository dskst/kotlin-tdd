package dskst.tdd.money

class Franc(amount: Int):Money(amount) {

    init {
        this.currency = "CHF"
    }

    override fun times(multiplier: Int): Money {
        return Franc(amount * multiplier)
    }
}