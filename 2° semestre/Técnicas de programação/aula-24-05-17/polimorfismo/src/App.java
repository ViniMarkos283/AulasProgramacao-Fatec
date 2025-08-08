public class App { // teste de polimorfismo
    public static void main(String[] args) throws Exception {
        Bicho b; // declaração do objeto, mas não iniciado (reaproveitamento de objeto)
        b = new Cachorro(); // instancia Cachorro no objeto b
        b.falar(); //metodo falar do cachorro

        b = new Gato(); // instancia GAto no objeto b
        b.falar(); // metodo falar do gato
    }
}
