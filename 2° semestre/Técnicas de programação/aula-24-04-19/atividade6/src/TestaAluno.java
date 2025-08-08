//Nome: Marcos Vinicius de Oliveira
//RA: 2171392321015
// Objetivo:
/* 68. Implemente um código possível para a classe da figura abaixo.
    Aluno
    - nome: String
    matricula: String
    nota1: double
    nota2: double
    notaReavaliacao: double
    + Aluno()
    + Aluno(String nome, double matricula, double nota1, double nota2, double
    notaReavaliacao) + toString(): String
    + calcularMedia(): double
    + calcularMediaFinal(): double
    a. calcularMedia()
    Deve calcular a média das notas (nota1 + nota2)/2
    Retornar valor double
    b. calcularMediaFinal()
    Se calcularMedia() >= 6
    • retornar calcularMedia()
    Senão
    • retornar (calcularMedia() + notaReavaliacao)/2
    C. Crie uma classe para testar a classe Aluno
*/

public class TestaAluno {
    public static void main(String[] args) {
        Aluno al1 = new Aluno();
        Aluno al2 = new Aluno("Robson", "34345343", 10, 7, 8);
        Aluno al3 = new Aluno("Pedro", "32323232", 5, 2, 6);
        Aluno al4 = new Aluno("Marcos", "10101010", 10, 10, 0);
        Aluno al5 = new Aluno("Kauan", "45454545", 4, 2, 5);

        System.out.println(al1.toString());
        System.out.println(al2.toString());
        System.out.println(al3.toString());
        System.out.println(al4.toString());
        System.out.println(al5.toString());
    }
}
