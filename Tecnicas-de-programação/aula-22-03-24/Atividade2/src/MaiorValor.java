//Nome: Marcos Vinicus de Oliveira
//RA: 2171392321015
// Objetivo: 22. Faça um programa na Linguagem  Java  que leia 3 números inteiros e 
// mostre o maior deles.

import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, maior;

        System.out.println("Digite o primeiro valor: ");
        n1 = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o segundo valor: ");
        n2 = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o terceiro valor: ");
        n3 = Integer.parseInt(sc.nextLine());

        if(n1 > n2 && n1 > n3){
            maior = n1;            
        }else if(n2 > n1 && n2 > n3){
            maior = n2;
        }else{
            maior = n3;
        }

        System.out.println("Dos 3 digitos, o maior deles é o: " + maior);


    }
}
