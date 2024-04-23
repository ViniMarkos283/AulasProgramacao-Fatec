public class Conta {
    private String nomeCorrentista;
    private int numConta;
    private String contaConjunta;
    private double saldo;
    private String sexo;
    private int idade;

    public Conta(String nomeCorrentista, int numConta, String contaConjunta, double saldo, String sexo,
            int idade) {
        this.nomeCorrentista = nomeCorrentista;
        this.numConta = numConta;
        this.contaConjunta = contaConjunta;
        this.saldo = saldo;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String isContaConjunta() {
        return contaConjunta;
    }

    public void setContaConjunta(String contaConjunta) {
        this.contaConjunta = contaConjunta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        }
    }

    public void saldo() {
        System.out.println("Nome do correntista: " + nomeCorrentista + "\nNumero da conta: " + numConta
                + "\nConta conjunta? " + contaConjunta + "\nSaldo: " + saldo + "\n");
    }

    public void deposito(double valor) {
        saldo += valor;
    }

}
