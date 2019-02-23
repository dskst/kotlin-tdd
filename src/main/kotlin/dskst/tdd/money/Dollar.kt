package dskst.tdd.money

class Dollar(amount: Int) {

    private var amount = amount

    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }

    override fun equals(other: Any?): Boolean {

        if (other is Dollar) {
            return amount == other.amount
        }

        return false
    }
}