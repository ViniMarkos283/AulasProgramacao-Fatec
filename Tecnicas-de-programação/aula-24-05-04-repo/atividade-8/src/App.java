//Nome: Marcos Vinicius de Oliveira
//RA: 2171392321015
// Objetivo: 72. Fazer um programa para ler o nome de um aluno e as três notas que ele
// obteve nos três trimestres do ano (primeiro trimestre vale 30 e o segundo
// e o terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
// ano. Dizer também se o aluno está aprovado ou não e, em caso negativo,
// quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que
// é 60% da nota). Você deve criar uma classe Aluno para resolver este
// problema.


// esta é a classe App

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        aluno.recebeNome(sc.nextLine());
        aluno.recebeNota1(sc.nextDouble());
        aluno.recebeNota2(sc.nextDouble());
        aluno.recebeNota3(sc.nextDouble());
        
        aluno.retornaValores();
    }
    
}
