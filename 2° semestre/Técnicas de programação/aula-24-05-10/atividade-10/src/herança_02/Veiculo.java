//Nome: Marcos Vinicius de Oliveira
//RA: 2171392321015
// Objetivo: 76. Criar um projeto Java chamado “Heranca_02”, que implemente todo o código
// necessário para a criação das classes abaixo:

package herança_02;

// esta é a classe veiculo
public class Veiculo {
    private String placa;
    private int ano;

    public Veiculo() {
    }

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirDados() {
        System.out.println("Placa: " + placa + "\nAno: " + ano);
    }

}
