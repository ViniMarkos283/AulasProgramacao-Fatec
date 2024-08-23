//Nome: Marcos Vinicius de Oliveira
//RA: 2171392321015
// Objetivo: 64. Fazer um programa para ler os dados de um funcionário (nome, salário
// Bruto e Desconto). Em seguida, mostrar os dados do funcionário (nome e
// salário líquido). Em seguida, aumentar o salário do funcionário com base
// em uma porcentagem dada e mostrar novamente os dados do funcionário.
// Use a classe projetada abaixo:

import java.util.Scanner;

public class LeituraFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Nome: ");
        funcionario.nome = sc.nextLine();
        System.out.println("Salário Bruto: ");
        funcionario.salarioBruto = Double.parseDouble(sc.nextLine());
        System.out.println("Desconto: ");
        funcionario.desconto = Double.parseDouble(sc.nextLine());

        System.out.println("Dados do Funcionário: " + funcionario.nome + ", R$ " + funcionario.salarioLiquido());
        System.out.println("Deseja aumentar o salario em qual porcentagem?");
        funcionario.aumentarSalario(Double.parseDouble(sc.nextLine()));
        System.out.println("Dados do Funcionário: " + funcionario.nome + ", R$ " + funcionario.salarioAjustado);

        sc.close();
    }
}
