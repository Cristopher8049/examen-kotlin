//Identifica y corrige los errores en el siguiente código:

//fun saludar(nombre: String?) {
//    return "Hola, $nombre!"
//}

//Error en los ifs

fun saludar(nombre: String?) {
    println("Hola, " + (nombre?.length ?: "0"))
}

fun main() {
    saludar(null)
    saludar("Cristopher")
}