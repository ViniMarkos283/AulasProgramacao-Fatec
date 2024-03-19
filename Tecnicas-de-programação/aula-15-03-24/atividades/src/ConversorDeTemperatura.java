// nome: Marcos Vinicius de Oliveira
// RA: 2171392321015
// Objetivo: 4 - Faça um programa na Linguagem Java que leia uma temperatura em 
// graus Celsius e apresentá-la convertida em graus Fahrenheit. A 
// fórmula de conversão é F <-- (9 * C + 160) /5, sendo f a temperatura 
// em Fahrenheit e C a temperatura em Celsius.

import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C, F;

        System.out.println("Digite a temperatura em graus Celsius: ");
        C = Integer.parseInt(sc.nextLine());

        F = (9 * C + 160)/ 5;

        System.out.println("A temperatura convertida para Fahrenheit é: " + F);
    }
}
