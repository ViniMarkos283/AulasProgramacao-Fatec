//Nome: Marcos Vinicius de Oliveira
//RA: 2171392321015
// Objetivo: 77. Crie uma classe chamada Estudante que represente um estudante. A
// classe deve ter campos para o nome do estudante, a idade e a média de
// notas. Crie métodos para verificar se o estudante foi aprovado (média de
// notas maior ou igual a 7) e para imprimir informações sobre o estudante.
// Escreva um programa principal que demonstre o uso dessa classe.
// Obs. A classe deverá ter:
// I. Construtor;
// II. Modificadores de acesso, conforme o padrão Java;
// III. Getters e Setters;
// IV. Classe principal.

public class Estudante {
    private String nome;
    private int idade;
    private double medNotas;
    
    public Estudante(String nome, int idade, double medNotas) {
        this.nome = nome;
        this.idade = idade;
        this.medNotas = medNotas;
    }

    public String verificaNotas(){
        if(medNotas >= 7){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }

    @Override
    public String toString() {
        return "Estudante: " + nome + ";\nidade: " + idade + ", \nMédia: " + medNotas + "\nSituação: " + verificaNotas();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getMedNotas() {
        return medNotas;
    }

    public void setMedNotas(double medNotas) {
        this.medNotas = medNotas;
    }

    
}
