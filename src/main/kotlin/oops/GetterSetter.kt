package oops

fun main(){
    val newClass = MyClass(4)
}

private class MyClass(rollNumberParam: Number){
    private lateinit var number: String //can not be used with primitive data types
    // but can be used with only string primitive  and other types
    var rollNumber = rollNumberParam
        set(value) {
            println("This is the value $value")
            field = value //filed is special identifier to break
            // the recursive loop if we make rollNumber = value
        }
        get() {return field} // this is already created by kotlin so no need to write by ourselves
}