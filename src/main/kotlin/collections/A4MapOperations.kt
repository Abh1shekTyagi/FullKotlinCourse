package collections

//map is a transformation function used to transform a collection
//and transformation functions are lambda functions, it transforms each value of the collection
//it returns a new list after transforming the elements from the original collection

fun main() {
    val set = setOf(1, 2, 3, 4, 5, 6)
    print(set.map { it * 10 })
    println()
    print(set.map { it }) //original value is not changed
    println()

    //We can use index in map when transforming a set, we can also use List
    set.mapIndexed { index, i -> print("$index , $i") }

    val map = mapOf(1 to "abhishek", 2 to "tyagi")
    println()

    print(map.map { Pair(it.key * 10, it.value) }) // we can access both the key and values
    //[(10, abhishek), (20, tyagi)]
    println()
    print(map.mapKeys {
        Pair(
            it.key * 100,
            it.value
        )
    }) // we can access the keys separately, we can also access values inside
    //{(100, abhishek)=abhishek, (200, tyagi)=tyagi}

    println()
    print(map.mapValues {
        Pair(
            it.key * 40,
            it.value
        )
    }) // we can access the values separately, we can also access keys inside
    //{1=(40, abhishek), 2=(80, tyagi)}
    println()

    //check the output once, it is quite interesting

    val mapKeys = map.mapKeys { it.key * 10 } // creates a new map with specified keys
    //{10=abhishek, 20=tyagi}
    val mapValues = map.mapValues { it.value.uppercase() } // creates a new map with specified values
    //{1=ABHISHEK, 2=TYAGI}
    print(mapKeys)
    println()
    println(mapValues)
}