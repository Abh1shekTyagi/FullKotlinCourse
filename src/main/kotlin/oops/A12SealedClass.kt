package oops

//We use sealed classes when there is a fixed set of possibilities.
//We can not use enum class because they can not have properties of their own,
// the enum class has the property and not the individual objects in the enum class

enum class ApiResponse{
    SUCCESS,
    ERROR // we can not define resolvable /non resolvable errors
}

fun main(){
    val failureSuccess = Result.Failure.Success(ApiResponse.SUCCESS)
    val failureError = Result.Failure.Error(ApiResponse.ERROR)
    val success = Result.Success("This is result success")
    val progress= Progress("this is progress outside the result")
    //val failure = Result.Failure("This is result failure") -> sealed class can not be instantiated
    //val result = Result("this is result") -> can not be instantiated
    val notInherited = Result.NotInherited()

    val list = listOf(failureSuccess, failureError, success, progress)
    for(item in list) getData(item)

    val anotherList = listOf(failureSuccess, failureError, success, progress, notInherited)
    for(item in anotherList) sealedWithAny(item)

}

fun getData(result: Result){
    when(result){
        is Progress -> result.printMessage()
        is Result.Failure.Error -> result.printMessage()
        is Result.Failure.Success -> result.printMessage()
        is Result.Success -> result.printMessage()
        else -> {}
    }
}

fun sealedWithAny(item: Any){
    when(item) {
        is Progress -> item.printMessage()
        is Result.Failure.Error -> item.printMessage()
        is Result.Failure.Success -> item.printMessage()
        is Result.Success -> item.printMessage()
        else -> println("Unknown type")
            //item.printMessage() won't work here
    }
}

sealed class Result(private val message: String){


    fun printMessage(){
        println(message)
    }
    class Success(message: String): Result(message){

    }
    sealed class Failure(message: String): Result(message) {
        class Success(apiResponse: ApiResponse): Failure(apiResponse.name){
        }
        class Error(apiResponse: ApiResponse): Failure(apiResponse.name){

        }
    }

    class NotInherited(){
        //just a inner class
    }
}


//sealed class child can be outside the sealed class body too.
class Progress(input: String): Result(input){

}