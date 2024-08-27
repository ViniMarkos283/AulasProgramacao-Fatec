/* 
16. Faça um programa na Linguagem Kotlin que leia 3 (três) 
valores inteiros e apresente os 3 números em ordem crescente. 
*/

fun main(){
    var max = 0
    var mid = 0
    var min = 0

    println("Valor 1: ")
    var n1 = readLine().toString().toInt()
    println("Valor 2: ")
    var n2 = readLine().toString().toInt()
    println("Valor 3: ")
    var n3 = readLine().toString().toInt()
    
    if(n1 > n2 && n1 > n3){
        max = n1
    }else 
    if(n2 > n1 && n2 > n3){
        max = n2
    }else{
        max = n3
    }
    
       if(n1 < n2 && n1 < n3){
        min = n1
    }else if(n2 < n1 && n2 < n3){
        min = n2
    }else{
        min = n3
    }
    
    if(n1 > n2 && n1 < n3 || n1 < n2 && n1 > n3){
        mid = n1
    }else if(n2 > n1 && n2 < n3 || n2 < n1 && n2 > n3){
        mid = n2
    }else{
        mid = n3
    }
    
    println("Os valores em ordem são: " + min + " " + mid + " " + max)
}