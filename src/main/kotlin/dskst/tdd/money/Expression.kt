package dskst.tdd.money

interface Expression {
    fun reduce(to: String): Money
}