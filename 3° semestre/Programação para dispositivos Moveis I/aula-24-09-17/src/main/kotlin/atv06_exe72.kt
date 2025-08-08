/*
- 72. Faça um exemplo utilizando filter
*/

fun main() {
    val numeros = listOf(5, 3, 8, 1, 9, 2, 7)

    val numerosFiltrados = numeros.filter { it > 5 }

    println("Números maiores que 5: $numerosFiltrados")
}

