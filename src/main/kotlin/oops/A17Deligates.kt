package oops

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

//delegation means giving power from one class to another class
//It is generally used when inheritance starts to break
fun main(){

    val myApp = App("Abhishek")
    myApp.print() //from class App because we override it.
    myApp.printAll() //from class DelegateB
    myApp.someValue//since this is defined in the interface.
    //Note only interface methods are accessible and not other methods of class DelegatesA, B


    val lastLine = with(myApp){//using with we do not have to provide the context again in each line
        println(name)
        print()
        printAll()
        someValue //last line is the lambda which returns a value
    }

    println("last line is $lastLine") //prints the value of some value

    //we can also use delegate to access some other properties of the class
}

class FormattedDelegate(private var stringName: String): ReadWriteProperty<Any, String>{
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        return stringName
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        stringName = value.lowercase()
    }

}
class App(nameParam: String): A by DelegateA(), B by DelegateB(){ //we can not inherit from two classes,
    // but we can use delegate to
    //access the class implementation for specific interfaces.

    val name by FormattedDelegate(nameParam)
    override fun print() {
        //we can choose to override or just use them as it is from Delegate classes
    }
}
interface A{
    fun print()
}

interface B{
    val someValue: String
    fun printAll()
}

class DelegateA: A{
    override fun print() {
        //we define some code here for Delegate A
    }

    fun classAFun(){

    }
}

class DelegateB: B{
    override fun printAll() {
        //we define some code specific to Delegate B
    }

    override val someValue: String
        get() = "This is a variable test"
    fun classBFun(){

    }
}