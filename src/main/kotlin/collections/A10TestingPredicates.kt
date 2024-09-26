package collections

//There are 3 functions that can be used to check predicates on the list and
//list will return true false based on the predicate
fun main(){
    val list = listOf(1,2,3,4,5,6,7,8,9)
    println(list.any { it % 8 == 0 })//true if any one element satisfy the value
    println(list.none { it % 8 == 10 }) //true if none satisfy the value
    println(list.all { it % 2 == 0 }) // true if all satisfy the predicate
}