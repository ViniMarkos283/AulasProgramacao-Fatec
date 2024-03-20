/******************************************************************************
  11/03/24
- try catch: tratamento de erros
- usar ele faz com que a gente possa mudar a msg de erro quando alguma inconsistencia acontecer

- switch: é outra estrutura de condição, mas usa cases no lugar de varios ifs 
- o default faz o msm que o else, se nenhum for aceito, ele executa no final
- cases q resultam no msm resultado podem ser colocados juntos igual no codigo abaixo
*******************************************************************************/
import java.util.Scanner;

public class repeticaoSwitch
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.println ("Digite o ultimo digito da placa: ");
	  try{
	  int digito = Integer.parseInt (sc.nextLine ());
		  switch (digito){
			case 1:
			case 2:
			      System.out.println ("Rodizio 2a. feira");
			      break;
			case 3:
			case 4:
			      System.out.println ("Rodizio 3a. feira");
			      break;
			case 5:
			case 6:
			      System.out.println ("Rodizio 4a. feira");
			      break;
			case 7:
			case 8:
			      System.out.println ("Rodizio 5a. feira");
			      break;
			case 9:
			case 0:
	              System.out.println ("Rodizio 6a. feira");
	              break;
	       default:
	       System.out.println("digito invalido, use somente entre o intervalo de 0 a 9");
		  }
	  }
	catch (Exception e){
	System.out.println ("O valor digitado precisa ser um numero inteiro");
	}
  }

}
