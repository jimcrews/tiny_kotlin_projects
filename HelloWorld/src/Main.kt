import com.rsk.Person

fun main(args: Array<String>)
{
    println("Hello World")

    val kevin = Person(name = "Kevin")


    println("Hello ${kevin.name}")
    kevin.display()
    kevin.displayWithLambda(::printName) // pass a function reference
}

fun printName(name: String) {
    println(name)
}