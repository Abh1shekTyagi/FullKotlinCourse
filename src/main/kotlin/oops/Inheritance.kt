package oops


//Inheritance is a concept in kotlin in which you can create a class using another class
//meaning you will get all the functions and properties that the class already has and you can add more
//function that are specific to the new class

//new class is called the child class
//Old class is called the inherited class, parent class or supper class

//the goal is to remove the duplicate code and promote re-usability
fun main(){

    // car can not be of type Bike or Airplane
    val car = Vehicle("Car")
    val airplane = Airplane("airplane", "Red and Green",4)

    //    bike.testing() -> we created a child class but changed it to parent class so testing is not accessible
    val bike: Vehicle = Bike("BMW", "Black", 1)
    val bike2 = Bike("Audi", "Black",1)

    bike.move()
    bike.stop()
    bike.root()

    car.move()
    car.stop()
    car.root()


    airplane.move()
    airplane.stop()
    airplane.testing()

    airplane.justCallSuper() //we can call parent method also from child


    val list = listOf(airplane,bike2) //converted it into vehicle class

    for ((i,vehicle) in list.withIndex()){
        when(vehicle){
            is Bike -> {println("$i'th item is a Bike")}
            is Airplane -> {
                println("$i'th item is an airplane")
            }
        }
    }
}



//parent class, we have to use open keyword to make this class inheritable
open class Vehicle(val name: String){

    //we have to use open keyword to let the child override this method. Note if there is a same name
    //function in child and parent it should either be private or kotlin won't allow that.
    open fun move(){
        println("$name is moving")
    }
    open fun stop(){
        println("$name has stopped")
    }

    open fun justCallSuper(){
        println("Super of parent is called")
    }

    private fun testing(){

    }

    fun root(){
        println("This is the parent class method")
    }
}


//we can not have same name properties or functions in the child class, unless it is private in parent class.
private class Bike(nameParams: String, val color: String, val engines: Int): Vehicle(nameParams){

    //we have to user override to use the parent class method.
    override fun move(){
        println("The Bike is riding")
    }

    override fun stop(){
        println("Bike has stopped")
    }
    fun testing(){ //this is allowed since testing is private in parent class.
        println("This is the child class method")
    }

}

private class Airplane(nameParams: String, val color: String, val engines: Int):Vehicle(nameParams){
    override fun move(){
        println("The Airplane is flying")
    }

    override fun stop(){
        println("Airplane has landed")
    }

    fun testing(){ //this is allowed since testing is private in parent class.
        println("This is the child class method")
    }

    override fun justCallSuper() {
        println("child justCallSuper is called.")
        super.justCallSuper()
    }
}