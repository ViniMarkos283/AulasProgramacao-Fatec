/*
51. Criar uma coleção “A” na linguagem Kotlin com 10 elementos
–	Inserir os elementos de 1 a 10 na coleção
–	Criar uma outra coleção B que conterá o elemento da coleção A multiplicado por 2
–	Mostrar as duas coleções
Obs. Não efetuar a leitura de 10 elementos
 */

fun main(){
    var vetorA = Array(10, {0})
    var vetorB = Array(10, {0})
    
    for(x in 1..10){
        vetorA[x-1] = x
        vetorB[x-1] = vetorA[x-1] * 2
    }
    
    println(vetorA.joinToString(", "))
    println(vetorB.joinToString(", "))
}