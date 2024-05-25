//Nome: Marcos Vinicius de Oliveira
//RA: 2171392321015
// Objetivo: Detalhes:	
// 1. Todas as classes devem ser feitas utilizando encapsulamento (Gets e Sets)
// 2. Classe Retangulo
// 2.1. Método area ( )  lado1 * lado2
// 2.2. Método toString ( )  deve retornar uma String com as informações da classe
// 3. Classe Triangulo
// 3.1. Método area ( )  base * altura / 2
// 3.2. Método toString ( )  deve retornar uma String com as informações da classe
// 4. Classe Circulo
// 4.1. Método area ( )  PI * raio * raio
// 4.2. Método getDiametro ( )  2 * raio
// 4.3. Método toString ( )  deve retornar uma String com as informações da classe
// 5. Criar uma classe Teste para testar todas 

public class App {
    public static void main(String[] args) throws Exception {
        Figura fig;

        fig = new Circulo(20, "Vermelho");
        System.out.println(fig.toString() + '\n');

        fig = new Quadrado(10, "Amarelo");
        System.out.println(fig.toString() + '\n');

        fig = new Retangulo(10, 20, "verde");
        System.out.println(fig.toString() + '\n');

        fig = new Triangulo(15, 12, "Azul");
        System.out.println(fig.toString() + '\n');
    }
}
