public class Circulo extends Figura {
    private double raio;

    public Circulo(double raio, String cor) {
        this.raio = raio;
        setCor(cor);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double area() {
        return 3.14159 * (raio * raio);
    }

    public double getDiametro() {
        return 2 * raio;
    }

    @Override
    public String toString() {
        return "Circulo [getCor()=" + getCor() + ", getRaio()=" + getRaio() + ", area()=" + area() + ", getDiametro()="
                + getDiametro() + "]";
    }
}
