package basics

fun main(args: Array<String>) {
    //we can specify specific type also like , intArrayOf, floatArrayOf,  etc
    val simpleArray = arrayOf("abhishek", "tyagi", "is", "my", "name")
    val intArray = floatArrayOf(1f, 2f, 3f)
    val arraySize = simpleArray.size
    print(simpleArray[4])
    intArray.get(0)
    intArray.elementAt(0)

    val matrix: Array<IntArray> = arrayOf(intArrayOf(1,2,3), intArrayOf(1,3,6))

    //array with different data types
    val arrayWithDifferentDT = arrayOf("abhishek", '1', 5)
    for (i in arrayWithDifferentDT) {
        print(i)
        when (i) {
            is Int -> println("$i is int")
            is String -> println("$i is string")
            is Char -> println("$i is a char")
            else -> print("unknown data type")
        }
    }
}