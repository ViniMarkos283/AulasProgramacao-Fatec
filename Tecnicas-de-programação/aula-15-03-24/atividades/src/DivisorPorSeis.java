// nome: Marcos Vinicius de Oliveira
// RA: 2171392321015
// Objetivo: 13 - Faça um programa na Linguagem Java que receba um número e
// mostre o resto da divisão por 6.

import java.util.Scanner;

public class DivisorPorSeis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int n = Integer.parseInt(sc.nextLine());

        System.out.printf("O resto da divisão de %d por 6 é de: %d", n, n % 6);
    }
}
