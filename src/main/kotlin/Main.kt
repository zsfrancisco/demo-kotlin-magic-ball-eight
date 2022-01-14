fun main() {
    val vocalsRepeated = setOf("a", "e", "i", "o", "u", "a", "e")
    println("vocals repeated are $vocalsRepeated")

    val ageRepeated = mutableSetOf(10, 11, 44, 5, 5, 10, 15, 20)
    ageRepeated.add(45)
    println("age repeated are $ageRepeated")
    ageRepeated.remove(5)
    println("age repeated are $ageRepeated")
    val franciscoBirthdayYear = mutableSetOf(1, 9, 9, 7)
    val franciscoBirthdayYearRepeated = mutableSetOf(9, 7, 1)
    println("franciscoBirthdayYear and franciscoBirthdayYearRepeated are equals? ${franciscoBirthdayYear == franciscoBirthdayYearRepeated}")

    println("first value is ${ageRepeated.first()}")
    println("number > 10 ${ageRepeated.filter { age -> age > 10 }}")
}