package herencia

import herencia.clases.Guitarra
import herencia.clases.InstrumentoDeCuerda
import herencia.clases.Intrumento

fun main() {

    /*Clase Abuelo*/
    val instrumento = Intrumento("Instrumento 1")
    /*Son los de la Clase*/
    instrumento.tocar()
    instrumento.medotoIntrumento()

    /*Clase Padre */
    val instrumentoCuerda = InstrumentoDeCuerda("Instrumento cuerda 1")

    /*Son los del Abuelo*/
    instrumentoCuerda.tocar()
    instrumentoCuerda.medotoIntrumento()

    /*Son los de la Clase*/
    instrumentoCuerda.cambiarCuerdas()
    instrumentoCuerda.metodoInstrumentoCuerda()


    val guitarra = Guitarra("Lira 1")

    /* Son los del Abuelo */
    guitarra.tocar()
    guitarra.medotoIntrumento()

    /*Son del Padre*/
    guitarra.cambiarCuerdas()
    guitarra.metodoInstrumentoCuerda()

    /*Son los de la Clase*/
    guitarra.afinar()


}