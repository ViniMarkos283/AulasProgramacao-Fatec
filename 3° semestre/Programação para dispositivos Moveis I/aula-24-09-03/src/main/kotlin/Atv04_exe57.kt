/*
57. Criar um vetor A do tipo inteiro de 5 elementos
– Solicitar os valores para o usuário e inserir no vetor A
– Criar um vetor B do tipo inteiro
– Ler o vetor A e para cada elemento lido calcular o fatorial e gravar no B
– Após de todos os elementos do vetor A, mostrar os dois vetores
 */

fun main(){
var i = 0
    var vetorA = Array(5, {0})
    var vetorB = Array(5, {0})
    
    while(i < vetorA.size){
        println("Digite o ${i+1}° valor: ")
        vetorA[i] = readLine().toString().toInt()
        vetorB[i] = fatorial(vetorA[i])
        i += 1
    }
    
    println(vetorA.joinToString(", "))
    println(vetorB.joinToString(", "))
}

fun fatorial(x:Int):Int{
    if(x < 1){
        return 1
    }else{
        return  x * fatorial(x-1)
    }
}