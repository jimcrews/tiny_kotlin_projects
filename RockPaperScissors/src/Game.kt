fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userInput = getUserChoice(options)
    printResult(userInput, gameChoice)
}

fun getGameChoice(choice: Array<String>): String {
    val ranIdx = (Math.random() * choice.size).toInt()
    return choice[ranIdx]
}

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""

    while (!isValidChoice) {
        println("please choose from:")
        for(item in optionsParam) {
            print(" $item")
        }
        print(": ")

        val userInput = readLine()

        // validate
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }
        if (!isValidChoice) {
            println("You must enter a valid choice")
        }

    }
    return userChoice


}

fun printResult(playerChoice: String, computerChoice: String) {

    val result: String

    if (playerChoice == computerChoice) {
        result = "Tie !"
    }

    else if ((playerChoice == "Rock" && computerChoice == "Scissors") ||
        (playerChoice == "Paper" && computerChoice == "Rock") ||
        playerChoice == "Scissors" && computerChoice == "Paper") {
        result = "You Win !"
    } else {
        result = "You Lose !"
    }

    println("You chose $playerChoice, Computer chose $computerChoice. $result")
}