fun main() {
    val lotteryNumbers = listOf(11, 22, 43, 56, 70, 66)
    val numbersSorted = lotteryNumbers.sortedDescending()
    println("numbers sorted is $numbersSorted")

    val numbersSortedByMultiples = lotteryNumbers.sortedBy { number -> number < 50 }
    println("numbersSortedByMultiples is $numbersSortedByMultiples")

    val numbersShuffled = lotteryNumbers.shuffled()
    println("numbersShuffled is $numbersShuffled")

    val numbersReversed = lotteryNumbers.reversed()
    println("numbersReversed is $numbersReversed")

    val messages = lotteryNumbers.map { number -> "\n Your lottery number is $number" }
    println("messages $messages")

    val numbersFiltered = lotteryNumbers.filter { number -> number > 50 }
    println("numbers filtered are $numbersFiltered")
}