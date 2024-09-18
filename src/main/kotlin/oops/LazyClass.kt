package oops


//lazy initialisation is used when creating an object is expensive(will take sometime and memory)
fun main(){

    val lazyClass = LazyClass("Abhishek") //initialised instantly
    val lazy2 by lazy {
        LazyClass("Tyagi") //will be initialised when the lazy2 is used
    }
    lazy2.printSomething() //here lazy2 will be initialised
}

private class LazyClass(val name: String){

    fun printSomething(){
        println("Something")
    }
    init {
        println("Username: $name")
    }
}
