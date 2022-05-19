package funciones

fun main() {

    // Greeting:  Hello, Hi, Welcome, Good Morning, Hallo
    val greetings = arrayOf("Hello", "Hi", "Welcome", "Good Morning", "Hallo")

    // Introduction: my name is, you can call me, I use named, I'm
    val introductions = arrayOf("my name is", "you can call me", "I use named", "I'm")

    // Name
    val names = arrayOf("Ann", "Anahi", "anncode", "Irene", "Ani")

    val greeting = greetings[randomIndex(greetings)]
    val intro = introductions[randomIndex(introductions)]
    val name = names[randomIndex(names)]

    val phrase = "$greeting $intro $name"

    println(phrase)
}

fun randomIndex(text: Array<String>): Int = (Math.random() * text.size).toInt()

