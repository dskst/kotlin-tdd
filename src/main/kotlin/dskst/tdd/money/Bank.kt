package dskst.tdd.money

import java.lang.IllegalArgumentException

class Bank {

    private val rates: MutableMap<Pair, Int> = hashMapOf()

    fun addRate(from: String, to: String, rate: Int) {
        rates[Pair(from, to)] = rate
    }

    fun rate(from: String, to: String): Int {
        if (from == to) {
            return 1
        }
        return rates[Pair(from, to)] ?: throw IllegalArgumentException()
    }

    fun reduce(source: Expression, to: String): Money {
        return source.reduce(this, to)
    }
}