package oops

//singleton is a design patter in kotlin
fun main() {
    //since the constructor is private we can not create Database() class object
    //So we use a method of the class that returns the instance of the class object everytime
    //so there will always be only one instance of the Database class
    val db1 = DataBase.getInstance()
    val db2 = DataBase.getInstance()

    println(db1)
    println(db2)

    val db = DB
    db.context = 0//set my context here
    val db3 = DB

    //now DB is a singleton object with more concise code
    println(db)
    println(db3)
    println(db.doSomething())

}

class DataBase private constructor() {
    companion object {
        private var instance: DataBase? = null

        init {
            println("How many times will it run?") //just once
        }

        fun getInstance(): DataBase? {
            if (instance == null) instance = DataBase()
            return instance
        }
    }
}

//shorter way to do the same thing

object DB {
    //we can not write companion object here since this is the companion object in itself
    var context: Int = 0

    init {
        println("Instance Created") //this will also run once only
    }

    fun doSomething() {
        println("Printing here")
    }
}