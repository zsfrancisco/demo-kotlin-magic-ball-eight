fun main() {
    val colors = listOf("Blue", "Yellow", "Red")
    with(colors) {
        println("Our colors are $this")
        println("this list has $size colors")
    }
}