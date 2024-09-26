package collections

//we can use + operator to add elements or list of elements to a list
//similarly for -

fun main(){
    val list = listOf(1,2,3,4,5)
    val plusList = list + 6 + listOf(7,8,9)
    println(plusList)
    val minusList = plusList - listOf(8,9,10)
    println(minusList)
}