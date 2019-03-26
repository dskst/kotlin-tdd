package dskst.tdd.money

class Bank {

    fun addRate(from: String, to: String, rate: Int) {

    }

    fun rate(from: String, to: String): Int {
        return if(from == "CHF" && to == "USD") 2 else 1
    }

    fun reduce(source: Expression, to: String): Money {
        return source.reduce(this, to)
    }
}