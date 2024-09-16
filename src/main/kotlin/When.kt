fun main(){
    val conditionalWhen = when {
        checkSomething("Exact") -> true
        checkSomething("Exactly") -> true
        checkSomething("hello") -> true
        else -> false
    }
    val input = 3
    val anotherWay = when(input){
        1 -> 1
        2 -> 5
        else -> 12
    }

    val oneMoreWay = when{
        input == 1 || input == 2 || input == 12 -> 3
        input in 1..12 -> 5
        else -> 5
    }

    val also = when(oneMoreWay){
        in 1..12 -> print("between 1 and 12")
        !in 12..23 -> print("not in 12 and 23")
        else -> print("above 12")
    }
    println("end of code")
}


fun checkSomething(input: String): Boolean {
    return input == "Exactly"
}