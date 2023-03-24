package herencia

fun main() {

    val gato = Gato("Gatito",5)
    gato.arañar()
    gato.decirNumPatas()
    gato.puedoCaminarEnLaTierra()
    gato.comer()


    val pez = Pez("Pez1",2)
    val ave = Ave("Ave1",2)


}

/*Clase Padre*/
open class Animal(
    val nombre : String
){
    fun comer(){
        println("Estoy comiendo y me llamo $nombre")
    }
}


open class AnimalVolador(
    nombre : String,
    val numeroDeAlas : Int
):Animal(nombre){

    fun decirNumeroDealas(){
        println("Num de alas son : $numeroDeAlas")
    }

}

open class AnimalAcuatico(
    nombre : String,
    val numeroDeAletas : Int
):Animal(nombre){

    fun decirNumeroDealas(){
        println("Num de alas son : $numeroDeAletas")
    }

}

open class AnimalTerrestre(
    nombre : String,
    val numeroDePatas : Int
):Animal(nombre){

    fun puedoCaminarEnLaTierra(){
        println("Puedo caminar en la tierra")
    }


}


/*Clase Hija de la clase Animal*/
class Gato(
    nombre : String,
    numPatas : Int
):AnimalTerrestre(nombre,numPatas){

    fun arañar(){
        println("Estoy arañando y me llamo $nombre")
    }

    fun decirNumPatas(){
        println("Numero de vidas $numeroDePatas")
    }
}

/*Clase Hija de la clase Animal*/
class Ave(
    nombre: String,
    numeroDeAlas : Int
):AnimalVolador(nombre,numeroDeAlas){

    fun volar(){
        println("Estoy volando y mi nombre es $nombre")
    }

}

/*Clase Hija de la clase Animal*/
class Pez(
    nombre: String,
    numeroAletas : Int
):AnimalAcuatico(nombre,numeroAletas){
    fun respirarBajoAgua(){
        println("Estoy respirando bajo el agua y mi nombre es $nombre")
    }
}