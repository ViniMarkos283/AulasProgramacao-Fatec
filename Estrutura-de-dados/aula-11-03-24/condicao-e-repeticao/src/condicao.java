/******************************************************************************

*******************************************************************************/
import java.util.Scanner;

public class condicao
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Digite um número inteiro: ");
	    int value = Integer.parseInt(sc.nextLine());
	    if (value %2 == 0){ /* condição if, se for divisivel por 2 e dar zero, ent cond1, senao, cond2 */
	        System.out.println("O valor é par");
	    }else{
	        System.out.println("O valor é impar");
	    }

	}
}
