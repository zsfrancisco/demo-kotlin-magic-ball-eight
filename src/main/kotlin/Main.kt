fun main() {
    printName(name = "Francisco", lastname = "Zambrano")
}

fun printName(
    name: String, lastname: String, secondName: String = "", secondLastname: String = ""
) {
    println("Mi full name is $name $secondName $lastname $secondLastname")
}