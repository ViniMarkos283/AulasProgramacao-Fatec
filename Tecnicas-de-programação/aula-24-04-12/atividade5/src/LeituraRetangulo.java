//Nome: Marcos Vinicius de Oliveira
//RA: 2171392321015
// Objetivo: 63. Fazer um programa para ler os valores da largura e altura de um
// retângulo. Em seguida, mostrar a tela o valor da sua área, perímetro e
// diagonal. Usar uma classe como diagrama abaixo:

import java.util.Scanner;

public class LeituraRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo ret = new Retangulo();

        ret.largura = Double.parseDouble(sc.nextLine());
        ret.altura = Double.parseDouble(sc.nextLine());

        System.out.printf("AREA = ", ret.area(ret.largura, ret.altura));
        System.out.printf("PERIMETRO = ", ret.perimetro(ret.largura, ret.altura));
        System.out.printf("DIAGONAL = ", ret.diagonal(ret.largura, ret.altura));

        sc.close();

    }
}

