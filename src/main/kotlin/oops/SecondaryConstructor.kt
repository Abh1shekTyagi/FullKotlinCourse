package oops

fun main() {
    val myOffice = Office()
    val herOffice = Office("Kitchen")
    val friendsOffice = Office("Road", "Delhi")
}


class Office(val name: String, val location: String, val pin: Int, val country: String = "Unknown") {
    constructor() : this("UNKNOWN", "UNKNOWN", 0)
    constructor(name: String) : this(name, "UNKNOWN", 0){
        println("Second constructor")
    }

    constructor(name: String, location: String) : this(name, location, 0)
}


//no need for constructors we can just use default values
class Home(val name: String = "UNKNOWN", val location: String = "UNKNOWN", val pin: Int = 0, val country: String = "Unknown") {
}