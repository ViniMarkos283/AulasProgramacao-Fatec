/* 
19. Faça um programa na Linguagem Kotlin que leia quatros valores referentes a 
quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o aluno foi aprovado, 
se o valor da média escolar for maior ou igual a 7. Se o aluno não foi aprovado, 
indicar uma mensagem informando esta condição. 
Apresentar junto das mensagens o valor da média do aluno para qualquer condição.
*/

fun main(){
    println("Nota 1:")
    var nt1 = readLine().toString().toDouble()
    println("Nota 2:")
    var nt2 = readLine().toString().toDouble()
    println("Nota 3:")
    var nt3 = readLine().toString().toDouble()
    println("Nota 4:")
    var nt4 = readLine().toString().toDouble()
    
    var med = (nt1 + nt2 + nt3 + nt4)/4
    
    if(med >= 7){
        println("Aluno aprovado! a média dele é: $med")
    }
    else{
        println("Aluno reprovado! a media dele é: $med")
    }
}