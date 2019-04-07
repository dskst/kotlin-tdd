package dskst.tdd.money

class Sum(augend: Money, addend: Money): Expression {

    val augend: Money = augend

    val addend: Money = addend

    override fun reduce(bank: Bank, to: String): Money {
        val amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount
        return Money(amount, to)
    }
}