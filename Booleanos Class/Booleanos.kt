package booleanos

fun main() {

    val s1 = "Hola"
    val s2 = 10
    val s3 = 10.0

    /* Boolean es representacion de SI y NO */
    val palabraSI = true
    val palabraNO = false

    /* Los Boolean tienen que ser como tipo pregunta*/
    var laTiendaEstaAbierta = true

    if(laTiendaEstaAbierta){/*TRUE*/
        /* Si la tienda esta abierta(true) Ejecuta este codigo*/
        println("La tienda esta Abierta")
    }else{/*FALSE*/
        /* Si la tienda esta cerrada(false) Ejecuta este codigo*/
        println("La tienda esta Cerrada")
    }

    /* NOS REGRESAN BOOLEAN true o false
        == es igual a
        <  es menor que
        <= es menor o igual a que
        >  es mayor que
        >= es mayor o igual a que
        != es diferente de
    */

    val nombre     = "Alan"
    val nombre2    = "alan"

    val resultado1 = 10 == 10 // true
    val resultado2 = 10 < 10 // false
    val resultado3 = 10 <= 10 // true
    val resultado4 = 10 > 10 // false
    val resultado5 = 10 >= 10 // true
    val resultado6 = 10 != 10 // false
    val resultado7 = nombre == nombre2


    val true1 = true
    val true2 = true
    val false1 = false


    /* AND && ambos true para que sea true*/
    val validacion1And = true1 && false1//FALSE
    val validacion2And = true1 and true2//TRUE

    /* OR || (pipes) ambos true para que sea true*/
    val validacion1Or  = true1 || false1//TRUE
    val validacion2Or  = true1 || true2//TRUE
    val validacion3Or  = false1 or false1//FALSE

    /*Solo puede pasar si es mayor de edad Y si tiene 500 pesos*/
    /* && que ambos Booleanos sean TRUE */
    if (true1 or false1){
        println("Dejar pasar persona")
    }else{
        println("No te dejo pasar")
    }

    acceso(nombre = "Juan", edad = 10)
    acceso(nombre = "Juan", edad = 18)
    acceso(nombre = "Alan", edad = 15)

}


/*Funcion que pida como parametro la Edad y el Nombre
* y si tiene 18 o mas años Y se llame Juan o Juana imprimir en pantalla Acceso Permitido
* de lo contrario dira Acceso Denegado.
* */

/* Solucion */
fun acceso(
    nombre : String,
    edad : Int
){

    val validacion1 : Boolean = nombre == "Juan" || nombre == "Juana"
    val validacion2 : Boolean = edad >= 18

    if ( validacion1 && validacion2 )
        println("Acceso permitido")
    else
        println("Acceso denegado")

}





