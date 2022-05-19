package estructurascontrol

fun main() {
    val user = "Sonia"
    val password = "aert$&"

    var message = ""
    // If
    if (user == "Sonia" && password == "aert$&") {
        message = "Bienvenido $user"
    } else {
        message = "El usuario o contraseña no coinciden"
    }
    println(message)

    // When
    message = when {
        user == "Sonia" && password == "aert$&" -> "Bienvenido $user"
        else -> "El usuario o contraseña no coinciden"
    }
    println(message)

    message = when (user) {
        "Sonia" -> {
            when (password) {
                "aert$&" -> "Bienvenido $user"
                else -> "$user tu password es incorrecto"
            }
        }
        else -> "Usuario inválido"
    }
    println(message)

}
