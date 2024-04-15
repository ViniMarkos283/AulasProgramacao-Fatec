/******************************************************************************
- para usar potencias no java tem q importar o math, dps chama ele junto ao .pow(base,expoente)
- para o olhar a doc dele, pesquisa math java expecification no google
*******************************************************************************/
import java.util.Scanner;
import java.lang.Math;

public class opLogicos
{
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       
	       System.out.println("Digite o 1 valor: ");
	       int A = Integer.parseInt(sc.nextLine());
	       double res = Math.pow(A,2);
	       System.out.println("Digite o 2 valor: ");
	       int B = Integer.parseInt(sc.nextLine());
	       System.out.println("Digite o 3 valor: ");
	       int C = Integer.parseInt(sc.nextLine());
	       
	       if (A==B || B==C || C==A){
	           System.out.println("Há numeros repetidos");
	       }else{
	           System.out.println("Não há numeros repetidos");
	       }
	}
}
