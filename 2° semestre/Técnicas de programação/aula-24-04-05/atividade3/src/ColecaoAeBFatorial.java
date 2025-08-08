//Nome: Marcos Vinicius de Oliveira
//RA: 2171392321015
// Objetivo: 54. Criar um vetor A do tipo inteiro de 5 elementos–	
// Solicitar os valores para o usuário e inserir no vetor A–	Criar um vetor B do tipo inteiro  –	
// Ler o vetor A e para cada elemento lido calcular o fatorial e gravar no B–	
// Após de todos os elementos do vetor A, mostrar os dois vetores

import java.util.Scanner;

public class ColecaoAeBFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetorA[] = new int[5];
        int vetorB[] = new int[5];

        for(int i = 0; i < vetorA.length; i++){
            System.out.printf("Digite o %d valor: \n", i+1);
            vetorA[i] = sc.nextInt();
            vetorB[i] = calcularFatorial(vetorA[i]);
        }

        System.out.println("Valores do vetor A: ");
        for (int i = 0; i < 5; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nValores do vetor B: ");
        for (int i = 0; i < 5; i++){
            System.out.print(vetorB[i] + " ");
        }

    }

    public static int calcularFatorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int fatorial = 1;
            for (int i = 2; i <= n; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
}
