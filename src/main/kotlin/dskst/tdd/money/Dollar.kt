package dskst.tdd.money

class Dollar(amount: Int):Money(amount) {

    override fun currency(): String {
        return "USD"
    }

    override fun times(multiplier: Int): Money {
        return Dollar(amount * multiplier)
    }
}