import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaDeInteiros li = new ListaDeInteiros(5);

        int op, valor;
        String menu = "Menu\n1 - Adiciona Final\n2 - Remove Final" +
                "\n3 - adiciona inicio\n4 - remove inicio" +
                "\n5 - adiciona posição especifica\n6 - remove posição especifica" +
                "\n7 - Mostrar elementos da lista\n8 - Sair";

        do { // roda o loop pelo menos uma vez sem checar a condiçao
            System.out.println(menu);
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite um valor: ");
                    valor = sc.nextInt();
                    li.adicionaFinal(valor);
                    break;
                case 2:
                    System.out.println("Remover Final");
                    break;
                case 3:
                    System.out.println("Adicionar Inicio");
                    break;
                case 4:
                    System.out.println("Remover Inicio");
                    break;
                case 5:
                    System.out.println("Adicionar posição especifica");
                    break;
                case 6:
                    System.out.println("Remover posição especifica");
                    break;
                case 7:
                    System.out.println("Mostrando todos os elementos da lista");
                    System.out.println("Lista: " + li.toString());
                    break;
                case 8:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("\tOpção Inválida, tente novamente\t");
                    break;
            }
        } while (op != 8);

        sc.close();
    }
}
