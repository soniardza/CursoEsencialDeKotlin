package math

import java.math.BigDecimal

fun main() {
    val productPrices = listOf(
        BigDecimal(33.5),
        BigDecimal(99.99),
        BigDecimal(50.5),
        BigDecimal(10.5),
    )

    val economyPrice = productPrices.count {
        it < BigDecimal(50)
    }
    println("Cuanto precios economicos: $economyPrice")

    val total = productPrices
        .sumOf {
            it.toBigInteger()
        }
    println("Total de la compra: $total")

    val randomPrice = productPrices.random()
    println("Un precio random: $randomPrice")

    val score = listOf(5.0, 4.9, 4.6, 4.7)
    val averageScore = score
        .average()
        .toFloat()
    println("Tu promedio es: $averageScore")
}