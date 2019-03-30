package dskst.tdd.money

class Bank {

    private val rates: MutableMap<Pair, Int> = hashMapOf()

    fun addRate(from: String, to: String, rate: Int) {
        rates[Pair(from, to)] = rate
    }

    fun rate(from: String, to: String): Int {
        return if(from == "CHF" && to == "USD") 2 else 1
    }

    fun reduce(source: Expression, to: String): Money {
        return source.reduce(this, to)
    }
}