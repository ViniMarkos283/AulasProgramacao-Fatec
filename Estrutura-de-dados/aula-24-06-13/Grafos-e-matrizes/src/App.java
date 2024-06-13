public class App {
    public static void main(String[] args) throws Exception {
        Matriz m = new Matriz(4, 4);

        m.adiciona(0, 1);// marca uma localização na matriz, que receberá 1
        m.adiciona(0, 2);
        m.adiciona(0, 3);
        m.adiciona(1, 0);

        System.out.println(m.toString()); // mostra a matriz desenhada
    }
}
