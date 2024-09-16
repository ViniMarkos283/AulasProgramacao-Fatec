/*
- 73. Faça um exemplo utilizando reduce
*/

fun main() {
    val numeros = listOf(5, 3, 8, 1, 9, 2, 7)

    val somaTotal = numeros.reduce { acumulador, numero -> acumulador + numero }

    println("A soma total dos números é: $somaTotal")
}
