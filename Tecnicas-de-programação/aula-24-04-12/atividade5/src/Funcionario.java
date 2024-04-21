public class Funcionario {
    String nome;
    double salarioBruto;
    double desconto;
    double salarioAjustado;

    public double salarioLiquido() {
        double sl;
        sl = salarioBruto - desconto;
        return sl;
    }

    public void aumentarSalario(double porcent) {
        double sl = salarioLiquido();
        salarioAjustado = sl + (sl / porcent);
    }
}