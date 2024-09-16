fun main(){
    var stringValue: String = "Something"
    println(stringValue.something())
    stringValue = "not Something"
    println(stringValue.something())
}


fun String.something(): Boolean{
    return this == "Something"
}