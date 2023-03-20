package herencia.clases

/* */
open class Intrumento(
    val nombre : String
) {
    /** */
    fun tocar(){
        println("Tocando instrumento -> $nombre")
    }

    fun medotoIntrumento(){
        println("Metodo Instrumeto")
    }

}