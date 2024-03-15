// nome: Marcos Vinicius de Oliveira
// RA: 2171392321015
/*  Objetivo: 11 - Faça um programa na Linguagem Java para ler dois valores inteiros
para as variáveis A e B e efetuar a troca dos valores de forma que a
variável A passe a possuir o valor da variável B e a variável B passe
a possuir o valor da variável A. Apresentar os valores trocados.
*/

import java.util.Scanner;

public class AlternarVariaveis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C;

        System.out.println("Digite o valor do A: ");
        A = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o valor de B: ");
        B = Integer.parseInt(sc.nextLine());

        System.out.println("Os valores são: A = " + A + " B = " + B);
        System.out.println("Trocando...");
        C = A;
        A = B;
        B = C;
        System.out.println("Os novos valores são: A = " + A + " 5B = " + B);

        
    }
}
