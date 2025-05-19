/* 
 Instruções
Crie um programa em Java que mostre as tabuadas de 2 ao 10, exibindo os resultados conforme abaixo:
2 x 0 = 0
2 x 1 = 2
2 x 2 = 4 ....
Faça as tabuada primeiro utilizando a estrutura WHILE e depois crie utilizando a estrutura FOR
*/

public class App {
    public static void main(String[] args) throws Exception {
        // com while
        int x = 0;
        while (x <=10){
            System.out.printf("2 X %d = %d\n", x, x*2);
            x++;
        }
        System.out.println("\n");
        
        // com o for
        for(int i = 0; i <= 10; i++){
            System.out.printf("2 X %d = %d\n", i, i*2);
        }
    }
}
