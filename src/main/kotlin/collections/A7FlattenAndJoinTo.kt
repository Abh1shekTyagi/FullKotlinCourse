package collections

//flatten function is used to convert a list of list to a single list
//we do not need to write nested loops and if it is an array of array we can use [][] but, its not always possible

fun main() {
    val listOfList = listOf(setOf(1, 2, 3), setOf(2, 3, 4, 5, 6), setOf(1, 2, 3))
    println(listOfList.flatten())//note flatten will only work if the inside list is of same type

    val listOfAny =
        listOf(arrayOf(1, 2, 3), setOf("abhishek", "tyagi")) // since it is an arrayOf the flatmap is printing the
    //reference of the first element in it

    println(listOfList.flatten().joinToString()) // this will just separate by comma(,)

    println(listOfAny.flatMap { listOf(it) })
    val joinToListBuffer = StringBuffer("List is -> ")
    println(listOfList.flatten().joinTo(joinToListBuffer)) //this string buffer will be appended to the list
    println(
        listOfList.flatten().joinToString(separator = ",", prefix = "the number are -> ", postfix = ": that's all")
    ) // we can choose to skip any parameter
    //prefix will be added in front of the list, not each item, similarly postfix

    //we can also specify the limit and truncation of the array

    val numbers = (1..1000).toList()
    println(numbers.joinToString(limit = 20, truncated = "<...>"))

    //we can also manipulate each element in the joinToString method
    println(numbers.joinToString { "$it is the number" })

    val set  = listOf("Abhishek",1, 1L, 1.0, 'c')
    println(set.joinToString { when(it){
        is Int -> " $it is a number"
        is String -> "$it is a String"
        is Long -> "$it is a Long"
        is Char -> "$it is a char"
        is Float -> "$it is a Float"
        else -> "unknown"
    } })

    val routeList = listOf<Route>(
        Route("A", Location("12", "17")),
        Route("B", Location("14", "19")),
        Route("C", Location("16", "21")),
        Route("D", Location("18", "23"))
    )
    val patter = routeList.drop(1).flatMap { listOf("${(it.location.lat)}, ${it.location.long}")}.joinToString("|")
    println(patter)
}

data class Route(
    val name: String,
    val location: Location
)

data class Location(
    val lat: String,
    val long: String
)