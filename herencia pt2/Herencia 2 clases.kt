package herencia

import herencia.clases_v2.Alumno
import herencia.clases_v2.Ejecutivo
import herencia.clases_v2.Persona

fun main() {

    val juan  = Alumno("Juan",123456,4,14)
    val alan  = Alumno("Alan",123457,4,13)
    val jorge = Alumno("Jorge",123458,4,15)

    juan.hacerExamen()
    juan.reprobar()
    alan.hacerExamen()
    alan.reprobar()
    jorge.hacerExamen()
    jorge.reprobar()

    juan.respirar()
    juan.hablar()


    val persona = Persona("Persona1",100)
    persona.hablar()
    persona.respirar()

    val roxBanco = Ejecutivo("Roxana",12586,500.00,33)
    roxBanco.abrirCuenta()
    roxBanco.hablar()
    roxBanco.respirar()

}