/*
46. Faça um programa na Linguagem Kotlin que leia tenha 3 opções:
 1 - Fatorial
 2 - Quadradro de um número
 3 - Volume de uma lata
 4 – Sair do Programa
Utilize os conceitos de funções em Kotlin
*/

fun main(){
    var choose: Int
    val menu = """Escolha uma opção:
    1 - Calcular fatorial
    2 - Calcular quadrado de um valor
    3 - Calcular volume de uma lata
    4 - Sair"""
    
    do{
    println(menu)
    choose = readLine().toString().toInt()
    
    when(choose){
        1 -> {
        println("Digite um valor: ")
        var fat = readLine().toString().toInt()
        println("O fatorial de $fat é ${fatorial(fat)}\n")
        }
        
        2 -> {
            println("Digite um valor: ")
            var quad = readLine().toString().toInt()
            println("O valor ao quadrado de $quad é ${quadrado(quad)}\n")
        }
        
        3 -> {
        println("Digite o valor do raio:")
        var raio = readLine().toString().toDouble()
        println("Digite o valor da altura:")
        var alt = readLine().toString().toDouble()
        println("O volume da lata é de: ${volume(raio, alt)}\n")
            
        }
        
        4 -> println("Encerrando...")
        
        else -> println("Opção inválida")
    }
        
    }while(choose != 4)
}

fun fatorial(x:Int):Int{
    if(x < 1){
        return 1
    }else{
        return  x * fatorial(x-1)
    }
}

fun quadrado(x:Int):Int{
    return x * x
}

fun volume(raio: Double, altura: Double): Double {
    val pi = 3.14159
    return pi * raio * raio * altura
}