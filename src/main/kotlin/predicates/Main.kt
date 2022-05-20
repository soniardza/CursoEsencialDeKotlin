package predicates

fun main() {
    val ages = listOf(12, 25, 10, 22, 30, 29, 15)
    val adultAges = ages.filter {
        it >= 18
    }

    println("Adult ages: ${adultAges.joinToString()}")

    val kidsAges = ages.filterNot {
        it >= 18
    }

    println("Kids ages: ${kidsAges.joinToString()}")

    val allAges = ages.partition {
        it >= 18
    }

    val adultAges2 = allAges.first
    val kidsAges2 = allAges.second

    println("\nWith partition function")
    println("Adult ages: ${adultAges2.joinToString()}")
    println("Kids ages: ${kidsAges2.joinToString()}")

    val data = listOf("One", null, "Two", null, null, "Three")
    val dataNotNull = data.filterNotNull()
    println("\nData without null: ${dataNotNull.joinToString()}")
}