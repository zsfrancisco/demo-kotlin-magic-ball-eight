fun main() {
    printPhrase("Francisco Zambrano".randomCase())
}

fun String.randomCase(): String {
    val randomNumber = 0..99
    val randomResult = randomNumber.random()
    if (randomResult.rem(2) == 0) {
        return this.lowercase()
    }
    return this.uppercase()
}

fun printPhrase(phrase: String) {
    println(phrase)
}
