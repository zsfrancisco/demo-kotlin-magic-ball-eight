fun main() {
    val mobiles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Xiaomi mi 9T")
        .apply {
            removeIf { mobile -> mobile.contains("Google") }
        }
    println("mobiles are $mobiles")

    var colors: MutableList<String>? = null
    colors?.apply {
        println("Our colors are $this")
        println("Our colors size is $size")
    }

    colors = mutableListOf("Yellow", "Blue", "Red")
    colors.apply {
        println("Our colors are $this")
        println("Our colors size is $size")
    }
}