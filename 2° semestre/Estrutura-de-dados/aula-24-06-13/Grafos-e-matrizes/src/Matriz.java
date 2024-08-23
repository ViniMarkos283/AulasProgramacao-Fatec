public class Matriz {
    private int matriz[][]; // matriz de inteiros

    public Matriz(int linhas, int colunas) { // construtor da matriz
        matriz = new int[linhas][colunas];
    }

    public void adiciona(int linha, int coluna) {
        if(linha >= 0 && linha < matriz.length && coluna >= 0 && coluna < matriz[linha].length){ // se as linhas e colunas forem maiores q zero e menores q o tamanho maixmo da matriz...
            matriz[linha][coluna] = 1; // a localização escolhida receberá 1
        }else{
            System.out.println("Linha ou coluna inválida"); // é invalida quando n atende as condições do if
        }
    }

    // desenha a matriz
    public String toString(){
        String s = "";
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                s = s + matriz[i][j] + "\t"; // atribui a matriz e um espaço ao S
            }
            s = s + "\n"; // pula de linha
        }
        return s; // retorna a matriz
    }
}
