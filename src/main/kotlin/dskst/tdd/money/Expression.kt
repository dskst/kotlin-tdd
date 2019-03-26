package dskst.tdd.money

interface Expression {
    fun reduce(bank: Bank, to: String): Money
}