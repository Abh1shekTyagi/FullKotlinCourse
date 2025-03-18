package higherOrderFunction


fun add(a: Int, b: Int) = a + b
//can be converted to a lambda function

val myLambda: (Int, Int) -> Int = { a, b -> a + b }//If i convert the return type to unit then it doesn't print anything

//or
val anotherLambda = { a: Int, b: Int -> a + b }


fun main() {
    println(myLambda(2, 3))
    println(anotherLambda(2, 3))
//    what the difference between
    //same thing it's just my Lambda is already defined and we can use it at multiple places
    //for one time use we need to define what we are gonna do with a,b, in second definition.
    takeHigherOrderFunctionAsParameter(2, 3, myLambda)
    takeHigherOrderFunctionAsParameter(2, 3) { a, b ->
        a + b
    }
}

fun takeHigherOrderFunctionAsParameter(a: Int, b: Int, functionAsInput: (Int, Int) -> Int) {
    functionAsInput(4, 3)
}