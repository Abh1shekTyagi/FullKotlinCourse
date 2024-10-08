package oops

fun main(){
    val user = User("abhishek", 25, "Tyagi" )
}
class User(nameParam: String = "", val age: Int = 0, val lastName: String = "" ) {
    private val name : String //note that the name is val here and still
    // able to assign the value in init block
    //init blocks run sequentially and before instantiation.
    init{
        if(nameParam.lowercase().startsWith('a')) this.name = nameParam
        else this.name = "User"
    }
    init {
//        this.name = if(nameParam.lowercase().startsWith('a')) nameParam else "User"
    }
}