package basics

fun main(){
    var stringValue: String = "Something"
    println(stringValue.something())
    stringValue = "not Something"
    println(stringValue.something())


    val array = Array(5){i -> "$i"} //array of string
    someFunction(4,5, *array)

    println(getMax(25,3))
    println(getMax(23.1,23.3))


    defaultParamsFunction(nothing = "now something") //named parameter calling
    defaultValueFrmFunction()

}

//function with variable number of arguments.
fun someFunction(vararg dosome: Any){
    dosome.map {
        println(it)
    }
//    dosome.forEach {  }
}


//extension function
fun String.something() =  this == "Something"

//inline function
fun getMax(a: Int, b: Int) = if(a > b) a else b


//function overloading
fun getMax(a: Double, b: Double) = if(a > b) a else b // different data type
fun getMax(a: Double, b: Double, c:Double) = if( a > b) a else b //different number of arguments


fun defaultParamsFunction(something: String = "some", nothing: String = ""){
    println("This is the default param $something")
}

fun defaultValueFrmFunction(trying: String = getMyString()){//we can specify a function to return a value
    println(trying)
}

fun getMyString() = "something from the world"

