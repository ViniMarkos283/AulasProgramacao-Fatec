public class Aluno {
    private String nome, matricula;
    private double nota1, nota2, notaReavaliacao;

    public Aluno() {
    }

    public Aluno(String nome, String matricula, double nota1, double nota2, double notaReavaliacao) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaReavaliacao = notaReavaliacao;
    }

    @Override
    public String toString() {
        return "Nome do Aluno = " + nome + ",\nmatricula = " + matricula + ",\nnota1 = " + nota1 + ",\nnota2 = " + nota2
                + ",\nnotaReavaliacao = " + notaReavaliacao + "\nMédia Final = " + calcularMediaFinal() + "\n";
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public double calcularMediaFinal() {
        if (calcularMedia() >= 6) {
            return calcularMedia();
        } else {
            return (calcularMedia() + notaReavaliacao) / 2;
        }
    }

}
