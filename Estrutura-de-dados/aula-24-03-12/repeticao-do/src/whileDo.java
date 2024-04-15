/******************************************************************************
12/03/24
*******************************************************************************/
import java.util.Scanner;

public class whileDo
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int op, v1, v2;

        do{
            System.out.println("-----Menu-----\n1 - somar 2 Números\n2 - Multiplicar 2 números\n9 - Sair\n");
            op = Integer.parseInt(sc.nextLine());

            switch (op){

                case 1:
                    System.out.println("1. Valor: ");
                    v1 = Integer.parseInt(sc.nextLine());
                    System.out.println("2. Valor: ");
                    v2 = Integer.parseInt(sc.nextLine());
                    System.out.printf("%d + %d = %d", v1, v2,(v1 + v2));
                    break;

                case 2: 
                    System.out.println("1. Valor: ");
                    v1 = Integer.parseInt(sc.nextLine());
                    System.out.println("2. Valor: ");
                    v2 = Integer.parseInt(sc.nextLine());
                    System.out.printf("%d x %d = %d", v1, v2,(v1 * v2));
                    break;

                case 9:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção Inválida");
            }
        }
        while (op != 9); // enquanto o while n receber um 9, ele vai continuar repetindo o script
    }
}
