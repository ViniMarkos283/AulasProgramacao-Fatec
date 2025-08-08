/*
54. Fazer um procedimento para receber as notas da primeira e da segunda prova de cinco alunos.
Armazenar as notas da primeira e da segunda prova em vetores distintos.
Calcular e escrever a média de cada aluno.
 */

fun main(){
var i = 0
    var prova1 = Array(5, {0.0})
    var prova2 = Array(5, {0.0})
    
    while(i < prova1.size){
        println("Digite a nota da primeira prova do ${i+1}° aluno")
        prova1[i] = readLine().toString().toDouble()
        println("Digite a nota da segunda prova do ${i+1}° aluno")
        prova2[i] = readLine().toString().toDouble()
        i += 1
    }
    for(i in 0..4){
        println("O aluno ${i+1} teve as seguintes notas: prova 1: ${prova1[i]} e prova 2: ${prova2[i]}")
        println("A media do aluno ${i+1} é de: ${(prova1[i] + prova2[i])/2}")
    }
    
}
