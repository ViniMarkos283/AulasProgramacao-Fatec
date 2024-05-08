public class App {
    public static void main(String[] args) throws Exception {
        Matematica matematica = new Matematica(); // instancia da classe Matematica para metodos não estaticos

        // Sem metodos estaticos
        System.out.println(matematica.soma(10, 7));
        System.out.println(matematica.soma(1, 3, 5));
        System.out.println(matematica.soma(4.5, 5.9) + "\n");

        // Com metodos estaticos
        System.out.println(MatematicaStatic.soma(10, 7));
        System.out.println(MatematicaStatic.soma(1, 3, 5));
        System.out.println(MatematicaStatic.soma(4.5, 5.9));

    }
}