package estructurascontrol

import kotlin.math.roundToInt

fun main() {
    val isLoggedIn = true

    when (isLoggedIn) {
        true -> println("Usuario logeado")
        false -> println("Usuario no logeado")
    }

    println()

    // 1 logged in
    // 0 logged out
    // -1 Down
    // 10 - 20 Inactive time [10 - 20]

    val userStatus = 12
    val userStatusString = when (userStatus) {
        0 -> "Logged Out"
        1 -> "Logged In"
        in 10..20 -> "Inactive for $userStatus min"
        else -> "Not found"
    }

    println(userStatusString)

    val productPrices: Any = doubleArrayOf(15.12, 11.10, 45.66)
    val total = when (productPrices) {
        is DoubleArray -> productPrices.sum().roundToInt().toString()
        is Double -> productPrices.roundToInt().toString()
        is Int -> productPrices.toString()
        else -> productPrices.toString()
    }

    println("Totals: $total")
    println()

    val hasAddress = false
    val user = "Sony"

    val message = when {
        isLoggedIn and hasAddress -> "Lista direcciones de $user"
        isLoggedIn and !hasAddress -> "$user no tiene lista de direcciones"
        else -> "$user no está logeado"
    }

    println("Message: $message")
}
