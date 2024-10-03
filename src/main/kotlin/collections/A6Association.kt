package collections

//Associations allow us to create maps from a collection and associate certain values and keys to each other
//this can be used to create a map from a list of data item and associate them with the unique key

fun main() {
    val list = listOf("Abhishek", "tyagi", "is", "tall")

    println(list.associateWith { it.length })
    println(list.associateBy { it.first().uppercase() }) //since this is map duplicate keys are not allowed
    println(
        list.associateBy(
            keySelector = { it.first().uppercase() },
            valueTransform = { it.length })
    ) //we can define what to use for key and what to use for value


    val listOfResponse = listOf(
        ApiResponse(1L, "moon Api", "Success"),
        ApiResponse(2L, "moon Api", "Success"),
        ApiResponse(3L, "moon Api", "Success"),
        ApiResponse(4L, "Spot Api", "Success"),
        ApiResponse(5L, "moon Api", "Success"),
        ApiResponse(6L, "moon Api", "Success")
    )

    val mapOfResponse = listOfResponse.associateBy { it.id }
    val mapOfResponseTransformation = listOfResponse.associateBy(keySelector = { it.api }, valueTransform = {it.response })
    println(mapOfResponse)
    println(mapOfResponseTransformation)
}

data class ApiResponse(val id: Long, val api: String, val response: String)