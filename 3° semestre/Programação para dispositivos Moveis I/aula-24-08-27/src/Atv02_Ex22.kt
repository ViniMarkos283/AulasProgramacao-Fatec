/*
22. Faça um programa na Linguagem Kotlin que leia 3 números inteiros e mostre o maior deles.
*/

fun main(){
var maior = 0

println("informe o primeiro valor: ")
var n1 = readLine().toString().toInt()
println("informe o segundo valor: ")
var n2 = readLine().toString().toInt()
println("informe o terceiro valor: ")
var n3 = readLine().toString().toInt()

   if(n1 > n2 && n1 > n3){
        maior = n1
    }else 
    if(n2 > n1 && n2 > n3){
        maior = n2
    }else{
        maior = n3
    }
    
    println("O maior valor é: $maior")

}