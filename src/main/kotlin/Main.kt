fun main() {
    val mobiles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Xiaomi mi 9T")
        .also { list ->
            println("The original list value is $list")
        }.asReversed()
    println("mobiles are $mobiles")
}