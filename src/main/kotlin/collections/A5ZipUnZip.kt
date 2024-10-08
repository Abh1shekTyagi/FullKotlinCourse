package collections

// Zip is used to create pairs from two different lists


fun main(){
    val names = listOf("Abhishek", "Mayank", "Ankita", "Payal", "Arjun")
    val classes = listOf("X", "IX", "X", "X", "IX", "NA")

    println(names.zip(classes)) // will zip classes with names(Abhishek, X)
    println(classes zip names) //will zip names with classes ( X, Abhishek)
    //it creates pairs sequentially and left the remaining part if the array can not be formed, eg "NA" is left

    val zipList = names zip classes
    println(zipList)

    //we can also unzip the pairs array
    val pair: Array<Pair<Int,Long>> = arrayOf(1 to 24, 2 to 23, 3 to 43, 432 to 53)
    val firstPairList = pair.unzip().first
    val secondPairList = pair.unzip().second.toLongArray()
    val (keys, values) = pair.unzip() //we can do like this also.

    println(pair.unzip()) //it will split into two pair, list of first pair and list of second pair.
    println(firstPairList.joinToString())
    println(secondPairList.contentToString())


}