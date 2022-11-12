//There are a couple of requirements for the Singleton design pattern:
//• We should have exactly one instance in our system.
//• This instance should be accessible from any part of our system.

object Singleton{

    init {
        println("Singleton class invoked.")
    }
    var variableName = "I am Var"
    fun printVarName(){
        println(variableName)
    }

}


class A {

    init {
        println("Class init method. Singleton variableName property : ${Singleton.variableName}")
        Singleton.printVarName()
    }
}