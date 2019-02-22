package dskst.tdd.money

class Dollar(amount: Int) {

    var amount = amount

    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }

    override fun equals(any: Any?): Boolean {

        if (any is Dollar) {
            return amount == any.amount
        }

        return false
    }
}