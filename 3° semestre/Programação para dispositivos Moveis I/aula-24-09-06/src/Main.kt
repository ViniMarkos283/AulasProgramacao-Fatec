/*
65. Fazer um programa para ler os dados de um funcionário (nome, salário Bruto e Desconto).
Em seguida, mostrar os dados do funcionário (nome e salário líquido).
Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada e mostrar novamente os dados do funcionário.
Use a classe projetada abaixo:
*/

fun main(){
    val func = Funcionario()

    print("nome: ")
    func.nome = readLine().toString()
    print("Salario Bruto: ")
    func.salarioBruto = readLine().toString().toDouble()
    print("Desconto: ")
    func.desconto = readLine().toString().toDouble()

    println("Dados do funcionário: ${func.nome}, R$${func.salarioLiquido()}")

    print("Deseja aumentar o salário em qual porcentagem?")
    var porcent = readLine().toString().toDouble()

    println("Dados do funcionário: ${func.nome}, R$${func.aumentarSalario(porcent)}")
}