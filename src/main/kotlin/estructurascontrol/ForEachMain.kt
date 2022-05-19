package estructurascontrol

import kotlin.system.measureNanoTime

fun main() {

    val forInRange = measureNanoTime {
        for (i in 1..1000) i
    }

    val forEachRange = measureNanoTime {
        (1..1000).forEach {
            it
        }
    }

    println("ForInRange: $forInRange")
    println("ForEachRange: $forEachRange")

    println()
    // Colección
    val objectList = (1..1000).toList()

    val forInList = measureNanoTime {
        for (i in objectList) i
    }

    val forEachList = measureNanoTime {
        objectList.forEach {
            it
        }
    }

    println("ForInList: $forInList")
    println("ForEachList: $forEachList")
}
