package split

fun main() {
    val superMarket = listOf(
        "Milk",
        "Eggs",
        "Juice",
        "Meat",
        "Rice"
    )

    val breakfast = superMarket.take(3)
    println("My breakfast: ${breakfast.joinToString()}")

    val dinner = superMarket.drop(3)
    println("My dinner: ${dinner.joinToString()}")

    val breakfast2 = superMarket
        .take(3)
        .filterNot {
            it == "Eggs"
        }
    println("My breakfast: ${breakfast2.joinToString()}")
}