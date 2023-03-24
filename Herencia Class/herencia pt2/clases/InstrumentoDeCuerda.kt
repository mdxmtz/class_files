package herencia.clases

open class InstrumentoDeCuerda(
    nombre : String
):Intrumento(nombre) {

    fun cambiarCuerdas(){
        println("Cambiando cuerdas")
    }

    fun metodoInstrumentoCuerda(){
        println("instrumento cuerda")
    }

}