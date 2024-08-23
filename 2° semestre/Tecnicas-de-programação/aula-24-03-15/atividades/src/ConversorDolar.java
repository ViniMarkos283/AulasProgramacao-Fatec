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
        double cot, dollar;

        System.out.println("Qual a cotação atual do dolar? ");
        cot = Double.parseDouble(sc.nextLine());

        System.out.println("Quantos dolares voce tem disponivel: ");
        dollar = Double.parseDouble(sc.nextLine());

        System.out.printf("O valor %.2f em dolares equivale a %.2f reais", dollar, dollar * cot);
    }
}
