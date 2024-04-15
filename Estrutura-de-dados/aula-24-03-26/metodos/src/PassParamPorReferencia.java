public class PassParamPorReferencia { // traduzindo -> passagem de parametro por referecia
    public static void main(String[] args) {
        int vet[] = { 1, 2, 3, 4, 5 }; // array com 5 valores
        for (int i = 0; i < vet.length; i++)
            System.out.printf("%d\t", vet[i]);
        int a = 0; // posição zero, ou seja, primeiro valor
        int b = vet.length - 1; // posição 4, ultimo valor
        mudar(vet, a, b); // chamada de metodo, passando o vetor e 2 posiçoes a serem mudadas
        System.out.println();
        for (int i = 0; i < vet.length; i++)
            System.out.printf("%d\t", vet[i]);
    }

    // metodo para mudar a ordem de um vetor, não há retorno nesse metodo (void)
    public static void mudar(int v[], int inda, int indb) { // us-se uma variavel auxiliar para a mudança de valores
        int aux = v[inda];
        v[inda] = v[indb];
        v[indb] = aux;
    }
}