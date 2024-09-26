package collections

//chunk converts the list into a list-of-list of size defined in a chunk
//drop will drop the elements in the list
//take will take the elements in the list
//slice will give the elements specified in the predicate.
//windows are like chunk but the window is created with respect to each element
//elementAt returns a value from specified index
//first() returns the first value, it can also take predicate and return the first value satisfying the predicate.
//last() returns the last value, it can also take predicate and return the last value satisfying the predicate
//random() return a random value from the list
//shuffle(), shuffles the list into a random looking list.//it is done in O(n) time, uses sequence and index generator to swap
fun main() {
    val numbers = listOf(10, 2, 3, 4, 5, 60, 70)
    val chunkedList = numbers.chunked(3) { it + List(3 - it.size) { 0 } }
    println(numbers.chunked(3) { it + List(3 - it.size) { 0 } })
    println(numbers.chunked(3))
    println(numbers.chunked(3){it.sum()}) //will sum all elements in the chunk and return a value, list of summed values

    println()

    println(numbers.windowed(3))//create windows of size 3 from each element
    println(numbers.windowed(3, 2))//create window for elements in step
    //Note: the last window is of size specified in window

    println()

    println(numbers.take(3)) //return a list that contains first 3 elements
    println(numbers.takeLast(4))//returns a list containing last 4 elements
    println(numbers.takeWhile { it % 2 == 0 })//Returns a list containing first elements satisfying the given predicate.
    println(numbers.takeLastWhile { it % 2 == 0 })//Returns a list containing last elements satisfying the given predicate.

    println()

    println(numbers.drop(3)) //Returns a list containing all elements except first n elements
    println(numbers.dropLast(3)) //Returns a list containing all elements except last n elements.
    println(numbers.dropWhile { it % 2 == 0 })//Returns a list containing all elements except first elements that satisfy the given predicate
    println(numbers.dropLastWhile { it % 2 == 0 })//Returns a list containing all elements except last elements that satisfy the given predicate.

    println()

    println(numbers.slice(1..3)) //Returns a list containing elements at indices in the specified indices range.
    println(numbers.slice(0..6 step 2))//Returns a list containing elements at specified indices.
    println(numbers.slice(setOf(2,3,5)))//Returns a list containing elements at specified indices


    println()

    println(numbers)
    println(numbers.elementAt(4))//returns an elements at index 4

    println(numbers.first()) //returns the first value
    println(numbers.first{it % 3 == 0})//returns the first predicate value

    println(numbers.last())//returns the last value
    println(numbers.last{it % 3 == 0})//returns the last predicate value

    println(numbers.random())//returns a random value from list
    println(numbers.random())//returns a random value from list

    println(numbers.shuffled())//shuffles the list
}