public class App {
    public static void main(String[] args) throws Exception {
        int vet[] = {2,-4, 7, 0, -1, 4};

        System.out.println(Metodos.metodoB(7, 2)); // metodo da somatória
        System.out.println(Metodos.metodoF(vet, 6)); // metodo recursivo F, soma somente maiores q zero
        System.out.println(Metodos.fibonacci(5)); // colocar valores altos quebra esse metodo, pq chama muitas vezes ele mesmo
    }
}
 // em casa, fazer o exe 4