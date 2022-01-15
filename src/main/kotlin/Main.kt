fun main() {
    val lengthOfInitialValue = superFunction("Francisco") { value ->
        value.length
    }
    println("Length of initial value is $lengthOfInitialValue")

    val lambda = functionInception("Francisco")
    println("lambda value ${lambda()}")
}

fun superFunction(initialValue: String, block: (String) -> Int): Int {
    return block(initialValue)
}

fun functionInception(name: String): () -> String {
    return {
        "Hello $name from the lambda"
    }
}