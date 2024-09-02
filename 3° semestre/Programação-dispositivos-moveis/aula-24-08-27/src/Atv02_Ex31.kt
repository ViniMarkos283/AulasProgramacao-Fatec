/*
31. Faça um programa na Linguagem Kotlin que que receba um número e mostre o fatorial desse número.
*/

fun main(){
    var fat = 1
    var i = 1

    println("Digite um valor: ")
    var x = readLine().toString().toInt()
    
    while(i < x+1){
        fat *= i
        i += 1
    }
    
    println("O fatorial de $x é $fat")

}
