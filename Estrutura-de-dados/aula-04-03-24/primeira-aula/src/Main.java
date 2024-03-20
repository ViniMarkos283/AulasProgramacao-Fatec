/******************************************************************************
- para comentar, usa o barra + asterisco
- a classe q inicia o projeto é o Main.java
- toda a classe começa com maiuscula,
quando é composto, todas as palavras iniciam maisuculas
- o java é caseSensitive
- o static indica q n precisa de instancia
- void main indica q n tem retorno
- printf é saida formatada / print não pula linha / println pula linha
- system.in = entrada / system.out = saida
- não esquecer do ponto e virgula
- para achar docs dos metodos, usa: [metodo] java specification
- dá pra declarar mais de uma var na msm linha, usa-se a virgula para isso 
*******************************************************************************/
import java.util.Scanner; /* importa o scanner */

public class Main
{
	public static void main(String[] args) { /* o main é sempre public static */
		System.out.println("Digite o seu nome: ");
		Scanner sc = new Scanner(System.in); /* o new é um construtor, constroi o objeto */
		String nome = sc.nextLine();  /* tipo e nome da var = nome do scanner junto ao nestline (para strings) */
		System.out.println("Digite a sua idade: ");
		int idade = Integer.parseInt(sc.nextLine()); /* meio alternativo de obter o inteiro */
		System.out.println("nome digitado: " + nome + "\nidade digitada: " + idade); /* concatenação igual do python */
		

	}
}
