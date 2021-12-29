fun main() {
    when ("Red") {
        "yellow" -> println("Color is yellow")
        "red", "Red" -> println("Color is red")
        "blue" -> println("Color is blue")
        else -> println("IDK what is the color")
    }

    when (200) {
        in 200..299 -> println("code is between 200 and 299")
        in 400..500 -> println("code is between 400 and 500")
        else -> println("IDK what is what range is the code")
    }

    val message = when (42) {
        41, 42 -> "We have that shoe size"
        43, 44 -> "We don't have much shoes with that size"
        45 -> "We don't have that shoe size"
        else -> "we don't that size shoe, only 41 - 45"
    }

    println("message $message")
}