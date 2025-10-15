//Crea una función esPalindromo que reciba un String y retorne true
//si es un palíndromo (se lee igual al derecho y al revés) y false si no lo es.

// fun saludar(nombre: String?) {
//     println("Hola, " + nombre.length) 
//}
//saludar(null) 

//No realizado

fun esPalindromo(texto: String): Boolean {
    val limpio = texto.lowercase().replace(" ", "")
    return limpio == limpio.reversed()
}

fun main() {
    println(esPalindromo("Ana"))          
    println(esPalindromo("Anita lava la tina")) 
    println(esPalindromo("Kotlin"))      
}