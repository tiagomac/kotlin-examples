
fun main() {
    
    val idades: IntArray = intArrayOf(10,55,22,30,45)
    
    println("Menor idade: ${idades.minOrNull()}")
    println("Maior idade: ${idades.maxOrNull()}")
    println("Média: ${idades.average()}")
    
    val todosMaiores = idades.all { it > 18 }
    println("Todos maiores: $todosMaiores")
    
    val algumMaior = idades.any { it > 18 }
    println("Algum maior: $algumMaior")
    
    val maiores = idades.filter { it >= 18}
    println("Maiores: $maiores")
}