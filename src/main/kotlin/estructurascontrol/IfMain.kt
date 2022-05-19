package estructurascontrol

fun main() {

    val isLoggedIn = true
    val hasAddress = false

    // if user is logged in
        // if has address
            // mostrar lista de direcciones
        // ! hasAddress
            // el usuario no tiene direcciones
    // user is not logged in
        // usuario no loggeado

    if (isLoggedIn) {
        println("Usuario está logeado")
        if (hasAddress) {
            println("Mostrar lista de direcciones")
        } else {
            println("El usuario no tiene direcciones")
        }
    } else {
        println("Usuario no logeado")
    }

    val userLoggedInStatus = if (isLoggedIn) "Logeado" else "No logeado"
    println("Usuario: $userLoggedInStatus")
}
