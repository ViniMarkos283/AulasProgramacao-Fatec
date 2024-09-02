/*
23. Faça um programa na Linguagem Kotlin que efetue a leitura de cinco números inteiros 
e identificar o maior e o menor valor. Não execute a ordenação de valores.
*/

fun main(){
var i = 0
var maior = 0
var menor = 0

println("Digite o 1 valor: ")
var x = readLine().toString().toInt()
i += 1
maior = x
menor = x

while (i < 5){
    println("Digite o ${i+1} valor: ")
    var x = readLine().toString().toInt()
    if(x > maior){
        maior = x
    }
    if(x < menor){
        menor = x
    }
    i+=1
}
println("O maior valor é $maior e o menor é $menor")
}