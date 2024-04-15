//Nome: Marcos Vinicus de Oliveira
//RA: 2171392321015
// Objetivo: 27. O cardápio de uma lanchonete é o seguinte:

// Especificação          Código                 Preço
// Cachorro quente          100                 1,20
// Bauru simples            101                 1,30
// Bauru com ovo            102                 1,50
// Hambúrger                103                 1,20
// Cheeseburguer            104                 1,30
// Refrigerante             105                 1,00
// Faça um programa na Linguagem Java que leia o código do item pedido, a quantidade e 
//calcule o valor a ser pago por aquele lanche. Considere que a cada execução somente será 
// calculado um item.

import java.util.Scanner;

public class CardapioLanchonete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod, quant;
        double price = 0.00;

        System.out.println("Digite o código do produto desejado: ");
        cod = Integer.parseInt(sc.nextLine());
        System.out.println("Digite a quantidade: ");
        quant = Integer.parseInt(sc.nextLine());

        switch (cod) {
            case 100:
            case 103:
                price = 1.20;
                break;
            case 101:
            case 104:
                price = 1.30;
                break;
            case 102:
                price = 1.50;
                break;
            case 105:
                price = 1.00;
                break;

            default:
            System.out.println("Valor Inválido!");
                break;
        }

        System.out.printf("Preço unitário: R$ %.2f\nQuantidade: %d\nTotal: R$ %.2f", price, quant, price * quant);
    }
}
