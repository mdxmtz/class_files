package herencia

fun main() {

    val perro1 = Perro("Firu",10,"Raza")
    perro1.ladrar()
    perro1.nombre
    perro1.raza
    perro1.dormir()

    val animal2 = Animal2("Animal",10)
    animal2.dormir()

}

//Clase Padre
open class Animal2(
    val nombre : String,//Firu
    val edad : Int//10
){

    fun dormir(){}

}


class Perro(
    nombre : String,//Firu
    edad : Int,//10
    val raza : String
):Animal2(nombre,edad){

    fun ladrar(){}

}