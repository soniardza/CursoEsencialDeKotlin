package iteration

fun main() {
    println("** List **")

    val list = listOf(1, 2, 3, 4, 5)
    println("Imprimiendo un solo item: ${list[3]}")

    list.forEach {
        println(it)
    }

    println("\n** Set **")
    val set = setOf(1, 2, 2, 3, 4, 4)
    println("imprimiendo el tamaño de set: ${set.size}")

    set.forEach {
        println(it)
    }
    println("\n** Set with names **")
    val setNames = setOf("Son", "Sonia", "Son")

    setNames.forEach {
        println(it)
    }

    println("\n** Map **")

    println("\n** Map **")
    val map = mapOf(
        1 to "Irene",
        2 to "Son",
        3 to "Adrían"
    )

    map.forEach {
        val key = it.key
        val name = it.value
        println("$key. $name")

    }
}