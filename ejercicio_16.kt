//Correge este código para manejar valores nulos:

//No realizado

fun main() {
    var email: String? = "hola@gmail.com"
    val dominio = email?.substringAfter("@") ?: "Correo no válido o nulo"
    println("Dominio: $dominio")
}
