// nome: Marcos Vinicius de Oliveira
// RA: 2171392321015
// Objetivo: 12 - Faça um programa na Linguagem Java para efetuar a leitura de um
// número inteiro e apresentar o resultado do quadrado desse número.

import java.util.Scanner;

public class NumeroQuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int n = Integer.parseInt(sc.nextLine());

        System.out.printf("O valor de %d ao quadrado é: %d", n, n*n);
    }
}
