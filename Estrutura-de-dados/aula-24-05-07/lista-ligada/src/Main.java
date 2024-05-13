public class Main {
    public static void main(String[] args) {
        ListaLigada l1 = new ListaLigada();
        l1.adicionaInicio(89);
        System.out.println("Elementos da lista: " + l1.toString());
        l1.adicionaInicio(101);
        System.out.println("Elementos da lista: " + l1.toString());
        l1.adicionaInicio(85);
        System.out.println("Elementos da lista: " + l1.toString());
        
        try { // try catch
            System.out.println("Elemento removido: " + l1.removeInicio()); // remove se for possivel
        } catch (Exception e) { // se não der, gera a exception e
            System.out.println(e.getMessage()); // mostra a mensagem de erro
        }
        System.out.println("Elementos da lista: " + l1.toString());
        l1.adicionaFinal(50);
        System.out.println("Elementos da lista: " + l1.toString());
    }
}