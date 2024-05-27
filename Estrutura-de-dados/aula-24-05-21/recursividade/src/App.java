// aulas do dia 21/05 e 27/05

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // int vet[] = {2,-4, 7, 0, -1, 4};
        int n1, n2, n3;

        Metodos met = new Metodos();
        Scanner sc = new Scanner(System.in);

        
        System.out.println("primeiro numero: ");
        n1 = sc.nextInt();
        System.out.println("Segundo numero: ");
        n2 = sc.nextInt();
        
        // System.out.println(met.metodoB(7, 2)); // metodo da somatória
        // System.out.println(met.metodoF(vet, 6)); // metodo recursivo F, soma somente maiores q zero
        // System.out.println(met.fibonacci(5)); // colocar valores altos quebra esse metodo, pq chama muitas vezes ele mesmo
        if (n1>n2){
            System.out.println("MDC = " + met.mdc(n1, n2)); // faz o mdc de dois valores, encontrando seu menor divisor em comum
        }else{
            System.out.println("MDC = " + met.mdc(n2, n1)); 
        }

        System.out.println("Qual termo de fibonacci você quer? ");
        n3 = sc.nextInt();
        int vetor[] = new int[n3];

        met.fibo(n3, vetor);
        System.out.println("elemento = " + vetor[n3-1]);


        sc.close();
    }
}
 // em casa, fazer o exe 4 [ esqueci ]