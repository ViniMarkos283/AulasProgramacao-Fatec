import java.util.Scanner; // importando bilbioteca Scanner

public class EntradaDados { // classe entrada de dados
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in); // criando o objeto Scanner
        System.out.println("Entre com seu nome: "); 

        String nome = meuScanner.nextLine();
        System.out.println("Seu nome é: " + nome); // saida com o valor da entrada gravado
    }
}
