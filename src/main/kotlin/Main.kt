fun main() {
    val name = "Maria"
    if (name.isNotEmpty()) println("name length is ${name.length}") else println("Error - name is empty")
    val message =
        if (name.length > 4) "your name is large"
        else if (name.isEmpty()) "your name is empty"
        else "your name is short"
    println("message $message")
}