package herencia

fun main() {

    val gato = Gato("Gatito")
    gato.arañar()
    gato.comer()

    val pez = Pez("Pez1")
    pez.respirarBajoAgua()
    pez.comer()

    val ave = Ave("Ave1")
    ave.volar()
    ave.comer()

    val animal = Animal("Animal nombre")
    animal.comer()

}

/*Clase Padre*/
open class Animal(
    val nombre : String
){
    fun comer(){
        println("Estoy comiendo y me llamo $nombre")
    }
}

/*Clase Hija de la clase Animal*/
class Gato(
    nombre : String
):Animal(nombre){
    fun arañar(){
        println("Estoy arañando y me llamo $nombre")
    }
}

/*Clase Hija de la clase Animal*/
class Ave(
    nombre: String
):Animal(nombre){
    fun volar(){
        println("Estoy volando y mi nombre es $nombre")
    }
}

/*Clase Hija de la clase Animal*/
class Pez(
    nombre: String
):Animal(nombre){
    fun respirarBajoAgua(){
        println("Estoy respirando bajo el agua y mi nombre es $nombre")
    }
}