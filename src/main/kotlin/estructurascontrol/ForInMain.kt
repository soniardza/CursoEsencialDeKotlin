package estructurascontrol

fun main() {
    /*var i = 0
    while (i <= greetings.size - 1) {
        println(greetings[i])
        i++
    }*/

    // For in
    for (i in 1..3) {
        println(i)
    }
    println()

    println("3 downTo 1")
    for (i in 3 downTo 1) {
        println(i)
    }
    println()

    println("3.downTo(1)")
    for (i in 3.downTo(1)) println(i)
    println()

    for (i in 'a'..'c') {
        println(i)
    }
    println()

    for (i in 'c' downTo 'a') println(i)
    println()

    // ForIn con arrays
    val greetings = arrayOf("Hola", "Hello", "Oi", "Salam alykom", "Buenos días")

    for (greeting in greetings) { // greeting  sustituye i
        println(greeting)
    }
    println()

    println("+++ Size +++")
    for (i in 0..greetings.size - 1) println(greetings[i])
    println()

    println("+++ Until +++")
    for (i in 0 until greetings.size) println(greetings[i])
    println()

    println("+++ Indices +++")
    for (i in greetings.indices) println(greetings[i])
}
