import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaLigada l1 = new ListaLigada();
        int choose, val;
        String menu = "Menu: \n" +
                "1 - Adiciona inicio\n" +
                "2 - Adiciona final\n" +
                "3 - Remove inicio\n" +
                "4 - Remove Final\n" +
                "5 - Mostra todos os elementos da lista\n" +
                "6 - Mostra o primeiro elemento da lista\n" +
                "7 - Mostra o último elemento da lista\n" +
                "8 - Sair";

        do {
            System.out.println(menu);
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("digite um valor: ");
                    val = sc.nextInt();
                    l1.adicionaInicio(val);
                    break;
                case 2:
                    System.out.println("digite um valor: ");
                    val = sc.nextInt();
                    l1.adicionaFinal(val);

                    break;
                case 3:
                    try {
                        System.out.println("Valor apagado: " + l1.removeInicio());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        System.out.println("Valor apagado: " + l1.removeFinal());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Estado atual da lista: \n" + l1.toString());
                    break;
                case 6:
                    System.out.println("Primeiro valor da lista: ");
                    
                    break;
                case 7:
                    System.out.println("Primeiro valor da lista: ");

                    break;
                case 8:
                    System.out.println("Saindo da sessão... sessão encerrada!");
                    break;

                default:
                    System.out.println("Opção Inválda, tente novamente!");
                    break;
            }

        } while (choose != 8);

        sc.close();
    }
}