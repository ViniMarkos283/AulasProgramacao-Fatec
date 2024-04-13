//Nome: Marcos Vinicius de Oliveira
//RA: 2171392321015
// Objetivo: 
//  57. Fazer um programa para ler os dados de uma conta corrente:
// ·      Número da Conta;
// ·      Nome do Cliente;
// ·      CPF;
// ·      Saldo Da conta.
// Em seguida, mostrar a tela todos os atributos. Utilize classe.
// 58. No exercício anterior crie 2 métodos

import java.util.Scanner;

public class leituraConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaCorrente cc = new ContaCorrente();

        System.out.println("Digite o numero da conta:");
        cc.setNumConta(Integer.parseInt(sc.nextLine()));

        System.out.println("Digite o seu nome: ");
        cc.setNomeCliente(sc.nextLine());

        System.out.println("Digite o seu CPF: ");
        cc.setCpf(sc.nextLine());

        System.out.println("Digite o saldo da conta:");
        cc.setSaldo(Double.parseDouble(sc.nextLine()));

        System.out.println("Numero da conta: " + cc.getNumConta());
        System.out.println("Nome do Cliente: " + cc.getNomeCliente());
        System.out.println("CPF: " + cc.getCpf());
        System.out.println("Saldo: R$" + cc.getSaldo());

    }
}
