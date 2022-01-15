fun main() {
    val myLambda: (String) -> Int = { value -> value.length }
    println("Length of the word Francisco is ${myLambda("Francisco")}")
    println("Length of the word Jennifer is ${myLambda("Jennifer")}")

    val cheers = listOf("Hello", "Hola", "Ciao")
    val lengthOfCheers = cheers.map(myLambda)
    println("lengthOfCheers are $lengthOfCheers")
}