//Nome: Marcos Vinicus de Oliveira
//RA: 2171392321015
// Objetivo: 31. Faça um programa na Linguagem Java que que receba um número e mostre o 
// fatorial desse número.

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, fat = 1;

        System.out.println("Digite um valor:");
        x = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= x; i++){
            fat = fat * i;
            System.out.println(fat);
        }
        System.out.println("O fatorial é de: " + fat);
    }
}
