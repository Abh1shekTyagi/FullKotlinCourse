package collections

//Aggregates return a single value based on the collection content
//Sum() returns the sum of the list
//count() return the numbers in the list
//average(), returns the average
//min()
//max()
//sumOf{}, we can use the sum to further transform the value

//what is a selector?
//a selector typically refers to a function or a lambda expression that selects or extracts
// a specific property or value from an object

fun main() {
    val list = listOf(10, 2, 3, 4, 1, 6, 23, 7)
    println(list.sum())
    println(list.count())
    println(list.count { it % 2 == 0 })//count the elements satisfying the predicate.

    println(list.average())
    println(list.min())
    println(list.max())
    val people = listOf(
        Person("Alice", 29),
        Person("Bob", 31),
        Person("Charlie", 25)
    )
    println(people.minByOrNull { it.age })//takes a selector

    println(list.sumOf { it * 2 })
}

data class Person(val name: String, val age: Int)
