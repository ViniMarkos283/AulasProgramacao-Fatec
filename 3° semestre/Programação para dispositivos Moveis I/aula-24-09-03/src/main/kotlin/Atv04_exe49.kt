/*
49. Criar uma coleção na linguagem Kotlin com 10 elementos
–	Inserir os elementos de 1 a 10 no vetor
–	Após a inserção, somente após a inserção mostrar o vetor.
Obs. Não efetuar a leitura de 10 elementos
 */

fun main(){
    var numeros = Array(10, {0})
    
    for(x in 1..10){
        numeros[x-1] = x
    }
    
    println(numeros.joinToString(", "))
}

