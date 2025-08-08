//Nome: Marcos Vinicus de Oliveira
//RA: 2171392321015
// Objetivo: 19. Faça um programa na Linguagem  Java  que leia quatros valores 
// referentes a quatro notas escolares de um aluno e imprimir uma mensagem dizendo 
// que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 7. 
// Se o aluno não foi aprovado, indicar uma mensagem informando esta condição. 
// Apresentar junto das mensagens o valor da média do aluno para qualquer condição.

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nt1, nt2, nt3, nt4, media;

        System.out.println("Digite a 1o. nota: ");
        nt1 = Integer.parseInt(sc.nextLine());
        System.out.println("Digite a 2o. nota: ");
        nt2 = Integer.parseInt(sc.nextLine());
        System.out.println("Digite a 3o. nota: ");
        nt3 = Integer.parseInt(sc.nextLine());
        System.out.println("Digite a 4o. nota: ");
        nt4 = Integer.parseInt(sc.nextLine());

        media = (nt1 + nt2 + nt3 + nt4) / 4;

        if (media >= 7){
            System.out.printf("Média %d: Aprovado!", media);
        }
        else{
            System.out.printf("Média %d: Reprovado!", media);
        }


        
    }
}
