/* Anotações do dia 23/04/24 e do dia 29/04/24
 * FIFO = first in first out (quem chega primeiro, sai primeiro)
 * LIFO = last in first out (quem chega por ultimo, sai primeiro)
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha p1 = new Pilha(11);
        Fila f1 = new Fila(11);

        System.out.println("Digite o seu RA:");
        String ra = sc.nextLine();
        int i = 0;

        while (i < ra.length()) {
            f1.adicionar(ra.charAt(i));
            i++;
        }

        while (!f1.vazio()) {
            p1.empilhar(f1.remover());
        }

        System.out.println("Pré alteração:");
        System.out.println(f1.toString());
        System.out.println(p1.toString());

        while (!f1.vazio()) {
            p1.empilhar(f1.remover());
        }

        while (!p1.vazio()) {
            f1.adicionar(p1.desempilhar());
        }

        System.out.println("Pós alteração:");
        System.out.println(f1.toString());
        System.out.println(p1.toString());

        sc.close();

    } // Quebrado, tem q arrumar
}
