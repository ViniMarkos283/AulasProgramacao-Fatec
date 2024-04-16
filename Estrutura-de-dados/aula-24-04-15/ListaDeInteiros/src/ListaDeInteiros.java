public class ListaDeInteiros {
    private int dados[];
    private int tamanho;

    public ListaDeInteiros(int capMax) {
        dados = new int[capMax];
        tamanho = 0;
    }

    public void adicionaFinal(int e) {
        if (dados.length != tamanho) { // se n estiver cheia...
            dados[tamanho] = e;
            tamanho += 1;
        } else { // se estiver cheia...
            System.out.println("Erro!, lista cheia!");
        }
    }

    public int removeFinal() throws Exception { // remove o ultimo valor da lista
        int r = 1;
        if (tamanho != 0) { // se for diferente de zero...
            r = dados[tamanho - 1];
            tamanho = tamanho - 1;
        } else { // se o tamanho da lista for = a zero...
            throw new Exception("Erro!, Lista vazia!"); // dispara uma msg de erro com a mensagem escolhida
        }
        return r;
    }

    public void adicionaInicio(int e) throws Exception {
        if (tamanho == dados.length) {
            throw new Exception("Erro! a lista está cheia!");
        } else {
            for (int i = tamanho - 1; i >= 0; i--) { // inicializa o indice [i] pelo -1
                dados[i + 1] = dados[i];
            }
            dados[0] = e;
            tamanho++;
        }
    }

    public int removeInicio() throws Exception {
        int r = 1;
        if (tamanho != 0) {
            r = dados[tamanho + 1];
            tamanho -= 1; // terminar dps
        } else {
            throw new Exception("Erro! lista vazia!");
        }

        return r;
    }

    public String toString() { // retorna todos os valores de dentro da lista
        String r = ""; // inicializa um str vazia | tamanho 0
        for (int i = 0; i < tamanho; i++) {
            r += dados[i] + "\t"; // \t é um TAB
        }
        return r;
    }

}