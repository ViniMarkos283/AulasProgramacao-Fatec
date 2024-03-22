// nome: Marcos Vinicius de Oliveira
// RA: 2171392321015
// Objetivo: 6 - Faça um programa na Linguagem Java para calcular e apresentar o
// valor do volume de uma lata de óleo, utilizando a fórmula:
// VOLUME <-- 3.14159 * RAIO2
// * ALTURA.

import java.util.Scanner;

public class volumeLata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do raio da lata de óleo: ");
        double raio = Double.parseDouble(sc.nextLine());

        System.out.println("Informe o valor da altura da lata de óleo em cm: ");
        double alt = Double.parseDouble(sc.nextLine());

        double vol = 3.14159 * raio*raio * alt;

        System.out.println("O volume da sua lata de óleo é de: " + vol);

    }
}
