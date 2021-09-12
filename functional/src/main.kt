


fun main() {
//    testeTipoFuncaoReferencia()
//    testaTipoFuncaoClasse()
    
    val minhaFuncaoLambda: (Int, Int) -> Int = { _, b ->
        10 + b
    }
    println(minhaFuncaoLambda(15, 10))

    val minhaFuncaoAnonima = fun(a: Int, b: Int) : Int {
        return a + b
    }
    println(minhaFuncaoAnonima(3, 3))
    
    val calculaBonificacao: (salario: Double) -> Double = { salario ->
        salario + 100.0
    }
    
    println(calculaBonificacao(1000.0))
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasses: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasses(5,5))
}

fun testeTipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5, 10))
}

fun soma(a: Int, b:Int) : Int {
    return a + b
}

class Soma : (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int = p1 + p2
}
