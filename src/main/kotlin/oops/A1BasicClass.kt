package oops

fun main(){
    val myCar = Car()
    myCar.name = "Maybach"
    myCar.model = "S 680 4MATIC"
    myCar.color = "Blue"
    myCar.doors = 4

    myCar.move()
    myCar.stop()


    val herCar = Car()
    herCar.name = "UNKNOWN"
    herCar.model = "UNKNOWN"
    herCar.color = "UNKNOWN"
    herCar.doors = 4

    herCar.stop()
}


//Since this is a blueprint the properties will change for each object
class Car{
    //properties
    var name = "" // has to be initialised
    var model = ""
    var color = ""
    var doors = 0

    fun move(){
        println("The car is moving now")
    }

    fun stop(){
        println("The car has stopped now")
    }
}