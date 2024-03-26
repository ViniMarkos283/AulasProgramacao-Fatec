/******************************************************************************
- dia 26/03/24

    << ordem do metodo: (o main tbm entra nessa ordem) >>
- public: especifica o acesso, pode ser public, private...
- static: anula a necesidade de instanciar o metodo
- tipo de retorno: podendo ser void, double, int, string, boolean...
- nome do metodo: igual tem na função
- parametros: passagem de parametro por referencia (endereço) do objeto
obs: colocar o tipo do valor junto ao parametro, ex: int var

- usar %d para int, e %f para double, %.2f tbm funciona (formata o n. de casas pós virgula)

*******************************************************************************/
public class CriarMetodo
{
	public static void main(String[] args) { // só o main tem interação com o user
		int valor1 = 100, valor2 = 72;
		System.out.printf("%d + %d = %d\n", valor1, valor2, soma(valor1, valor2)); // chama o metodo igual ao python
	    System.out.printf("Fora do metodo, valor da variavel A: %d\n", valor1); // valor1 fora do metodo, esse sofreu a alteração do return do metodo, sendo o valor1 a soma ja feita
	    System.out.printf("Fora do metodo, valor da variavel A: %d\n", valor2); // valor2 fora do metodo

		double v1 = 100, v2 = 72;
		System.out.printf("%f + %f = %f\n", v1, v2, soma(v1, v2));
	    System.out.printf("Fora do metodo, valor da variavel A: %f\n", v1); 
	    System.out.printf("Fora do metodo, valor da variavel A: %f\n", v2); 
	}
	
	// criação de um novo metodo
	public static int soma(int a, int b){ // metodo soma | o A e B são locais, só existem no metodo
	    a = a + b;
	    System.out.printf("Dentro do metodo, valor da variavel A: %d\n", a); // valor1 cai dentro da var A
	    System.out.printf("Dentro do metodo, valor da variavel B: %d\n", b); // a B recebe o valor de valor2
	    return a; // os metodos possuem return igual as funções, mas pra funcionar, tem q informar na estrutura do metodo qual o tipo de retorno esperado
	}
    // metodo soma mas para doubles, como tem 2 metodos com o msm nome, o proprio java vai procurar qual deles os parametros atendem melhor e usar
    // por conta dos parametros serem doubles, esse metodo é escolhido
	public static double soma(double a, double b){ 
	    System.out.printf("Dentro do metodo, valor da variavel A: %f\n", a); 
	    System.out.printf("Dentro do metodo, valor da variavel B: %f\n", b);
	    return a;
	}
}
