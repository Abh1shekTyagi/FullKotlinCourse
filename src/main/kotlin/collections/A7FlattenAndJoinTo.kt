package collections

//flatten function is used to convert a list of list to a single list
//we do not need to write nested loops and if it is an array of array we can use [][] but its not possible always

fun main() {
    val listOfList = listOf(setOf(1, 2, 3), setOf(2, 3, 4, 5, 6), setOf(1, 2, 3))
    println(listOfList.flatten())//note flatten will only work if the inside list is of same type

    val listOfAny =
        listOf(arrayOf(1, 2, 3), setOf("abhishek", "tyagi")) // not sure what to use here flatmap is not working

    println(listOfList.flatten().joinToString()) // this will just separate by comma(,)

    val joinToListBuffer = StringBuffer("List is -> ")
    println(listOfList.flatten().joinTo(joinToListBuffer)) //this string buffer will be appended to the list
    println(
        listOfList.flatten().joinToString(separator = ",", prefix = "the number are -> ", postfix = ": that's all")
    ) // we can choose to skip any parameter
    //prefix will be added in front of the list, not each item, similarly postfix

    //we can also specify the limit and truncation of the array

    val numbers = (1..1000).toList()
    println(numbers.joinToString (limit = 20, truncated = "<...>"))

    //we can also manipulate each element in the joinToString method
    println(numbers.joinToString{"$it is the number" })

}