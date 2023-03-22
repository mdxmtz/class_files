package herencia

import herencia.clases_v4.Login
import herencia.clases_v4.LoginGoogle
import herencia.clases_v4.Perfil

fun main() {

    val login = Login("Titulo 1","Azul","Cargando")
    login.ingresarConContrasenia()

    login.titulo
    login.colorFondo
    login.tituloBarraCarga
    login.tiempoSesion()

    val perfil = Perfil("Titulo 2","Azul","Cargando")
    perfil.cambiarFotoPerfil()
    perfil.cambiarContraenia()

    perfil.titulo
    perfil.colorFondo
    perfil.tituloBarraCarga
    perfil.tiempoSesion()

    val pantallaGoogle = LoginGoogle("Google","Azul","Load")
    pantallaGoogle.ingresarConGmail()
    pantallaGoogle.ingresarConContrasenia()
    pantallaGoogle.tituloBarraCarga
    pantallaGoogle.colorFondo
    pantallaGoogle.tituloBarraCarga
    pantallaGoogle.tiempoSesion()

    val pantallaLoginGoogle = LoginGoogle("SS","Axul","Load")
    pantallaLoginGoogle.atributoLoginGoogle = "Atributo"
    pantallaGoogle.atributoLogin

    val pantallaLogin2 = Login("SS","Axul","Load")
    pantallaLogin2.atributoLogin = "ASA"



}