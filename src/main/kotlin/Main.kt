fun main() {
    val mobiles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Xiaomi mi 9T")
        .run {
            removeIf { mobile -> mobile.contains("Google") }
            this
        }
    println("mobiles are $mobiles")
}