import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
//    val salarios = Array<BigDecimal>(5) { BigDecimal.ZERO }
//    salarios[0] = "1500.55".toBigDecimal()
//    salarios[1] = "2000.00".toBigDecimal()

    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00")

    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { calculaAumentoRelativo(it, aumento) }
        .toTypedArray()

    println(salariosComAumento.contentToString())
    
    println(salarios.somatoria())
    println(salariosComAumento.somatoria())

}

private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal) =
    if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { index ->
        valores[index].toBigDecimal()
    }
}

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor -> 
        acumulador + valor
    }
}