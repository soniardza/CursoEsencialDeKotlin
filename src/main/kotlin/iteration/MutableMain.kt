package iteration

fun main() {
    println("** Mutable list **")
    val list = listOf(1, 2, 3, 4, 5)
    val anotherMutableList = list.toMutableList()

    val mutableList = mutableListOf(1, 2, 2, 3)
    mutableList.add(4)
    // mutableList[2] = 3
    mutableList.add(2, 3) // este no reemplazará el item de la posición 2, sino agregará y moverá el siguiente
    mutableList.removeAt(3)

    mutableList.forEach {
        println(it)
    }

    println("\n** Mutable set **")
    println("\n** Mutable set **")
    val mutableSet = mutableSetOf(1, 2, 2, 3)
    mutableSet.forEach {
        println(it)
    }

    println("\n** Mutable map **")
    val mutableMap = mutableMapOf(
        1 to "Irene",
        2 to "Son",
        3 to "Adrían"
    )

    mutableMap[4] = "Isabel"
    mutableMap.forEach {
        val key = it.key
        val name = it.value
        println("$key. $name")
    }
}