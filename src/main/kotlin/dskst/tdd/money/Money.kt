package dskst.tdd.money

open class Money(amount: Int) {
    protected var amount: Int = amount

    override fun equals(other: Any?): Boolean {
        if (other is Money) {
            return amount == other.amount
        }
        return false
    }
}