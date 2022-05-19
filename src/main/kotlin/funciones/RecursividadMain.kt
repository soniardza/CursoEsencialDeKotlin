package funciones

fun main() {
    val productPrices = doubleArrayOf(5.0, 3.0, 2.0)
    println(getProductPrices(productPrices, productPrices.size - 1))
}

//   0    1    2
// (5.0, 3.0, 2.0)  size = 3

//  2     1     0
// 2.0,  3.0,  5.0


// 5.0 + 3.0 + 2.0
// 2.0 + (3.0 + (5.0))
// 2.0 + (3.0 + getProductPrices(productPrices, maxIndex -1))
// 2.0 + getProductPrices(productPrices, maxIndex -1)

fun getProductPrices(productPrices: DoubleArray, maxIndex: Int): Double {
    // Base case
    if (maxIndex == 0) return productPrices[0]

    // Caso recursivo
    return productPrices[maxIndex] + getProductPrices(productPrices, maxIndex -1)
}
