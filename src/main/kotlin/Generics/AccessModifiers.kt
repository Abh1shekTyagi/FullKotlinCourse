package Generics
//access modifier allows/restrict the access of the code
// there are 4 types of access modifiers in kotlin
// public

// internal -> Visibility Scope: The declaration is visible within the same module. A module is a set of Kotlin files compiled together (e.g., an IntelliJ IDEA module, a Maven project, a Gradle source set).
//Usage: Useful for encapsulating internal implementation details that should not be exposed outside the module. It strikes a balance between public and private.
internal class XYZ{

}

// protected:Visibility Scope: The declaration is visible within its class and subclasses.
//Usage: Primarily used in class hierarchies to allow subclasses to access certain members while keeping them hidden from other parts of the code.
//this is not allowed since protected can be only used inside a class
//protected class XYZ{
//
//}

// private

//Modifier	Class	Package	    Module	Subclass	World
//public	✔️	    ✔️	        ✔️	    ✔️	        ✔️
//internal	✔️	    ✔️	        ✔️	    ✖️	        ✖️
//protected	✔️	    ✖️	        ✖️	    ✔️	        ✖️
//private	✔️	    ✖️	        ✖️      ✖️	        ✖️