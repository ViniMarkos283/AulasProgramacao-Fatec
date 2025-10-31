package br.gov.sp.cps.vestibularalunos.model;

public class Aluno {
    private String nome, cpf, curso;
    private double nota;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCurso() {
        return curso;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Aluno(String nome, double nota, String cpf, String curso){
        this.nome = nome;
        this.nota = nota;
        this.cpf = cpf;
        this.curso = curso;
    }

}
