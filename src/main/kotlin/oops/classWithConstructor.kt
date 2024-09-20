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

    override fun toString(): String {
        return "name = ${this.name}, model = ${this.model}, color = ${color}, doors = $doors"
    }

    override fun equals(other: Any?): Boolean {
        return when{
            other === this -> true //check if the object is checking for itself
            other is Carr -> this.toString() == other.toString()
            else -> false
        }
    }

    //when we override the equals method it is generally a good practice to override the hashcode method as well
    //since hashcode improves the performance in case of collections
    //when we create a collection of class Carr
    override fun hashCode(): Int {
        return name.hashCode() + model.hashCode() + color.hashCode() + doors.hashCode()
        //we can also use a unique identifier and if that is primitive use the hashcode of that property
    }
}


//if the Carr is private then we wont be able to write extension function for it. Damn
fun Carr.contentToString(): String{
    return "name = ${this.name}, model = ${this.model}, color = ${color}, doors = $doors"
}