public class App {
    public static void main(String[] args) throws Exception {
        Figura fig;

        fig = new Circulo(20, "Vermelho");
        System.out.println(fig.toString() + '\n');

        // fig = new Quadrado(10, "Amarelo");
        // System.out.println(fig.toString() + '\n');

        fig = new Retangulo(10, 20, "verde");
        System.out.println(fig.toString() + '\n');

        fig = new Triangulo(15, 12, "Azul");
        System.out.println(fig.toString() + '\n');
    }
}
