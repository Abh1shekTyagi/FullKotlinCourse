package basics

fun main() {
    var text: String? = null
    val text2: String? = null
    //we can try let and run also
    text = text?.let { "let" } ?: run { "run" }
    text = text?.let { "let" } ?: "without run" // we can not put run as well, what is the difference then?
    val anotherText = text2 ?: "The text is null"
    print(anotherText)
}

//all null classes are the child classes of non-nullable classes.