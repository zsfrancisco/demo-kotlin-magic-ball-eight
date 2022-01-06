fun main() {
    val listOfFruits = listOf("Apple", "Orange", "Banana")
    for (fruit in listOfFruits) println("Fruit is $fruit")
    listOfFruits.forEach { fruit -> println("Fruit is $fruit") }
    val charactersOfFruit = listOfFruits.map { fruit -> fruit.length }
    println("Characters of fruit -> $charactersOfFruit")
    val charactersFilteredOfNumbers = charactersOfFruit.filter { fruitLength -> fruitLength > 5 }
    println("Characters filtered -> $charactersFilteredOfNumbers")
}