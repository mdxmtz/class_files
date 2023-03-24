fun main() {

    val pesos = dollarAPeso(5.0)
    println("La cantidad en pesos es = $pesos")

}

/* */
fun dollarAPeso(
    dolaresCantidad : Double
):Double{

    val resultado = dolaresCantidad * 18.00
    return resultado * 18.00

}

