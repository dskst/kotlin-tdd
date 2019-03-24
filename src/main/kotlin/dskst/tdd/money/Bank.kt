package dskst.tdd.money

class Bank {

    fun reduce(source: Expression, to: String): Money {
        return source.reduce(to)
    }
}