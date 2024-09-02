/*
24. Faça um programa na Linguagem Kotlin que efetue a leitura de um número inteiro 
e apresentar uma mensagem informando se o número é par ou ímpar.
*/

fun main(){
    println("Digite um valor: ")
    var x = readLine().toString().toInt()
    
    if(x % 2 == 0){
        println("O valor $x é par!")
    }else{
        println("O valor $x é impar!")
    }

}