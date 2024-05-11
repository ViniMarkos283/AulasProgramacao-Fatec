//Nome: Marcos Vinicius de Oliveira
//RA: 2171392321015
// Objetivo: 75. Crie uma classe chamada Livro que represente um livro. A classe deve
// ter campos para o título, autor e ano de publicação do livro. Escreva um
// programa principal que demonstre o uso dessa classe.
// Obs. A classe deverá ter:
// I. Construtor;
// II. Modificadores de acesso, conforme o padrão Java;
// III. Getters e Setters;
// IV. Classe principal.

public class Livro {
    private String titulo, autor;
    private int ano;
    
    @Override
    public String toString() {
        return "Livro: " + titulo + ", \nautor:" + autor + ", \nano:" + ano;
    }

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
