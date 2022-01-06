fun main() {
    var name: String? = null
    try {
        throw NullPointerException("Error was happened FZ")
    } catch (exception: NullPointerException) {
        println("Error - $exception")
    } finally {
        println("finish")
    }

    val firstNumber = 10
    val secondNumber = 0
    val result: Int = try {
        firstNumber / secondNumber
    } catch (exception: Exception) {
        0
    }
    println("Result is $result")
}