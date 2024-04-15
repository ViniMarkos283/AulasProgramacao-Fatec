/******************************************************************************
- system.in é um canal de entrada
- para converter str para double, usa o Double.parseDouble()
- x++ ou ++x é fazer o x = x + 1, porem um mostra antes e dps soma (x++) e o outro soma e dps mostra (++x)
- primeiro ele atualiza o valor e dps ele concatena

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("Resultado 1: " +(x++));
		System.out.println("Resultado 2: " + x);
	}
}
