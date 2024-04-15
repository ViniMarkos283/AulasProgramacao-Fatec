public class ListaDeInteiros {
    private int dados[];
    private int tamanho;

    public ListaDeInteiros(int capMax){
    dados = new int[capMax];
    tamanho = 0;
}

public void adicionaFinal(int e){
    if (dados.length != tamanho ) { // se n estiver cheia...
        dados[tamanho] = e;
        tamanho += 1;
    }
    else{ // se estiver cheia...
        System.out.println("Erro!, lista cheia!");
    }
}

public String toString(){ // ???
    String r = ""; // inicializa um str vazia | tamanho 0
    for(int i = 0; i < tamanho; i++){
        r += dados[i] + "\t"; // \t é um TAB
    }
    return r;
}

}