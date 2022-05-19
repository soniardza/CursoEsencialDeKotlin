package funciones

fun main() {
    val welcome = getWelcomeText()
    println(welcome)
    println(cleanText(welcome))
}

fun getWelcomeText() = "*** Welcome to the best experience ***"

fun cleanText(text: String): String = text
    .removePrefix("***")
    .removeSuffix("***")
    .trim() // trim in kotlin remove space int leading and trailing
