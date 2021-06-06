// If a superclass is marked as abstract, you don’t need to declare that it’s open.

// An abstract class can contain abstract and non-abstract properties and
//  functions. It’s possible for an abstract class to have no abstract members.

// Abstract properties and functions don’t need to be marked as open.

// If you put even one abstract property or function in a class, you have to
//  mark the class as abstract or your code won’t compile.

// The first concrete class in the inheritance tree below the abstract superclass
//  must implement all abstract properties and functions

// With abstract subclasses, you have a choice: you can either implement the
//  abstract properties and functions, or pass the buck to its subclasses.

abstract class Animal: Roamable {
    abstract val image :String
    abstract val food :String
    abstract val habitat :String
    val hunger = 10

    abstract fun makeNoise()
    abstract fun eat()

    override fun roam() {
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

abstract class Canine: Animal() {
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