/* 
Matrizes: 
- como é
10  15  20
21  31  41
76 152 304

- como atribui
- ordem: linha/coluna
- matriz[i][j] = value
- [][] = duas dimensoes
- parece plano cartesiano, o i e j tem os msm val de x e y

m1 [0][0] = 10
m1 [0][1] = 15
m1 [0][2] = 20

m1 [1][0] = 21
m1 [1][1] = 31
m1 [1][2] = 41

m1 [2][0] = 76
m1 [2][1] = 152
m1 [2][2] = 304
*/

import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1[][] = new int[3][3]; // como declarar uma matriz, sendo os [qtd linha][qtd coluna]

        for (int i = 0; i < m1.length; i++){ // possui 2 fors seguidos, um pra o [i] e outro para o [j], o ordem vai no segundo
            for (int j = 0, ordem = 1; j < m1[i].length; j++, ordem++){ // o ordem diz em qual n. da matriz eu estou
                System.out.printf("Digite o %d o. valor ", ordem);
                m1[i][j] = sc.nextInt(); // leitura do valor e atribuição na matriz
            }
        }
        for (int i = 0; i < m1.length; i++){ // for para exibição da matriz
            for (int j = 0; j < m1[i].length; j++){
                System.out.printf("m1[%d][%d] = %d\t", i, j, m1[i][j]); // o \t dá um espaço na exibição
            }
            System.out.println("");
        }
    }
}
