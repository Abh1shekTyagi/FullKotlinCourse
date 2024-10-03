package collections

//There are two types of list, mutable -> can grow or shrink after instantiation
//Immutable -> the size doesn't change


fun main(){
    //Immutable
    val immutableList = listOf<String>("Abhishek", "Tyagi", "is", "my", "name")
    println("first element of immutableList is ${immutableList[0]}") //prone to index out of bound

    val mutableList = mutableListOf("Abhishek","tyagi","is","my","name")

    //we can add elements to mutable list
    mutableList.add("new")

    //we can remove elements from the list
    mutableList.removeAt(0) //using index
    mutableList.removeLast()  //using a method of the class
    mutableList.remove("my") //using an element itself



}