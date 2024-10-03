package oops

//Structural equality vs referential equality

fun main(){
    val name = "Abhishek"
    val surname = "Tyagi"

    val friend = "Abhishek"

    val int1 = 5
    val int2 = 5

    val car = Carr("Abhishek", "Tyagi", "is", 1)
    val car2 = Carr("Abhishek", "Tyagi", "is", 1)
    val car3 = car


    println("name == Surname ${name == surname}") //structural quality
    println("name == friend${ name == friend }") //checks if the content inside is same

    println("name === surname ${name === surname}") //referential equality
    println("name === friend ${name === friend}") // checks if the reference of the variable is same. pointing to same memory

    //wonder: How the objects are allocated same memory if the content is same?
    println("car === car2 ${car === car2}") //-> false
    println("int1 === int2 ${int1 === int2}") // -> true so for primitive types only it does it and for string.
    println("car === car3 ${car === car3}") // -> true because the location is assigned and a new object is not created.

    println("car == car2 ${car == car2}") // -> false, you have to write the manual method to check this
    // -> true if you override the equals method of any class inside Carr class to check for content equality
    println(car.contentToString() === car2.contentToString()) // false
    println(car.contentToString() == car.joinToString()) //true,
    // Note contentToString is an extension function and joinToString is a class methods of Carr
    // Since this is a custom class and kotlin doesn't provide the definition by itself
    println(car.contentToString() == car.contentToString()) //true, we can use

    println("car.hashcode() == car2.hashCode() ${car.hashCode() == car2.hashCode()}") //true

    println("car is $car") // this will use toString overridden method

    //-------------------- this game changes in case of data classes --------------------->
    //we do not have to write equals, toString, hashCode by ourselves
    //make the class a data class and all methods are taken care of
    //Note: data classes can not have parameters Mobile(name:String, val model: String) -> name is not allowed
    //also if you define any property outside constructor then it will be skipped from all 3 methods.
    //eg: data class Mobile(val name: String){
    //              val color: String
    //}
    // println(iphone) -> it will print name only and not the color.

    val iPhone = Mobile("iPhone", "16 Pro Max", "mid night black", 80000)
    val android = Mobile("Google", "Pixel 8 Pro Max", "white", 80000)
    val android2 = Mobile("Google", "Pixel 8 Pro Max", "white", 80000)

    println("iphone == android ${iPhone == android}") //false
    println("android == android2 ${android == android2}") //true
    println(android)//toString()

}


data class Mobile(val name: String, val model: String, val color: String, val price : Int){
    val willNotBePrinted: String = "will not be printed when object is called"
    fun doSomething(){

    }
}