package arrays

fun main() {
    val myArray = arrayOf(1, "hello", 2.3F, 's', 1000L, false)
                // index  0     1      2     3    4       5
    println(myArray[1])

    myArray[1] = "bye bye"
    println(myArray[1])

    val emptyArray = emptyArray<Int>()

    val myByteArray = byteArrayOf(1, 2, 3)
    val myInt = intArrayOf(4, 5, 6, 7, 8)

    // Crea un array de Int con un tamaño especifico, y todos los elementos se inicializan en 0
    val  arrayInt = IntArray(5) // Solo reserva el espacio de memoria
    println("\nArray con un tamaño específico y elementos inicializados en 0")
    arrayInt.forEach {
        println(it)
    }

    // Con un comportamiento donde se inicializan los espacio de memoria reservados
    val arrayInt2 = IntArray(5, { i: Int -> i })
    println("\nArray con un tamaño específico, usando lambda que asigna un valor al indice. " +
            "\nEn este caso se le está asignando el número del indice correspondiente.")
    arrayInt2.forEach {
        println(it)
    }
    /* seria como hacer lo siguiente:
    arrayInt2[0] = 0
    arrayInt2[1] = 1
    arrayInt2[2] = 2
    arrayInt2[3] = 3
    arrayInt2[4] = 4
     */
    val arrayInt3 = IntArray(5) { i: Int -> i.inc() } // i.inc() es lo mismo que i + 1
    println("\nArray con un tamaño específico, usando lambda que asigna un valor al indice. " +
            "\nEn este caso se le está asignando el número del indice correspondiente más 1.")
    arrayInt3.forEach {
        println(it)
    }
    /* seria como hacer lo siguiente:
    arrayInt2[0] = 1
    arrayInt2[1] = 2
    arrayInt2[2] = 3
    arrayInt2[3] = 4
    arrayInt2[4] = 5
     */

    println("\nArrayBoolean donde se imprime el indice y se inicializan los elementos con el valor true")
    val arrayBoolean = BooleanArray(3) {
        println(it) // primero se imprime los indices
        true // luego se le asigna el valor de true
    }

    println("Valores del arrayBoolean: ")
    arrayBoolean.forEach {
        println(it)
    }
}
