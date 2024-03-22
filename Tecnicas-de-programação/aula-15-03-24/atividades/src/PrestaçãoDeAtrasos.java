// nome: Marcos Vinicius de Oliveira
// RA: 2171392321015
// Objetivo: 9 - Faça um programa na Linguagem Java para efetuar o cálculo e a
// apresentação do valor de uma prestação em atraso, utilizando a
// fórmula PRESTAÇÃO <-- VALOR + (VALOR * (TAXA/100) *
// TEMPO).

import java.util.Scanner;

public class PrestaçãoDeAtrasos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do financiamento: ");
        double val = Double.parseDouble(sc.nextLine());

        System.out.println("Digite o valor da taxa: ");
        double tax = Double.parseDouble(sc.nextLine());

        System.out.println("Digite o periodo em meses: ");
        double temp = Double.parseDouble(sc.nextLine());

        System.out.printf("O valor da prestação total é de: %.2f", val + (val * (tax/100)) * temp);
        
    }
}
