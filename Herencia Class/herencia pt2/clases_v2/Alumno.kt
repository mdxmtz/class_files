package herencia.clases_v2

class Alumno(
    nombre : String,
    matricula : Int,
    numMaterias : Int,
    edad : Int
):Persona(nombre,edad) {
    fun reprobar(){}
    fun hacerExamen(){}

}