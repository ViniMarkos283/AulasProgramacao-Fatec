//Nome: Marcos Vinicius de Oliveira
//RA: 2171392321015
// Objetivo:
/* 67. Criar uma classe para representar uma entidade que representa uma
    Conta Corrente em um sistema bancário. A conta corrente deve ter os
    seguintes atributos (todos privados):
    • Nome do Correntista
    • Sexo
    • Idade
    • Numero da Conta
    • Flag indicando se é conta conjunta
    • Saldo
    Todos os atributos devem ter seus respectivos métodos Getters e Setters.
    Criar os seguintes métodos na classe Conta:
    • Saque: Recebe como parâmetro o valor. Verifica o saldo da
    conta, e se tiver saldo disponível, diminui do saldo o valor
    sacado.
    • Saldo: não recebe parâmetros. Deve imprimir um cabeçalho
    com o nome do correntista, numero da conta, indicação se é
    conta conjunta ou não, e o saldo em conta.
    • Deposito: Recebe como parâmetro o valor depositado na
    conta.
    • Aumenta o saldo da conta de acordo com o valor depositado.
    • Criar uma classe chamada TestaConta, que deve possuir um método
    main.
    No método main devem ser instanciados 3 objetos do tipo ContaCorrente,
    com os seguintes valores
*/

public class TestaConta {
    public static void main(String[] args) {
        Conta cc1 = new Conta("Fernando", 1234, "nao", 1500.00, "Masculino", 29);
        Conta cc2 = new Conta("Maria", 5312, "sim", 530.31, "Feminino", 45);
        Conta cc3 = new Conta("João", 9621, "sim", 4325.12, "Masculino", 54);

        cc1.saldo();
        cc2.saldo();
        cc3.saldo();
    }
}
