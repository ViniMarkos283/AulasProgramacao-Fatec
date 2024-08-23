// codigo pego pela professora, n foi feito por mim

public class App {
    public static void main(String[] args) throws Exception {
        Arvore a = new Arvore();

        a.adicionaElemento(10);
        a.adicionaElemento(4);
        a.adicionaElemento(12);
        a.adicionaElemento(10);
        a.adicionaElemento(1);
        a.adicionaElemento(13);
        a.adicionaElemento(11);
        a.adicionaElemento(12);
        a.adicionaElemento(12);
        a.adicionaElemento(7);

        System.out.println("\nProfundidade");
        a.profundidade(a.obtemRaiz());
        System.out.println("\nSimétrica");
        a.ordemSimetrica(a.obtemRaiz());
        System.out.println("\nPos Ordem");
        a.posOrdem(a.obtemRaiz());

        System.out.println("\nSoma " + a.soma(a.obtemRaiz()));
        System.out.println("Conta " + a.conta(a.obtemRaiz()));
        System.out.println("Média dos elementos " + a.media());

        a.remove(10);
        System.out.println("\nSimétrica");
        a.ordemSimetrica(a.obtemRaiz());
        a.remove(1);
        System.out.println("\nSimétrica");
        a.ordemSimetrica(a.obtemRaiz());
        a.remove(12);
        System.out.println("\nSimétrica");
        a.ordemSimetrica(a.obtemRaiz());
        a.remove(13);
        System.out.println("\nSimétrica");
        a.ordemSimetrica(a.obtemRaiz());
        a.remove(11);
        System.out.println("\nSimétrica");
        a.ordemSimetrica(a.obtemRaiz());
        a.remove(7);
        System.out.println("\nSimétrica");
        a.ordemSimetrica(a.obtemRaiz());
        a.remove(4);
        System.out.println("\nSimétrica");
        a.ordemSimetrica(a.obtemRaiz());

    }
}
