//Nome: Marcos Vinicus de Oliveira
//RA: 2171392321015
// Objetivo: 36. Faça um programa na Linguagem  Java  que apresente os valores de conversão 
// de graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10 graus Celsius e 
// finalizando em 100 graus Celsius. O programa deve apresentar os valores das duas temperaturas.

public class ContadorGraus {
    public static void main(String[] args) {
        double C = 0;
        double F = 0;

        
        for (int i = 0; i <=100; i+=10){
            C = i;
            F = (C * 9/5) + 32;
            System.out.printf("Celsius: %.1f \t->   Fahrenheit: %.1f\n", C, F);
        }
    }
}
