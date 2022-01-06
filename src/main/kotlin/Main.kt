fun main() {
    var count = 10
    while (count > 0) {
        println("Count value is $count")
        count--
    }

    do {
        println("Generating random number")
        val randomNumber = (0..100).random()
        println("Random number is $randomNumber")
    } while (randomNumber > 50)
}