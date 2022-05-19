package funciones

fun main() {

    val user = "Sonia"
    showWelcomeMessage("Hola")
    showWelcomeMessage("Hi")
    showWelcomeMessage("Buenos días")

    // "Buenos días Sonia"
    showWelcomeMessage("Buenos días", user)
    showWelcomeMessage("Hi", user = user) // argumentos nombrados
}

fun showWelcomeMessage(text: String, user: String = "") {
    val message = "$text $user".trim()
    println(message)
}
