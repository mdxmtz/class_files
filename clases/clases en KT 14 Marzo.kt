package clases

fun main() {

    //Clase que se llame coche y crearlo mediante su constructor
    //marca Texto
    //modelo Texto
    //year Numero
    //precio Decimal
    //Crear una funcion que imprima todos los valores del carro

    //Crear un objeto de la clase coche
    //y usamos el metodo de imprimirDatos()


    //Instancia u objeto de la clase Persona
    val personaJuan = Persona()
    personaJuan.nombre = "Juan"
    personaJuan.apellido = "Hdez"
    personaJuan.edad = 18
    personaJuan.saltar()

    val nombre = personaJuan.nombre
    println("La informacion de la personaJuan.nombre es : $nombre")


    val personaMau = PersonaPorConstructor("Mau","Prieto",26)
    personaMau.saltar()
    val nombreMau = personaMau.nombre

    println("La informacion de la personaJuan.nombre es : $nombreMau")

}

//String -> Textos
//Int -> Numeros Enteros
//Double -> Numeros con punto decimal

//Clases siempre con Mayuscula
//Nos indica como es una persona
class Persona{

    var nombre : String = ""
    var apellido : String = ""
    var edad : Int = 0

    fun saltar(){
        println("Soy $nombre y estoy saltando")
    }

}

/**/
class PersonaPorConstructor(
    val nombre : String,
    val apellido : String,
    val edad : Int
){

    fun saltar(){
        println("Soy $nombre y estoy saltando")
    }

}

