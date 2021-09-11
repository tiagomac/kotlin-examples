import java.lang.RuntimeException

fun main() {

    var contaFran = Conta(titular = "Fran2", numero = 23, saldo = 2.1)
    contaFran.titular = "Fran"
    contaFran.saldo = 100.0
    contaFran.numero = 54309

    println(contaFran.saldo)
    contaFran.deposita(100.0)
    contaFran.titular = "teste"

    println(contaFran.saldo)
    
    teste@ for (i in 1..100) {
        println(" i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break@teste
        }
    }
    
    var pessoa = Pessoa("tiago", 34)
    
    val numeroStr = "olá"
    
    
    var numeroDouble: Double? = try {
        numeroStr.toDouble()
    } catch (ex: Exception) {
        ex.printStackTrace()
        null
    }
    
    println("numeroDouble: $numeroDouble")
    
    var fooFuncionario: Funcionario? = null;
    println("Funcionário nome: ${fooFuncionario!!.nome}");
}

class BigProblem: RuntimeException("Teste") {
    
}

class Conta(
    titular: String,
    numero: Int,
    saldo: Double
) {
    var titular: String = ""
        set(value) {
            println("entrou")
            if (field > 0.toString()) {
                field = value
            }
        }
        get() {
            return this.titular
        }
    
    init {
        println("contruindo! $titular")
    }
//    constructor(titular: String, numero: Int) {
//        println("Testee: "+03.0.coerceAtLeast(5.0))
//    }

    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
    }
}

fun testaCopiasEReferencias() {

}

class Funcionario(nome: String, idade: Int) : Pessoa(
    nome = nome,
    idade = idade
){
    var nome = ""
    var idade = 0
}

open class Pessoa(nome: String, idade: Int) {
    init {
        println(nome)
    }
}

