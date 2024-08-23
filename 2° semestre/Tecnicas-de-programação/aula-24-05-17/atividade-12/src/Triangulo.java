public class Triangulo extends Figura {

    private double base, altura;

    public Triangulo(double base, double altura, String cor) {
        this.base = base;
        this.altura = altura;
        setCor(cor);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area() {
        return base * altura / 2;
    }

    @Override
    public String toString() {
        return "Triangulo [base=" + base + ", altura=" + altura + ", getCor()=" + getCor() + ", area()=" + area() + "]";
    }

}
