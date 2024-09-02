/*
33. Faça um programa na Linguagem Kotlin para apresentar o total da soma obtida 
dos cem primeiros números inteiros ( 1 + 2 + 3 + 4 + .... 98+ 99+ 100).
*/


fun main(){
    var total = 0

    println("somando total dos primeiros 100 numeros: ")
    for(i in 1..100){
        total += i
    }
    
    println("total = $total")

}