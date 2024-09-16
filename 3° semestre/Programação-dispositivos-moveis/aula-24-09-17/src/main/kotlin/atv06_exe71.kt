/*
- 71. Faça um exemplo utilizando sortedBy
*/

fun main() {
    val numeros = listOf(5, 3, 8, 1, 9, 2, 7)

    val numerosOrdenados = numeros.sortedBy { it }

    println("Lista ordenada: $numerosOrdenados")
}
