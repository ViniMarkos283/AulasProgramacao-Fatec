/* 
 Instruções
Crie um programa em Java que mostre as tabuadas de 2 ao 10, exibindo os resultados conforme abaixo:
2 x 0 = 0
2 x 1 = 2
2 x 2 = 4 ....
Faça as tabuada primeiro utilizando a estrutura WHILE e depois crie utilizando a estrutura FOR
*/

public class App2 {
    public static void main(String[] args) throws Exception {
        // // com while
        int x = 0;
        int y = 2;

        while (y <= 10) {
            while (x <= 10) {
                System.out.printf("%d X %d = %d\n", y, x, x * y);
                x++;
            }
            y++;
            x = 0;
            System.out.println("");
        }

        // com o for
        for (int j = 2; j <= 10; j++) {
            for (int i = 0; i <= 10; i++) {
                System.out.printf("%d X %d = %d\n", j, i, i * j);
            }
            System.out.println("");
        }
    }
}
