package oops

//Interfaces are used when you have commonly used behaviour shared among different classes
//But you don't want to provide the actual code for the methods and parameters
//The code is specific to each of the child class, so we use interface to instruct the child class what should be
//overridden

//We define what in an interface and how is implemented by the child class
//Interfaces can not be instantiated they are created to be inherited by other class

//In android, setOnClickListener is one of the example, text , image, button can implement what to do when it is clicked

fun main(){
    val car = Cars()
    car.startEngine()

    val airplane = Airplanes()
    airplane.startEngine()
}

interface Engine{
    fun startEngine()
}

class Cars(): Engine{
    override fun startEngine() {
        println("Car engine started")
    }

}

class Airplanes(): Engine{
    override fun startEngine() {
        println("Airplane engine started")
    }
}