public class Arvore {
    private No raiz;                            // nó raiz

    public Arvore() {
        raiz = null;                            // a raiz inicia nula
    }

    public void percursoPreOrdem(No n) {        // vê primeiro, dps vai esquerda e direita
        if (n != null) {
            System.out.println(n.elemento);     // visitando o elemento (mostrando-o)
            percursoPreOrdem(n.esquerda);       // muda para a esquerda
            percursoPreOrdem(n.direita);        // muda para a direita
        }
    }

    public void percursoOrdem(No n) {           // vai esquerda, vê e dps direita
        if (n != null) {
            percursoPreOrdem(n.esquerda);       // muda para a esquerda
            System.out.println(n.elemento);     // visitando o elemento (mostrando-o)
            percursoPreOrdem(n.direita);        // muda para a direita
        }
    }

    public void percursoPosOrdem(No n) {        // vai esquerda, vai direita e dps vê
        if (n != null) {
            percursoPreOrdem(n.esquerda);       // muda para a esquerda
            percursoPreOrdem(n.direita);        // muda para a direita
            System.out.println(n.elemento);     // visitando o elemento (mostrando-o)
        }
    }

}
