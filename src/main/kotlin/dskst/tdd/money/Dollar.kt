package dskst.tdd.money

class Dollar(amount: Int) {

    var amount = amount

    fun times(multiplier: Int) {
        amount *= multiplier
    }
}