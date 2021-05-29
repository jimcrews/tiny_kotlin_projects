//
// You can define a property in the primary constructor by prefixing a parameter with val or var.
// You can define a property outside the constructor by adding it to the class body.
//
class Song(val title: String, val artist: String) {
    fun play() {
        println("Playing the song $title by $artist")
    }
    fun stop() {
        println("Stopped playing $title")
    }
}

class Dog(breed_param: String, val sex: String, weight_param: Int, val name: String) {

    // Initializer blocks run when an object is initialized.
    init {
        print("Dog $name has been created. ")
    }

    var activities = arrayOf("Walks") // public state
    val breed = breed_param.uppercase() // private state

    init {
        print("The breed is $breed \n")
    }

    // custom getters
    val weightInKgs: Double
        get() = weight / 2.2

    val isIntelligent: Boolean
        get() = breed in ("COLLIE")

    // custom setters
    var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }

    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}

fun main(args: Array<String>) {
    val songTwo = Song("song two", "SilverChair")
    songTwo.play()
    songTwo.stop()


    val myDog = Dog("Collie", "Male", 10, "Mitz")
    if (myDog.isIntelligent) println("${myDog.name} is Intelligent")
    myDog.bark()

    // use setter
    myDog.weight = 75
    println("Weight in Kgs is ${myDog.weightInKgs}")
    myDog.weight = -2 // won't get set by setter
    println("Weight is ${myDog.weight}")

    myDog.activities = arrayOf("Walks", "Fetching balls", "Frisbee")

    for (item in myDog.activities) {
        println("My dog enjoys $item")
    }
}