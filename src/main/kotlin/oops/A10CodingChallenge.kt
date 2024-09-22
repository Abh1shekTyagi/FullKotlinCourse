package oops

fun main() {
    val user = BankAccount("Abhishek")
    user.deposit(-10000)
    user.deposit(100000)
    user.withDraw(2400)
    println(user.balance())
}

private class BankAccount(val accountName: String) {

    private var balance: Int = 0
    private val transactions: MutableList<Int> = mutableListOf()
    fun deposit(amountParam: Int) {
        if (amountParam > 0) {
            balance += amountParam
            transactions.add(amountParam)
        }
        else println("Invalid deposit $amountParam")
    }

    fun withDraw(amountParam: Int) {
        if (amountParam > 0){
            balance -= amountParam
            transactions.add(-amountParam)
        }
        else println("Invalid withdrawal request")
    }

    fun balance(): Int {
        return balance
    }
}