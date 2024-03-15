// nome: Marcos Vinicius de Oliveira
// RA: 2171392321015
// Objetivo: 7 - Faça um programa na Linguagem Java que leia a idade de uma 
// pessoa expressa em ano, mês e dia e mostre-as em dias.

import java.util.Scanner;

public class ConversorAnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, month, day, totalDays;

        System.out.println("Digite a sua idade em anos: ");
        year = Integer.parseInt(sc.nextLine());
        System.out.println("A partir do seu ultimo aniversário, quantos meses se passaram: ");
        month = Integer.parseInt(sc.nextLine());
        System.out.println("A partir do dia do seu aniversário, quantos \ndias tem de diferença para o dia de hoje: ");
        day = Integer.parseInt(sc.nextLine());

        totalDays = day + (month * 30) + (year * 365);

        System.out.println("Desde o dia em que voce nasceu, se passaram aproximadamente " + totalDays + " dias.");

    }
}
