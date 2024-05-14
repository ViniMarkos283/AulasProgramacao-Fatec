public class MainPilha {
    public static void main(String[] args) {
        Pilha p = new Pilha();
        p.empilha(30);
        p.empilha(12);
        p.empilha(65);
        System.out.println(p.toString());
        try { // obrigatório quando o metodo dispara exceção
            System.out.println("Elemento removido: " + p.desempilha());
            System.out.println(p.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
