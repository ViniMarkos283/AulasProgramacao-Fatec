/******************************************************************************
- como splitar os valores do Scanner
*******************************************************************************/
import java.io.IOException;
import java.util.Scanner;
 
public class split {
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    String linha1 = sc.nextLine();
    String div1[] = linha1.split(" ");
    String linha2 = sc.nextLine();
    String div2[] = linha2.split(" ");
    
    int cod1 = Integer.parseInt(div1[0]);
    int qtd1 = Integer.parseInt(div1[1]);
    double val1 = Double.parseDouble(div1[2]);
    
    int cod2 = Integer.parseInt(div2[0]);
    int qtd2 = Integer.parseInt(div2[1]);
    double val2 = Double.parseDouble(div2[2]);
    
    double total = (qtd1 * val1) + (qtd2 * val2);
    
    System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    
    }
}