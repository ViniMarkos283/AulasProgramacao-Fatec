public class Retangulo {
    public double largura;
    public double altura; 

    public double area(double largura, double altura) {
        return largura * altura;
    }

    public double perimetro(double largura, double altura) {
        return 2 * (largura + altura);
    }

    public double diagonal(double largura, double altura) {
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }
}
