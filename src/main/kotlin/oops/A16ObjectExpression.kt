package oops


//we will use object expression to make an anonymous class for the interface ClickListener
fun main(){

    val onClickListener = OnClickListener()
    //without anonymous class
    //we have to inherit the interface to create a class and then pass it as parameter
    val circularButton = Button("Send",34323,onClickListener)


    //with anonymous class
    val button = Button("Done", 12343, object : ClickListenerInterface{
        //we will override our own onclick method here, no need to create a class.
        override fun onClickA(inputParam: String) {
            println(inputParam)
        }

        override fun onClickB(inputParam: String) {
            println(inputParam)
        }
    })

    button.callBacks()

}

class OnClickListener(): ClickListenerInterface{
    override fun onClickA(inputParam: String) {
        println(inputParam)
    }

    override fun onClickB(inputParam: String) {
        println(inputParam)
    }

}
class Button(val text: String, val id: Int, private val clickListener: ClickListenerInterface ){
    fun callBacks(){
        clickListener.onClickA("String")
        clickListener.onClickB("String")
    }
}

interface ClickListenerInterface{
    fun onClickA(inputParam: String)
    fun onClickB(inputParam: String)
}
