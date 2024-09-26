package collections

//it separates the predicate true and false into two separate lists
//true predicate list, false predicate list
fun main(){
    val pair = listOf( 1,2,3,4,5,6,7,8,9,10)
    val (even, odd) = pair.partition { it % 2 == 0 }
    val (match, notMatch) = pair.partition { it % 4 ==0 }
    println(even)
    println(odd)

    println(match)
    println(notMatch)
}