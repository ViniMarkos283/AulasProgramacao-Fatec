//Nome: Marcos Vinicus de Oliveira
//RA: 2171392321015
// Objetivo: 33. Faça um programa na Linguagem  Java  para apresentar o total da 
// soma obtida dos cem primeiros números inteiros ( 1 + 2 + 3 + 4 + .... 98+ 99+ 100).

public class SomaDosCem {
    public static void main(String[] args) {
        System.out.println("Soma dos valores entre 1 e 100:");
        int i = 0;
        int j = 0;

        while (i <= 100){
            System.out.printf("Somando: %d + %d = %d\n", j, i, j + i);
            j += i;
            i++;
        }

        System.out.println("\nSoma total: " + j);
        
    }
}
