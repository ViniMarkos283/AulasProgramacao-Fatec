//Nome: Marcos Vinicus de Oliveira
//RA: 2171392321015
// Objetivo: 48. Criar uma coleção “A” na linguagem Java com 10 elementos–	
// Inserir os elementos de 1 a 10 na coleção–	Criar uma outra coleção B que conterá o elemento da coleção A multiplicado por 2–	
// Mostrar as duas coleçõesObs. Não efetuar a leitura de 10 elementos

public class ColecaoAeB {
    public static void main(String[] args) {
        int colecaoA[] = new int[10];
        int colecaoB[] = new int[10];

        for(int i = 0; i < colecaoA.length; i++){
            colecaoA[i] = i+1;
            colecaoB[i] = colecaoA[i] * 2;
        }

        System.out.println("Valores das duas coleçoes: ");
        for(int i = 0; i < colecaoA.length; i++){
            System.out.println("Coleção A: "); // terminar em casa...
        }
        
    }
}
