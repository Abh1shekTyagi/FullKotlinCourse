package collections

//Associations allow us to create maps from a collection and associate certain values and keys to each other

fun main() {
    val list = listOf("Abhishek", "tyagi", "is", "tall")

    println(list.associateWith { it.length })
    println(list.associateBy { it.first().uppercase() }) //since this is map duplicate keys are not allowed
    println(
        list.associateBy(
            keySelector = { it.first().uppercase() },
            valueTransform = { it.length })
    ) //we can define what to use for key and what to use for value

}