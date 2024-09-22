package oops


//Inner Classes:
//Declared with the inner keyword.
// They have access to the outer class's members and hold a reference to the outer class instance.
fun main(){

    val list = arrayOf("Abhishek", "tyagi","is","my","name")
    ListView(list = list).ListViewItem().displayItem(1)
}

class ListView(val list: Array<String>){
    inner class ListViewItem{
        fun displayItem(position: Int){
            println("Item at position $position is ${list[position]}")
        }
    }
}