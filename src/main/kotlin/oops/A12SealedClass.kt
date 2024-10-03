package oops

//We use sealed classes when there is a fixed set of possibilities.
//We can not use enum class because they can not have properties of their own,
// the enum class has the property and not the individual objects in the enum class

enum class ApiResponse{ //all are of same type
    SUCCESS,
    ERROR // we can not define resolvable /non resolvable errors
}

fun main(){
    val failureSuccess = Result.Failure.HttpError(ApiResponse.SUCCESS)
    val failureError = Result.Failure.ServerError(ApiResponse.ERROR)
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
        is Result.Failure.ServerError -> result.printMessage()
        is Result.Failure.HttpError -> {
            result.printMessage()
            val error = Result.Failure.HttpError(ApiResponse.ERROR)
            error.print()
            error.apiResponse

        }
        is Result.Success -> result.printMessage()
        else -> {}
    }
}

fun sealedWithAny(item: Any){
    when(item) {
        is Progress -> item.printMessage()
        is Result.Failure.ServerError -> item.printMessage()
        is Result.Failure.HttpError -> item.printMessage()
        is Result.Success -> item.printMessage()
        else -> println("Unknown type")
            //item.printMessage() won't work here
    }
}

sealed class Result(private val message: String, ){

    //param is just a constructor parameter, and it is not stored as a field/property of the class.
    // It is only available during the execution of the constructor, not outside of it,
    // such as inside member functions.
    fun printMessage(){
        println(message) //if message was a param it wouldn't have been accessed here
    }
    class Success(message: String): Result(message){

    }
    sealed class Failure(messages: String): Result(messages) {
        class HttpError(val apiResponse: ApiResponse): Failure(apiResponse.name){
            fun print(){
                println("$apiResponse") //
            }
        }
        class ServerError(apiResponseParam: ApiResponse): Failure(apiResponseParam.name){

        }
    }

    class NotInherited(){
        //just an inner class
    }
}


//sealed class child can be outside the sealed class body too.
class Progress(input: String): Result(input){

}