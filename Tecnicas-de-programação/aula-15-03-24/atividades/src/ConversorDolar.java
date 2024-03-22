// nome: Marcos Vinicius de Oliveira
// RA: 2171392321015
// Objetivo: 10 - Faça um programa na Linguagem Java que efetue a apresentação
// do valor da conversão em real de um valor lido em dólar. O programa
// deve solicitar o valor da cotação do dólar e também a quantidade de
// dólares disponível com o usuário, para que seja apresentado o valor
// em moeda brasileira.

import java.util.Scanner;

public class ConversorDolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double real, dollar;

        System.out.println("Qual a cotação atual do dolar?");
        dollar = Double.parseDouble(sc.nextLine());

        System.out.println("Qual o valor em Reais que voce quer converter para dolar:");
        real = Double.parseDouble(sc.nextLine());

        System.out.printf("O valor %.2f em reais equivale a %.2f dolares", real, real / dollar);
    }
}
