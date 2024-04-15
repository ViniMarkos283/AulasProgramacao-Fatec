// nome: Marcos Vinicius de Oliveira
// RA: 2171392321015
// Objetivo: 3 - Faça um programa na Linguagem Java que receba 2 numeros e apresente a multiplicação dos dois números

import java.util.Scanner;

public class multiDeDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Digite o 1o. valor: ");
        a = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o 2o. valor: ");
        b = Integer.parseInt(sc.nextLine());

        int mult = a * b;

        System.out.println("A multiplicação entre " + a + " e " + b + " é igual a: " + mult);
    }
}

