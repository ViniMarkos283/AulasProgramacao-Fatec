// esta é a classe Gerente
public class Gerente extends Funcionario {
    private int senha;

    public boolean autentica(int e) {
        if (e == senha) {
            return true;
        } else {
            return false;
        }
    }
}
