package collections

//Returns a list containing only elements matching the given predicate.
fun main(){
    val list = listOf("Abhishek","Tyagi","jee")
    println(list.filter { it.length > 4 })

    val map = mapOf( 1 to "abhishek", 2 to "tyagi")
    println(map.filter { it.key % 2 == 0 })

    //we can also use filter not
    println(list.filterNot { it.length > 4 })

    //we can also use filter with index
    println(list.filterIndexed(predicate = { index, s -> index !=0 }))

    //we can also use it for generics type by using
    val genList = listOf("abhishek",1, 'c', 'd','e','f')
    println(genList.filterIsInstance<Char>())
}