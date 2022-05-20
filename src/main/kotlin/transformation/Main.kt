package transformation

fun main() {
    val languages = listOf(
        "Java",
        "c",
        "Php",
        "Swift"
    )

    val strLanguage = languages.map {
        "Languages: $it"
    }

    strLanguage.forEach {
        println(it)
    }

    println("\n** Items **")
    val numbers = listOf(1, 2, 3)
    val items = numbers.map {
        "$it. Item"
    }

    println(items.joinToString())

    println("\n** Not Null and sum **")
    val data = listOf("1", "2", "*", "3", "/")
    val dataNumbers = data.mapNotNull {
        it.toIntOrNull()
    }

    println(dataNumbers)

    val sum = dataNumbers.sum()
    println(sum)
}