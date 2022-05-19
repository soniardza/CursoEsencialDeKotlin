package arrays

fun main() {
    // Saludo + Introducción + Nombre

    // Saludo: Hola, Hello, Oi, Salam alykom, Buenos días
    // Introducción: Mi nombre es, yo soy, usualmente me llaman, pueden llamarme
    // Nombre: Sonia, Son, Sony

    val greetings = arrayOf("Hola", "Hello", "Oi", "Salam alykom", "Buenos días")
    val introductions = arrayOf("mi nombre es", "yo soy", "usualmente me llaman", "pueden llamarme")
    val names = arrayOf("Sonia", "Son", "Sony")

    // randome() regresa un valor double mayor o igual a 0.0 y menor a 1.0
    val randIndexGreetings = (Math.random() * greetings.size).toInt()
    val randIndexIntroductions = (Math.random() * introductions.size).toInt()
    val randIndexNames = (Math.random() * names.size).toInt()

    val phrase = "${greetings[randIndexGreetings]}, " +
            "${introductions[randIndexIntroductions]} ${names[randIndexNames]}"
    println(phrase)
}
