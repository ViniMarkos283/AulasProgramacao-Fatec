import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        System.out.println("Entre com seu nome: ");

        String nome = meuScanner.nextLine();
        System.out.println("Seu nome é: " + nome);
    }
}
