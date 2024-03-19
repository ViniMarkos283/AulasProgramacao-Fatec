// nome: Marcos Vinicius de Oliveira
// RA: 2171392321015
// Objetivo: 5 -  Faça um programa na Linguagem Java que leia uma temperatura 
// em graus Fahrenheit e apresentá-la convertida em graus Celsius. A 
// formula de conversão é C <-- (F - 32) * (5/9), sendo f a temperatura 
// em Fahrenheit e C a temperatura em Celsius.

import java.util.Scanner;

public class ConversorDeTemperatura2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int F, C;

        System.out.println("Digite a temperatura em Fahrenheit: ");
        F = Integer.parseInt(sc.nextLine());

        C = (F - 32) * (5/9);

        // terminar em casa...

    }
}
