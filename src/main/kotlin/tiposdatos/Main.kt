package tiposdatos

fun main() {
    // Byte -127 - 128
    val age: Byte = 20
    val newAge: Byte = 127

    // Int -> 2 mil millones
    val productId = 2147483747
    val productId2 = 2_147_483_747
    // val productId3: Int = 2_147_483_748 causa error porque se pasa del limite

    // Long -> 9 trillones --> 2^63
    val userId: Long = 9_223_372_036_854_775_807
    val userId2 = 9_223_372_036_854_775_807L

    // Decimals
    val myDouble = 2.12345678912345678 // 18
    val myFloat = 2.1234567891234567F // 18

    println(myDouble)
    println(myFloat)

    // Boolean

    val isLoggedIn = true
    val hasAddress = false

    // And
    /*
    true && true = true
    true && false = false
    false && true = false
    false && false = false
    */

    // Or
    /*
    true || true = true
    true || false = true
    false || true = true
    false || false = false
    */

    // Not
    /*
    !true = false
    !false = true
     */

    println(isLoggedIn && hasAddress)
    println(isLoggedIn.and(hasAddress))
    println(isLoggedIn and hasAddress) // infix notation

    println(!isLoggedIn) // !true = false
    println(isLoggedIn.not())

    // Character
    val keyInserted = 'a'
    println(keyInserted)
    println('\$')
    println('\\')
}
