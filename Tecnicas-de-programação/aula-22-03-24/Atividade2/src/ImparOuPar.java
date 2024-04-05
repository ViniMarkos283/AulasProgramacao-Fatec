//Nome: Marcos Vinicus de Oliveira
//RA: 2171392321015
// Objetivo: 24. Faça um programa na Linguagem  Java  que efetue a leitura de um número 
// inteiro e apresentar uma mensagem informando se o número é par ou ímpar.

import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int x = Integer.parseInt(sc.nextLine());

        if(x % 2 == 0){
            System.out.println("O valor digitado é Par!");
        }else{
            System.out.println("O valor digitado é Impar!");
        }
        
    }
}
