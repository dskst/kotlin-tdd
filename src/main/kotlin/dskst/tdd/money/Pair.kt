package dskst.tdd.money

class Pair(from: String, to: String) {

    private val from: String = from
    private val to: String = to

    override fun equals(other: Any?): Boolean {
        val pair = other as Pair
        return from == pair.from && to == pair.to
    }

    override fun hashCode(): Int {
        return 0
    }
}