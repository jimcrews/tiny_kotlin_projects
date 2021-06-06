// To use a class as a superclass, it must be declared as open. Everything you
//  want to override must also be open.

open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    val hunger = 10

    open fun makeNoise() {
        println("the animal is making a noise")
    }
    open fun eat() {
        println("the animal is eating")
    }
    open fun roam() {
        println("the animal is roaming")
    }
    fun sleep() {
        println("the animal is sleeping")
    }
}

class Hippo : Animal() {
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("grunt grunt")
    }
    override fun eat() {
        println("the hippo is eating $food")
    }
}

open class Canine: Animal() {
    override fun roam() {
        println("the Canine is roaming")
    }
}

class Wolf: Canine() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("howl")
    }
    override fun eat() {
        println("the wolf is eating $food")
    }
}