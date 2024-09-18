
fun main() {
    stringReference()
    numberReference()
    characterReference()
    booleanReference()
    arrayReference()
}

fun arrayReference(){
    val twoDArray = Array(4) { i -> IntArray(5) { j -> (i * 5) + 1 + j } }
    val intArray = IntArray(4) //initialised to 0
    val intArray1 = Array<Int>(4){2}
    println(twoDArray.contentDeepToString())
    println(intArray.contentToString())
    println(intArray1.joinToString())
}

fun booleanReference(){
    val myBoolean: Boolean = false
    println("Boolean is $myBoolean")
}
fun characterReference(){
    val myCharValue = 'a'
    println("my character is $myCharValue")
    val myString = "Abhishek Tyagi"
    for (char in myString){
        println(char)
    }
    myString.map {
        println(it)
    }
}

fun numberReference(){
    val number = 22

    val maxByteValue = Byte.MAX_VALUE
    val minByteValue = Byte.MIN_VALUE
    val bytesInByte = Byte.SIZE_BYTES
    println("The max byte value is $maxByteValue and min byte value is $minByteValue and number of bytes are $bytesInByte")
    //The max byte value is 127 and min byte value is -128 and number of bytes are 1

    val maxShortValue = Short.MAX_VALUE
    val minShortValue = Short.MIN_VALUE
    val byteInShort = Short.SIZE_BYTES
    println("The max short value is $maxShortValue and short byte value is $minShortValue and number of bytes are $byteInShort")
    //The max short value is 32767 and short byte value is -32768 and number of bytes are 2

    val maxIntegerValue = Int.MAX_VALUE
    val minIntegerValue = Int.MIN_VALUE
    val bytesInInteger = Int.SIZE_BYTES
//    number = 2147483648 -> this will give an error as max value stored can be 2147483647
    println("The max int value is $maxIntegerValue and min int value is $minIntegerValue and number of bytes are $bytesInInteger")
    //The max int value is 2147483647 and min int value is -2147483648 and number of bytes are 4

    val maxLongValue = Long.MAX_VALUE
    val minLongValue = Long.MIN_VALUE
    val bytesInLong = Long.SIZE_BYTES
    println("The max Long value is $maxLongValue  and min Long value is $minLongValue and number of bytes are $bytesInLong")
    //The max Long value is 9223372036854775807  and min Long value is -9223372036854775808 and number of bytes are 8

    val maxFloatValue = Float.MAX_VALUE
    val minFloatValue = Float.MIN_VALUE
    val bytesInFloat = Float.SIZE_BYTES
    println("The max float value is $maxFloatValue  and min float value is $minFloatValue and bytes are $bytesInFloat")
    //The max float value is 3.4028235E38  and min float value is 1.4E-45 and bytes are 4

    // type     size(bits)          significant(bits)        Exponent(bits)          decimal(digits)
    // Float    32                  24                          8                       6-7
    // Double   64                  53                          11                      15-16

    val maxDoubleValue = Double.MAX_VALUE
    val minDoubleValue = Double.MIN_VALUE
    val bytesInDouble = Double.SIZE_BYTES
    println("The max double value is $maxDoubleValue  and min double value is $minDoubleValue and bytes are $bytesInDouble")
    //The max double value is 1.7976931348623157E308  and min double value is 4.9E-324 and bytes are 8

    val unsignedInt = 22u //it is by default unsigned int
    val unsignedLong: ULong = 22u
}

fun stringReference(){
    val name = "Abhishek"
    var canBeChangedLater = "temp"
    println("$canBeChangedLater is this")
    canBeChangedLater = "something else"
    println("Hello $name !")
    println("now the value is $canBeChangedLater")
}