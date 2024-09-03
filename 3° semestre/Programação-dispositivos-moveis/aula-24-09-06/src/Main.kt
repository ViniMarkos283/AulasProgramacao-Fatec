/*
65. Fazer um programa para ler os dados de um funcionário (nome, salário Bruto e Desconto).
Em seguida, mostrar os dados do funcionário (nome e salário líquido).
Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada e mostrar novamente os dados do funcionário.
Use a classe projetada abaixo:
*/

fun main(){
    val func = Funcionario()

    println("nome: ")
    func.nome = readLine().toString()
    println("Salario Bruto: ")
    func.salarioBruto = readLine().toString()
    println("nome: ")
    func.desconto = readLine().toString()

    println("Dados do funcionário: ${func.nome}, R$${func.salarioLiquido()}")
}