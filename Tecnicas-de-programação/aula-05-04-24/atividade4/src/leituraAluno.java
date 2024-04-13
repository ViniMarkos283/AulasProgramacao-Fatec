//Nome: Marcos Vinicius de Oliveira
//RA: 2171392321015
// Objetivo:
// 59. Fazer um programa para ler os dados de um Aluno:
// ·      RA;
// ·      Nome;
// ·      Endereço;
// ·      Curso.
// Em seguida, mostrar a tela todos os atributos. Utilize classe.
// 60. No exercício anterior crie 2 métodos.

import java.util.Scanner;

public class leituraAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o RA: ");
        aluno.setRa(sc.nextLine());

        System.out.println("Digite o nome: ");
        aluno.setNome(sc.nextLine());

        System.out.println("Digite o Endereço: ");
        aluno.setEndereco(sc.nextLine());
        
        System.out.println("Digite o Curso:");
        aluno.setCurso(sc.nextLine());

        System.out.println("\nDados do aluno: ");
        System.out.println("RA: " + aluno.getRa());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Endereço: " + aluno.getEndereco());
        System.out.println("Curso: " + aluno.getCurso());

    }
}
