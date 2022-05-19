package funciones

fun main() {

    // Delcaración

    val printHola = {
        println("Hola Lambda")
    }
    // Ejecutar
    printHola()

    val printText = { text: String ->
        println(text)
    }
    printText("Hola Lambda")

    val addOneTo = {x: Int ->
        x + 1
    }
    val total = addOneTo(4)
    println(total)

            // Parametro    return
    val addFiveTo: (Int) -> Int = {
        it + 5
    }
    println(addFiveTo(5))

    val sum: (Int, Int, String) -> Int = { x: Int, y: Int, _: String -> // se coloca un _ cuando no estamos usando parametro
        x + y
    }
    println(sum(4, 9, ""))

    val sum2: (Int, Int, String) -> Int = { x: Int, y:Int, message: String ->
        val total = x + y
        println("$message $total")
        total  // el ultimo dato que se tenga acá sera el valor a retornar
    }

    sum2(3,5, "El resultado es:")
}
