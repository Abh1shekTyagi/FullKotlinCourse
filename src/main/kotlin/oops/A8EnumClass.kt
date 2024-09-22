package oops

fun main() {
    for (direction in Directions.entries) //we can loop through the enum class
        println("Direction is $direction and angle is ${direction.angle}")

    println("We can also do ${Directions.EAST.name}")
    println("${Directions.NORTH.directionAngle()}")


    //enums with when statement
    val direction = Directions.EAST
    when(direction){
        Directions.NORTH -> {}
        Directions.SOUTH -> {}
        else -> {}
    }
}

enum class Directions(val angle: Int) {
    NORTH(0),  //these are the instances(object) of the class
    // Directions so if we have a properties
    //in the constructor then we have to call it at the time of creating the objects
    SOUTH(180),
    EAST(90),
    WEST(270) ; // we need to separate the enum with function by semicolon

    //we can also have functions
    fun directionAngle(){
        println("The angle for $this is $angle")
    }
}