fun main() {
    val ageOfSuperHeroes = mapOf(
        "Ironman" to 35,
        "Superman" to 40,
        "Spiderman" to 23,
        "American Captain" to 99
    )
    println("super heroes age are $ageOfSuperHeroes")
    println("Spiderman age is ${ageOfSuperHeroes["Spiderman"]}")

    val ageOfSoccerPlayers = mutableMapOf(
        "Cristiano" to 36,
        "Kaká" to 40
    )
    ageOfSoccerPlayers["Messi"] = 33
    ageOfSoccerPlayers.remove("Kaká")
    println("Soccer players age is $ageOfSoccerPlayers")

    println(ageOfSoccerPlayers)
}