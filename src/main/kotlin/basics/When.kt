package basics

fun main(){
    val conditionalWhen = when {
        checkSomething("Exact") -> true // checkSomething should return boolean
        checkSomething("Exactly") -> true
        checkSomething("hello") -> true
        else -> false
    }

    val arrayWithDifferentDT = arrayOf("abhishek", '1', 5)
    for(i in arrayWithDifferentDT){
        print(i)
        when(i){ //i is a class
            is Int -> println("$i is int") //type checking will give true and false
            is String -> println("$i is string")
            is Char -> println("$i is a char")
            else -> print("unknown data type")
        }
    }

    val input = 3
    val anotherWay = when(input){ // basic when
        1 -> 1
        2 -> 5
        else -> 12
    }

    val oneMoreWay = when{
        input == 1 || input == 2 || input == 12 -> 3 //we can use it like if else statements
        input in 1..12 -> 5
        else -> 5
    }

    val also = when(oneMoreWay){
        in 1..12 -> print("between 1 and 12")
        !in 12..23 -> print("not in 12 and 23") //we can also use not in range
        else -> print("above 12")
    }
    println("end of code")
}


fun checkSomething(input: String): Boolean {
    return input == "Exactly"
}