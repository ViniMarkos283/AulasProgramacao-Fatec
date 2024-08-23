public class Quadrado extends Retangulo {
    public Quadrado(double lado, String cor) {
        super(lado, lado, cor);
    }

    @Override
    public String toString() {
        return "Quadrado [lado=" + getLado1() + ", cor=" + getCor() + "]";
    }
}
