package Generics

//Since generics are erased at run time, it is a compile time feature only.
//We can not check for specific generic type at run time
//eg ->
// if (item is T) // we can not do like this since it will be erased at run time.

//but we can make them to not be erased by using inline and reified keywords


//let's say we want to get the specified type of elements from a list we can do that like this.
//we can not use inline and reified with class
inline fun< reified T> getSpecifiedTyped(list: List<Any>): List<T> {
    val specifiedList = mutableListOf<T>()
    list.forEach{
        if (it is T) specifiedList.add(it)
    }
    return specifiedList
}

fun main(){
    val mixedList = listOf('a',1,23,"Abhishek",'b')
    println(getSpecifiedTyped<Int>(mixedList))//prints list of int
    println(getSpecifiedTyped<Char>(mixedList))//prints list of char
}