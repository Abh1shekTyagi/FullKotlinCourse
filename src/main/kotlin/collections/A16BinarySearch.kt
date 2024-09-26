package collections

fun main(){
    val number = Array(10){it*2}
    println(number.contentToString())
    println(number.binarySearch(3))//if the element is found then returns the index otherwise it returns
    //the (-index - 1) when the element should have been in order to maintain the sorted order.
}