package funciones

fun main() {
    // My Fabulous App
    // Welcome to the best experience
    // Sonia Rodriguez

    // ***** My Fabulous App *****
    // *** Welcome to the best experience ***
    // ** Sonia Rodriguez **

    val appName = "My Fabulous App"
    println(addStarsFormat(appName, 5))

    val welcome = "Welcome to the best experience"
    println(addStarsFormat(welcome, 3))

    val name = "Sonia Rodriguez"
    println(addStarsFormat(name, 2))
    println(addStarsFormat(name))
}

fun addStarsFormat(text: String, startsNumber: Int): String {
    val textBuilder = StringBuilder(text)
    textBuilder.insert(0 , " ")
    textBuilder.insert(textBuilder.length, " ")

    for (i in 0 until startsNumber) {
        textBuilder.insert(0, "*")
        textBuilder.insert(textBuilder.length, "*")
    }

    return textBuilder.toString()
}

fun addStarsFormat(text: String): String = addStarsFormat(text, 2)
