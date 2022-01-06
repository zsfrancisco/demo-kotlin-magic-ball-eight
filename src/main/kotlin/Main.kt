fun main() {
    val name: String? = null
    val charactersOfName: Int = name?.length ?: 0
    println("charactersOfName is $charactersOfName")
}