//Nome: Marcos Vinicus de Oliveira
//RA: 2171392321015
// Objetivo: 16. Faça um programa na Linguagem Java que leia 3 (três) valores inteiros 
// e apresente os 3 números em ordem crescente.

import java.util.Scanner;

public class NumerosCrescentes {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, maior, menor, meio;

        System.out.println("Digite o 1o. valor: ");
        n1 = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o 2o. valor: ");
        n2 = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o 3o. valor: ");
        n3 = Integer.parseInt(sc.nextLine());

        if (n1 > n2 && n1 > n3) {
            maior = n1;
        } else if (n2 > n1 && n2 > n3) {
            maior = n2;
        } else {
            maior = n3;
        }

        if (n1 > n2 && n1 < n3 || n1 < n2 && n1 > n3) {
            meio = n1;
        } else if (n2 > n1 && n2 < n3 || n2 < n1 && n2 > n3) {
            meio = n2;
        } else {
            meio = n3;
        }

        if (n1 < n2 && n1 < n3) {
            menor = n1;
        } else if (n2 < n1 && n2 < n3) {
            menor = n2;
        } else {
            menor = n3;
        }

        System.out.printf("Os valores na ordem crescente são: %d > %d > %d", menor, meio, maior);
    }
}
