class IntroArrays {
}

fun main() {
    println("usingIntArray(): ${usingIntArray()}")
    println("usingIntArrayOf(): ${usingIntArrayOf()}")

}

fun usingIntArray(): Int {
    val idades = IntArray(4)
    idades[0] = 25
    idades[1] = 19
    idades[2] = 33
    idades[3] = 20
    return biggestNumberFromIntArray(idades)
}

fun usingIntArrayOf(): Int {
    val idades: IntArray = intArrayOf(25, 19, 33, 20, 55, 40)
    return biggestNumberFromIntArrayWithForEach(idades)
}

private fun biggestNumberFromIntArray(idades: IntArray): Int {
    var maiorIdade = 0
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }
    return maiorIdade
}

private fun biggestNumberFromIntArrayWithForEach(values: IntArray): Int {
    var biggestValue = 0
    values.forEach {
        biggestValue = if (it > biggestValue) {
            it
        } else {
            biggestValue
        }
    }
    return biggestValue
}