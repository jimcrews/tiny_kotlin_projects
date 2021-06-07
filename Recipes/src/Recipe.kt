data class Recipe(val title: String, val isVegetarian: Boolean)

fun main(args: Array<String>) {
    val r1 = Recipe("Thai Curry", false)
    val r2 = Recipe("Thai Curry", false)
    val r3 = r1.copy(title = "Chicken Bhuna")

    println("r1 hash: ${r1.hashCode()}")
    println("r2 hash: ${r2.hashCode()}")
    println("r3 hash: ${r3.hashCode()}")

    println("r1 to string: ${r1.toString()}")

    println("r1 == r2 ? ${r1 == r2}") // true due to objects having matching values
    println("r1 === r2 ? ${r1 === r2}") // false due to referring to separate objects
    println("r1 == r3 ? ${r1 == r3}")

    val (title, isVeg) = r1
    println("title is $title and vegetarian is $isVeg")
}