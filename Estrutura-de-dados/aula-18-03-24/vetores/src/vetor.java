/******************************************************************************
- aula dia 18/03/24
*******************************************************************************/
import java.util.Scanner;

public class vetor{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int count = 0;
		int vet[] = new int[5]; // alocar local suficiente para receber o vetor (é tipo criar objeto / lista com tamanho 5)
        for (int i = 0; i < vet.length; i++){
            System.out.printf("Digite o %d o. valor: ", (i+1)); // formatação pra exibir todos os n em uma só msg
            vet[i] = sc.nextInt();
        }
            for (int i = 0; i < vet.length; i++){
                System.out.printf("vet[%d] = %d\n", i , vet[i]);
            }
            System.out.println("Invertendo ordem...");

            for (int i = vet.length-1; i >= 0; i--){ // exibe o vetor na ordem inversa
                System.out.printf("vet[%d] = %d\n", i , vet[i]);
            }

            for (int i = 0; i < vet.length; i++){ // contador de pares
                if(vet[i] % 2 == 0){
                    count++;
                }
            }
            System.out.println("Dos números digitados, " + count + " deles são pares");
            System.out.println("Enquanto os outros " + (vet.length - count) + " são impares");
        } // fim do metodo main
	} // fima da classe main

