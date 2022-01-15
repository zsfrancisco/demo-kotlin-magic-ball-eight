const val AFFIRMATIVE_ANSWER = "✅"
const val NEGATIVE_ANSWER = "❌"
const val DOUBTFUL_ANSWER = "?"

val answers = mapOf(
    "Yes" to AFFIRMATIVE_ANSWER,
    "It's true" to AFFIRMATIVE_ANSWER,
    "Totally" to AFFIRMATIVE_ANSWER,
    "Undoubtedly" to AFFIRMATIVE_ANSWER,
    "Ask in an other moment" to DOUBTFUL_ANSWER,
    "I can't say you in this moment" to DOUBTFUL_ANSWER,
    "Maybe yes, or maybe not" to DOUBTFUL_ANSWER,
    "It's not going to happen" to NEGATIVE_ANSWER,
    "Do not count on it" to NEGATIVE_ANSWER,
    "Definitely not" to NEGATIVE_ANSWER,
    "I don't believe it" to NEGATIVE_ANSWER
)

fun main() {
    println(some("Francisco", "Zambrano"))
    while (true) {

        println("Hi, I'm your magic ball 8 created in Kotlin, which option do you want to run?")
        println("1. Ask a question")
        println("2. Check all of the answers")
        println("3. Exit")

        when (readLine()) {
            "1" -> askQuestion()
            "2" -> showAnswers()
            "3" -> {
                exit()
                break
            }
            else -> showError()
        }
    }
}

fun askQuestion() {
    println("What question do you want to ask?")
    readLine()
    println("So that's your question, the answer for it is: ")
    val answerGenerated = answers.keys.random()
    println(answerGenerated)
}

fun showAnswers() {
    println("Select an option")
    println("1. Check all options")
    println("2. Check only affirmative options")
    println("3. Check only doubtful options")
    println("4. Check only negative options")
    when (readLine()) {
        "1" -> showAnswersByType("ALL")
        "2" -> showAnswersByType(AFFIRMATIVE_ANSWER)
        "3" -> showAnswersByType(DOUBTFUL_ANSWER)
        "4" -> showAnswersByType(NEGATIVE_ANSWER)
        else -> showError()
    }
}

fun showAnswersByType(answerType: String = "ALL") {
    when (answerType) {
        "ALL" -> answers.forEach { answer -> println("\n $answer") }
        AFFIRMATIVE_ANSWER -> (answers.filterValues { values -> values == AFFIRMATIVE_ANSWER }).printAnswers()
        DOUBTFUL_ANSWER -> (answers.filterValues { values -> values == DOUBTFUL_ANSWER }).printAnswers()
        NEGATIVE_ANSWER -> (answers.filterValues { values -> values == NEGATIVE_ANSWER }).printAnswers()
    }
}

fun Map<String, String>.printAnswers() {
    println(this.keys)
}

fun exit() {
    println("Good bye!")
}

fun showError() {
    println("It seems you choose a wrong option. try again!")
}

fun some(name: String, lastname: String) = name + lastname