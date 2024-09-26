package basics

fun main(args: Array<String>){
    val simpleArray = arrayOf("abhishek","tyagi","is","my","name")
    val arraySize = simpleArray.size
    print(simpleArray[4])


    //array with different data types
    val arrayWithDifferentDT = arrayOf("abhishek", '1', 5)
    for(i in arrayWithDifferentDT){
        print(i)
        when(i){
            is Int -> println("$i is int")
            is String -> println("$i is string")
            is Char -> println("$i is a char")
            else -> print("unknown data type")
        }
    }
}