//Nome: Marcos Vinicius de Oliveira
//RA: 2171392321015
// Objetivo: 46. Criar uma coleção na linguagem Java com 10 elementos
// –	Inserir os elementos de 1 a 10 no vetor	
// -    Após a inserção, somente após a inserção mostrar o vetor.
// Obs. Não efetuar a leitura de 10 elementos

public class Colecao1ao10 {
    public static void main(String[] args) {
        int colecao[] = new int[10];

        for (int i = 0; i < colecao.length; i++) {
            colecao[i] = i + 1;
        }
        System.out.println("Valores da coleção:");

        for (int i = 0; i < colecao.length; i++) {
            System.out.print(colecao[i] + " ");
        }
    }
}
