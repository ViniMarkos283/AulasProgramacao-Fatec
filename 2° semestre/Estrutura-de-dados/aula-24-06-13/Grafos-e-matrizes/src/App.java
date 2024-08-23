import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int linhas, colunas, opcao, l, c;

        System.out.println("Quantas vertices seu grafo tem?");
        linhas = sc.nextInt();
        colunas = linhas;
        Matriz m = new Matriz(linhas, colunas);

        // m.adiciona(0, 1);// marca uma localização na matriz, que receberá 1
        // m.adiciona(0, 2);
        // m.adiciona(0, 3);
        // m.adiciona(1, 0);

        do{
            System.out.println("Adiciona uma aresta?\n0 - não\n1 - sim");
            opcao = sc.nextInt();
            if(opcao == 1){
                System.out.println("Digite o valor da linha:");
                l = sc.nextInt();
                System.out.println("Digite o valor da linha:");
                c = sc.nextInt();

                m.adiciona(l, c);
            }
            else{
                break;
            }
        }
        while (opcao != 0);

        System.out.println("---------------- Matriz ----------------");
        System.out.println(m.toString()); // mostra a matriz desenhada
    }
}
