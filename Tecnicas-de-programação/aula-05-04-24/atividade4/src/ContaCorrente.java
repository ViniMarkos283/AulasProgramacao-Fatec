public class ContaCorrente {
    private int numConta;
    private String nomeCliente;
    private String cpf;
    private double saldo;

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }

}
