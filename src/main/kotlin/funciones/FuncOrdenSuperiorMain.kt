package funciones

fun main() {
    val isValid = isValid(5) { it > 5 }
    println(isValid)

    // Ejemplo
    /*consultProductId {
        it
        // NavComponent
        // Intent
        // Cambio de ventana
        getOnNextProductIdBehavior()
    }*/
    consultProductId(onNext = getOnNextProductIdBehavior()) // 1. Toma la lambda getOnNextProductIdBehavior
}

fun isValid(x: Int, validate: (x: Int) -> Boolean): Boolean {
    return validate(x)
}

fun consultProductId(onNext: (productId: String) -> Unit) { // 3. Acá llega el comportamiento
    // DB o API
    val productId = "WERT1245"
    onNext(productId) // 4. Hasta este punto se ejecuta la lambda que está en getOnNextProductIdBehavior
}

fun getOnNextProductIdBehavior(): ((productId: String) -> Unit) {
    return {
        println("Go to Product Detail Screen with product ID: $it")  // 2. Obtiene el resultado
    }

}
