import java.math.BigDecimal
import java.math.RoundingMode

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}

fun Array<BigDecimal>.somatoriaWithInitialValue(value: BigDecimal) : BigDecimal {
    return this.fold(value) { acumulador, valor ->
        acumulador + (valor * value).setScale(2, RoundingMode.UP)
    }
}

fun Array<BigDecimal>.media(): BigDecimal {
    return if(this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}