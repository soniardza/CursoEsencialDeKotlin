package conversiondatos

fun main() {
    val productLowStock: Byte = 20
    val productStock: Int = productLowStock.toInt()
    println(productStock)

    val numberString = "1"
    val numberByte: Byte = numberString.toByte()
    println("El número en Byte es: $numberByte")

    val numberDouble = numberString.toDouble()
    println("El número en Double es: $numberDouble")

    // ♡ 0x2661
    // ❤ 0x2764

    val unicodeInt = 0x2661
    val unicodeChar = unicodeInt.toChar()
    val unicode = unicodeChar.toString()

    println(unicode)

    val unicodeInt2 = 0x2764 // Si lo convierto directamente a String aparece un número (de hexa a decimal)
    val unicode2 = unicodeInt2.toChar()
    println(unicode2)
}
