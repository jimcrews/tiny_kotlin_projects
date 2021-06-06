fun main(args: Array<String>) {

    val animals = arrayOf(Hippo(), Wolf())
    for(item in animals) {
        item.roam()
        item.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()

    vet.giveShot(wolf)
    vet.giveShot(hippo)

    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamables) {
        item.roam()
        if (item is Animal) {
            item.eat()
        }
    }

    // the animal is roaming
    // the hippo is eating grass

    // the Canine is roaming
    // the wolf is eating meat

    // The vehicle is roaming
}