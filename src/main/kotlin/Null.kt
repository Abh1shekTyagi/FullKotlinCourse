fun main(){
    val text : Int? = null
    val anotherText = text ?: "The text is null"
    print(anotherText)
}

//all null classes are the child classes of non-nullable classes.