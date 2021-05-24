package com.rsk

class Person( var name: String) {
    fun display()
    {
        println("display $name")
    }

    fun displayWithLambda(func: (s:String) -> Unit) // Unit means 'Void'
    {
        func(name)
    }
}