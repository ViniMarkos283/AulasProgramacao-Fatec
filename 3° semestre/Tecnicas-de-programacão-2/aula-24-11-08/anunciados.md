# ATIVIDADE – REVISÃO PARA PROVA
#### 1. Explique o Padrão Decorator. Defina o padrão Decorator e descreva um caso prático onde seria útil aplicá-lo.

#### 2. Implemente uma Classe Decorator. Crie uma classe NotificadorBasico que envia uma notificação simples por e-mail e depois use um decorator NotificadorSMS que adiciona a notificação por SMS.

```javascript
console.log('Olá, Mundo!');

class NotificadorBasico {
 enviar(mensagem) {
 console.log(`Enviando e-mail: ${mensagem}`);
 }
}
class NotificadorSMS {
 constructor(notificador) {
 this.notificador = notificador;
 }
 enviar(mensagem) {
 this.notificador.enviar(mensagem);
 console.log(`Enviando SMS: ${mensagem}`);
 }
}
const notificador = new NotificadorSMS(new NotificadorBasico());
notificador.enviar("Olá, você tem uma nova mensagem!");
```

#### 3. No exercício anterior, crie um Decorador Adicional. Adicione um NotificadorFacebook que envia notificações via Facebook. O cliente deve conseguir combinar SMS, e-mail e Facebook.

#### 4. Qual a vantagem do padrão Decorator sobre a herança? Explique como o Decorator promove a composição sobre herança.

#### 5. Discuta a flexibilidade do Decorator. como o Decorator permite adicionar comportamentos sem alterar as classes originais?

#### 6. Descreva o Padrão Facade, explique como o padrão Facade ajuda a reduzir a complexidade ao interagir com um sistema.

#### 7. Implemente uma Classe Facade: Crie uma fachada LojaOnline que simplifica a interação com subsistemas de pagamento, envio e notificação.

```javascript
class SistemaPagamento {
 processar() { console.log("Processando pagamento..."); }
}
class SistemaEnvio {
 enviar() { console.log("Enviando o produto..."); }
}
class SistemaNotificacao {
 notificar() { console.log("Enviando notificação para o cliente...");
}
}
class LojaOnline {
 realizarCompra() {
 const pagamento = new SistemaPagamento();
 const envio = new SistemaEnvio();
 const notificacao = new SistemaNotificacao();

 pagamento.processar();
 envio.enviar();
 notificacao.notificar();
 }
}
const loja = new LojaOnline();
loja.realizarCompra();
```

#### 8. Qual a vantagem de uma fachada em sistemas complexos? Discuta como o padrão facilita a manutenção de grandes sistemas.

#### 9. Analise a abstração da fachada. Por que é importante esconder a complexidade interna de um sistema?

#### 10. Extensão da Fachada. Como você poderia estender a LojaOnline para incluir verificação de estoque antes de realizar a compra?

#### 11. Explique o Padrão Flyweight. Descreva o padrão Flyweight e em quais situações ele é útil.

#### 12. Implementação Flyweight. Crie uma classe Carro com um estado intrínseco de modelo e cor e um estado extrínseco placa.

```javascript
class Carro {
 constructor(modelo, cor) {
 this.modelo = modelo;
 this.cor = cor;
 }
 exibir(placa) {
 console.log(`Carro ${this.modelo} - ${this.cor} com placa
${placa}`);
 }
}
class CarroFactory {
 constructor() {
 this.carros = {};
 }
 obterCarro(modelo, cor) {
 const chave = modelo + cor;
 if (!this.carros[chave]) {
 this.carros[chave] = new Carro(modelo, cor);
 }
 return this.carros[chave];
 }
}

const factory = new CarroFactory();
const carro1 = factory.obterCarro("SUV", "Azul");
carro1.exibir("ABC1234");
```

#### 13. Diferencie Estado Intrínseco e Extrínseco. Qual é a importância de separar esses estados no Flyweight?

#### 14. Desafios de Implementação. Quais são os possíveis desafios ao implementar o padrão Flyweight?

#### 15. Quando não usar Flyweight. Em quais casos o uso do padrão Flyweight pode ser prejudicial?

#### 16. Descreva o Padrão Proxy. Qual o propósito do padrão Proxy e em quais cenários ele é ideal?

#### 17. Implemente uma Classe Proxy.Crie um BancoProxy que restringe o acesso ao saldo de um Banco.

```javascript
class Banco {
 constructor(saldo) {
 this.saldo = saldo;
 }
 getSaldo() {
 return this.saldo;
 }
}
class BancoProxy {
 constructor(banco, autorizado) {
 this.banco = banco;
 this.autorizado = autorizado;
 }
 getSaldo() {
 if (this.autorizado) {
 return this.banco.getSaldo();
 } else {
 console.log("Acesso negado.");
 return null;
 }
 }
}
const banco = new Banco(1000);
const proxy = new BancoProxy(banco, false);
proxy.getSaldo();
```

#### 18. Compare Proxy e Decorator. Em que situação o Proxy difere do Decorator?

#### 19. Aplicações Reais do Proxy. Dê um exemplo de aplicação real do Proxy em sistemas distribuídos.

#### 20. Segurança com Proxy. Como o Proxy pode aumentar a segurança em sistemas críticos?

#### 21. Explique o Padrão Chain of Responsibility. Descreva como o padrão permite flexibilidade na atribuição de responsabilidades.

#### 22. Implementação de Cadeia de Responsabilidades. Crie uma cadeia de suporte com três níveis: SuporteBasico, SuporteAvancado e SuporteEspecializado.

```javascript
class Suporte {
 setProximo(suporte) {
 this.proximo = suporte;
 }
 tratar(solicitacao) {
 if (this.proximo) {
 this.proximo.tratar(solicitacao);
 }
 }
}
class SuporteBasico extends Suporte {
 tratar(solicitacao) {
 if (solicitacao <= 1) {
 console.log("Suporte Básico resolveu a solicitação.");
 } else {
 super.tratar(solicitacao);
 }
 }
}
class SuporteAvancado extends Suporte {
 tratar(solicitacao) {
 if (solicitacao <= 2) {
 console.log("Suporte Avançado resolveu a solicitação.");
 } else {
 super.tratar(solicitacao);
 }
 }
}
const basico = new SuporteBasico();
const avancado = new SuporteAvancado();
basico.setProximo(avancado);
basico.tratar(2); // Suporte Avançado resolve a solicitação.
```

#### 23. Extensibilidade no Chain of Responsibility. Como é possível adicionar novos níveis na cadeia sem modificar as classes existentes?

#### 24. Diferença entre Chain of Responsibility e Composite. Em que situações o Chain of Responsibility pode ser mais adequado que o Composite?

#### 25. Desvantagens do Chain of Responsibility. Explique como a cadeia pode não garantir o processamento e os desafios de depuração.
