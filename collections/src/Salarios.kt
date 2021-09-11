fun main() {
    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)
    
    val aumento = 1.1

    increaseSalaryWithForUsingIndices(salarios, aumento)

    increaseSalaryWithForEachIndexed(salarios, aumento)
    
    println(salarios.contentToString())
}

private fun increaseSalaryWithForUsingIndices(salarios: DoubleArray, aumento: Double) {
    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }
}

private fun increaseSalaryWithForEachIndexed(salarios: DoubleArray, aumento: Double) {
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * aumento
    }
}