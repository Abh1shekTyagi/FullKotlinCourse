package collections

//used to store key value pairs
//in maps the keys are a set and last duplicate key's value is overridden since key is using hash internally

fun main(){
    val immutableMap = mapOf(1 to "abhishek", 22 to "tyagi", 22 to "name")
    immutableMap.forEach { (t, u) -> println("key is $t and value is $u") }


    val mutableMap = mutableMapOf(1 to "abhishek")
    mutableMap[23] = "tyagi"
    mutableMap[42] = "tyagi"

    mutableMap.forEach { (t, u) -> println("[$t] = [$u]") }
}