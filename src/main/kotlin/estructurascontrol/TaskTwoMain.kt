package estructurascontrol

fun main() {
    // menor o igual a 20 - Usa un abrigo hace frío
    // entre 21 y 30 - Te irá bien si usas chaqueta, el clima es templado
    // mayor a 30 - Es mejor que lleves algo ligero, hace calor

    val temperature = 31
    val message = when {
        temperature < 20 -> "Usa un abrigo hace frío"
        temperature in 21..30 -> "Te irá bien si usas chaqueta, el clima es templado"
        else -> "Es mejor que lleves algo ligero, hace calor"
    }

    println(message)
}
