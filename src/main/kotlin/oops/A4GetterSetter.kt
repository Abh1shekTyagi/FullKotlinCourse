package oops

fun main(){
    val newClass = MyClass(4)
}

private class MyClass(rollNumberParam: Number){
    //lateinit is a way to tell the compiler that you will have a value at run time so please skip null at compile time
    private lateinit var number: String //can not be used with primitive data types
    // but can be used with only string primitive  and other types
    var rollNumber = rollNumberParam //we use filed for setter and getter
        set(value) {
            println("This is the value $value")
            field = value //filed is special identifier to break
            // the recursive loop if we make rollNumber = value
        }
        get() {return field} // this is already created by kotlin so no need to write by ourselves
}