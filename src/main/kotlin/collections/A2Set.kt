package collections

import oops.User

//set can only include unique values
//we can not use indexes to access or add elements because underneath it is using hashing.
fun main(){
    val immutableSet = setOf("Abhishek","is","my","first","name","and","my","last","name","is","tyagi")
    println("$immutableSet")

    val mutableSet = mutableSetOf("Abhishek")
    mutableSet.add("tyagi")
    mutableSet.remove("tyagi")
    mutableSet.remove("someindex")//we can not use index like list here

//    mutableSet.get(0) //we can not get items like this also
    mutableSet.forEach{}


    val user = User(lastName = "Abhishek")
    val user1 = User(lastName = "tyagi")
    val user2 = User(lastName = "tyagi")

    val userSet = setOf(user,user1,user2)

    userSet.forEach {
        println(it.lastName) //this will print 3 items because user class equalsTo method is not overridden
    }
    //if it were a data class then we would have got only distinct items
}