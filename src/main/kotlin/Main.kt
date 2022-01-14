fun main() {
    val namesList = listOf("Francisco", "Javier", "Jennifer", "Pahola")
    println("Names list $namesList")

    val mutableNamesList = mutableListOf<String>()
    println("mutable names list is $mutableNamesList")
    val nameFirstOrNull = mutableNamesList.firstOrNull()
    println("name first or null is $nameFirstOrNull")

    mutableNamesList.add("Francisco")
    mutableNamesList.add("Javier")
    mutableNamesList.add("Jennifer")
    println("mutable names list is $mutableNamesList")

    val firstName = mutableNamesList.first()
    val lastName = mutableNamesList.last()
    val specificPositionName = mutableNamesList[1]
    println("first name is $firstName")
    println("last name is $lastName")
    println("specific name is $specificPositionName")

    mutableNamesList.removeAt(1)
    println("names mutable list is $mutableNamesList")

    mutableNamesList.removeIf { characters -> characters.length == 8 }
    println("names mutable list is $mutableNamesList")

    val myArrayOfInts = arrayOf(1, 2, 3, 4)
    println("my array numbers is ${myArrayOfInts.toList()}")
}