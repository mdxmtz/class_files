
fun main() {

    //las funciones se llaman por su nombre()
    sayHello("Alan")

    //es la llamada ala funcion
    val hora = "8:00"
    val ciudad = "Cuidad Mex"
    val diaDelMes = 9

    obtenerHora(hora,ciudad,diaDelMes)
    obtenerHora("9:00","Veracruz",28)


    val num1 :Int = -100
    val num2  : Int = 1
    val numDecimal1 : Double = 5.2

    val resultadoSuma  = num1 + numDecimal1
    val resultadoResta = num1 - numDecimal1
    val resultadoDiv   = num1 / numDecimal1
    val resultadoMult  = num1 * numDecimal1

    println(resultadoSuma)
    println(resultadoResta)
    println(resultadoDiv)
    println(resultadoMult)

    val numero : Double = 0.5
    val numeroASumar : Int = 50

    sumaUnNumeroAOtroNumero(numero,numeroASumar)
    sumaUnNumeroAOtroNumero(100.9,88)
    sumaUnNumeroAOtroNumero(88.5,0)


    val nombreAlan = dameUnNombre()
    println(nombreAlan)

    //Esperamos la entrada del dato del usuario
    println("Ingresa tu nombre")
    val nombreAEspera = readln()
    println("el nombre es $nombreAEspera")

}

fun sumaUnNumeroAOtroNumero(
    num : Double,
    numASumar : Int
){
    val resultado = num + numASumar
    println("el numero $num mas $numASumar es igual a $resultado")
}


fun dameUnNombre():String{

    val name : String = "ALAN"
    return name

}


//Declaracion de la funcion
fun obtenerHora(
    hora : String,
    ciudad : String,
    diaDelMes : Int
){

    //Variable de tipo String
    println("La hora actual es $hora y la ciudad es $ciudad el dia del mes es $diaDelMes")

}


/*
    declaracion de una funcion llamada sayHello
    recibe un parametro de tipo Texto, el cual llamamos nombre
 */
fun sayHello(
    nombre : String
){
    //Vamos a imprimir en consola el nombre
    println("El nombre es : $nombre")
}