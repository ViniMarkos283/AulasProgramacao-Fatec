/*
- 70. Faça um exemplo uma variável do tipo função anônima (slide 5)
*/

fun main() {
val divisao = { a: Int, b: Int -> a / b}
println("O resultado da divisão é: " + divisao(6, 3))
}

