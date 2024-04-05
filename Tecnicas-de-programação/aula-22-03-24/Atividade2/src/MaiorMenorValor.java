//Nome: Marcos Vinicus de Oliveira
//RA: 2171392321015
// Objetivo: 23. Faça um programa na Linguagem  Java  que efetue a leitura de cinco números 
// inteiros e identificar o maior e o menor valor. Não execute a ordenação de valores.

import java.util.Scanner;

public class MaiorMenorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min, max, n;

        System.out.println("Digite o 1o. valor: ");
        n = Integer.parseInt(sc.nextLine());
        min = n;
        max = n;

        for (int i = 0; i < 4; i ++){
            System.out.printf("Digite o %do. valor: \n", i + 2);
            n = Integer.parseInt(sc.nextLine());

            if(n > max){
                max = n;
            }else if( n < min){
                min = n;
            }
        }
        System.out.printf("Maior valor: %d \nMenor Valor: %d\n", max, min);
        
    }
}
