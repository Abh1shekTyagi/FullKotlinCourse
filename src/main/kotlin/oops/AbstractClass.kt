package oops

//Abstract classes are similar to interfaces
//In abstract class we can declare properties that have value, in interfaces this can be achieved by providing
//access modifiers
//We can not create instances(objects) of abstract classes they are only made to inherit
//Abstract classes are used like interfaces when you define what but not how, how is defined in the child class
//We can only inherit from a single class but as many interfaces as we want.

//Question
//Where are abstract classes and interfaces use what how to choose?
fun main(){
    val fan = Fan("Abhishek")
    fan.move()
    fan.stop()
    fan.printText()
    fan.anotherProperty
    fan.text
    fan.name
}


abstract class AbstractClass(val text: String){
    val anotherProperty = "Some random text"

    abstract fun move() // we want the child class to define this so it has no body.
    abstract fun stop()

    fun printText(){
        println("The text is $text")
    }
}

class Fan(val name: String): AbstractClass(name){
    override fun move() {
        println("Move")
    }

    override fun stop() {
        println("Stop")
    }

}