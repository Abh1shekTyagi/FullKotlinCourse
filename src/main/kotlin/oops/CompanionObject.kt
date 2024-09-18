package oops

fun main(){

    //companion object belongs to the class and, we  do not need an object
    //to call the methods or member we can do it directly on class
    //eg, Int.MAX_VALUE is also a class companion object value

    val userName = Users.name()
    println(Users.count)
}

private class Users{
    companion object{
        //class variables and class functions, they do not belong to the instance of the class
        //or the object of the class but to the class itself
        const val count = 24
        fun name(): String{
            return "Abhishek"
        }
    }
}