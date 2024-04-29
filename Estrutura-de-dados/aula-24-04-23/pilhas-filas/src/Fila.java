public class Fila {
    private int dados[];
    private int topo;

    public Fila(int capMax) {
        dados = new int[capMax];
        topo = -1;
    }

    public void adicionar(int e) {
        if (!cheia()) {
            dados[++topo] = e;
        } else {
            System.out.println("Erro! fila cheia!");
        }
    }

    public int remover() {
        int r = -1;
        if (!vazio()) {
            r = dados[0];
            for (int i = 1; i <= topo; i++) {
                dados[i - 1] = dados[i];
            }
            topo--;
        } else {
            System.out.println("Erro! fila vazia!");
        }
        return r;
    }

    public String toString() {
        String r = "";
        for (int i = 0; i <= topo; i++) {
            r += dados[topo] + "\t";
        }
        return r;
    }

    public boolean cheia() {
        return topo == dados.length - 1;
    }

    public boolean vazio() {
        return topo == -1;
    }

}
