package oops

fun main(){

    val myCar = Carr("Mercedes-Benz", "Maybach", "    Blue    ", 4)
    val herCar = Carr("UNKNOWN", "UNKNOWN", "UNKNOWN", 3)

    println(myCar.joinToString())
    println(herCar.contentToString())
    println(herCar.toString())
}


//we can make param to a property by using var or val
//When to use property and when to use param in the constructor
// to validate and then assign a value to the property use param
class Carr(val name: String, modelParam: String, colorParam: String, doorsParam: Int){
    val model = modelParam //property
    val color = colorParam.trim() // here we are making the input
    // a valid input and then assigning it to the property
    val doors = doorsParam

    fun joinToString(): String{
        return "name = ${this.name}, model = ${this.model}, color = ${color}, doors = $doors"
    }
}

fun Carr.contentToString(): String{
    return "name = ${this.name}, model = ${this.model}, color = ${color}, doors = $doors"
}