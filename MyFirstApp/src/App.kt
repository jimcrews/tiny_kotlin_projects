// You can put your main() into a class with a companion object and make it static using the JvmStatic annotation.
// Therefore your class name is the one you chose
//
// Or, don't put main into a class, and the class name is derived from your filename with Kt appended
//

class HelloKotlin {

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            println("Kotlin main is running here!")

            //testForIn()
            //testWhile()
            phraseOMatic()
        }

        private fun testForIn() {
            for (i in 1..10) {
                print("$i ")
            }
        }

        private fun testWhile() {
            var x = 5
            while (x < 10) {
                x = ++x
                print("x is now $x. ")
            }
            println("The while has finished. x = $x")
        }

        private fun phraseOMatic() {
            val wordArray1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")

            val wordArray2 = arrayOf("empowered", "leveraged", "aligned", "targeted")

            val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

            val arraySize1 = wordArray1.size

            val arraySize2 = wordArray2.size

            val arraySize3 = wordArray3.size

            val rand1 = (Math.random() * arraySize1).toInt()

            val rand2 = (Math.random() * arraySize2).toInt()

            val rand3 = (Math.random() * arraySize3).toInt()

            val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"

            println(phrase)
        }
    }

}