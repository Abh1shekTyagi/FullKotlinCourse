package oops


//Inner Classes:
//Declared with the inner keyword.
// They have access to the outer class's members and hold a reference to the outer class instance.
//used when there is a tight coupling with outer and inner class
//Kotlin distinguishes between nested classes and inner classes:
//Nested class do not have access to the outer class member or functions
//inner class holds a reference to the outer class and can access its members and functions
//eg: BinaryTree(inner class Node), Collection(inner class Iterator)
fun main() {

    val list = arrayOf("Abhishek", "tyagi", "is", "my", "name")
    ListView(list = list).ListViewItem().displayItem(1)
//    ListView.ListViewItem -> we can access inner class like this.
}

class ListView(val list: Array<String>) {
    inner class ListViewItem {
        fun displayItem(position: Int) {
            println("Item at position $position is ${list[position]}")
        }
    }
    //since the inner class reference is accessible from the instance of outer class so there is no
    //companion object here because companion object defines the static members.
    //but if we remove the inner keyword then we can define companion objects.
    //we can not define companion object here. because the inner class is accessible directly from
    //outer class reference without instantiating.
}