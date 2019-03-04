package dskst.tdd.money

class Franc(amount: Int, currency: String):Money(amount) {

    init {
        this.currency = "CHF"
    }

    override fun times(multiplier: Int): Money {
        return Franc(amount * multiplier, "")
    }
}