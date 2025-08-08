// nome: Marcos Vinicius de Oliveira
// RA: 2171392321015
// Objetivo: 8 - Faça um programa na Linguagem Java que calcule a área da
// circunferência

import java.util.Scanner;

public class CalcularCircunferencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio da circunferencia: ");
        double ray = Double.parseDouble(sc.nextLine());
        
        System.out.printf("A area da circunferencia é de: %.2f", ray * ray * 3.14159);
    }
}
