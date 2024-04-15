//Nome: Marcos Vinicius de Oliveira
//RA: 2171392321015
// Objetivo: 51. Fazer um procedimento para receber as notas da primeira e da segunda prova de cinco alunos. 
// Armazenar as notas da primeira e da segunda prova em vetores distintos. Calcular e escrever a média de cada aluno.

import java.util.Scanner;

public class VetorProvas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int prova1[] = new int[5];
        int prova2[] = new int[5];

        for (int i = 0; i < 5; i++){
            System.out.printf("Digite a nota da prova 1 do aluno %d: \n", i + 1);
            prova1[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++){
            System.out.printf("Digite a nota da prova 2 do aluno %d: \n", i + 1);
            prova2[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++){
            System.out.printf("Média do aluno %d: %d \n", i+1, (prova1[i] + prova2[i]) / 2);
        }
    } 
}
