package collections

//map is a transformation function used to transform a collection
//and transformation functions are lambda functions, it transforms each value of the collection
//it returns a new list after transforming the elements from the original collection

fun main(){
    val set = setOf(1,2,3,4,5,6)
    println(set.map { it * 10})
    println(set.map { it }) //original value is not changed

    //We can use index in map when transforming a set, we can also use List
    set.mapIndexed { index, i -> println("$index , $i") }

    val map = mapOf(1 to "abhishek", 2 to "tyagi")

    println(map.map { Pair(it.key * 10 , it.value)}) // we can access both the key and values
    println(map.mapKeys { Pair(it.key * 100 , it.value)}) // we can access the keys separately, we can also access values inside
    println(map.mapValues { Pair(it.key * 40 , it.value)}) // we can access the values separately, we can also access keys inside

    //check the output once it is quite interesting

    val mapKeys = map.mapKeys { it.key* 10 } // creates a new map with specified keys
    val mapValues = map.mapValues { it.value.uppercase()} // creates a new map with specified values
    println(mapKeys)
    println(mapValues)
}