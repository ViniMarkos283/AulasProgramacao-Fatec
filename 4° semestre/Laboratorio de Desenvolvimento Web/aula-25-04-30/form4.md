# Form04 - LDW: Desenvolvimento de App Web

**Pontuação: 11/14**

---

### 1. No contexto de modelos de processo de desenvolvimento de software, qual é a principal vantagem do modelo interativo incremental em relação ao modelo em cascata, especialmente em cenários de negócios que atuam em um ambiente globalizado?

- [ ] O modelo interativo incremental exige uma especificação completa de requisitos no início do projeto.
- [ ] O modelo em cascata é mais adequado para projetos com prazos curtos e requisitos em constante mudança
- [x] O modelo interativo incremental permite feedback constante do cliente e entregas frequentes de software funcional
- [ ] O modelo em cascata é mais eficiente para projetos com alto grau de incerteza e complexidade.

---

### 2. MVC (Model-View-Controller) é um padrão de arquitetura de software. Nessa arquitetura, o controller é responsável por

- [ ] controlar os erros de visualização de processamento
- [ ] executar uma solicitação de entrada.
- [ ] ler e escrever os dados.
- [ ] validar os dados de controle.

---

### 3. Em uma aplicação de votação online desenvolvida em três camadas do tipo MVC, o controller é responsável por

- [x] transformar eventos gerados pela view em ações de negócio, alterando o model.
- [ ] transformar eventos gerados pela view em ações temporárias de negócio
- [ ] manipular a tela com dados de negócio que podem ser alterados diretamente com o banco de dados.
- [ ] alterar a view do sistema que contém a lógica do negócio.

---

### 4. Supondo que o programador usou a anotação `@RequestMapping("/user/{id}")`, selecione a assinatura do método correta:

- [x] public String handleRequest(@PathVariable("id") String userId) { }
- [ ] public String handleRequest(@RequestParam("id") String id) { }
- [ ] public String handleRequest(@RequestBody("id") String id) { }
- [ ] public String handleRequest(@RequestVar("id") String id) { }

---

### 5. Qual o objetivo de se utilizar o `ModelAndView` na programação Web com Spring Boot?

- [ ] Estabelece a interface model que será retornada para o usuário
- [x] Permite retornar os dados e a página que será renderizada em uma requisição realizada pelo usuário.
- [ ] Define página que será apresentada ao usuário de acordo com a solicitação realizada pelo browser
- [ ] Controla as restrições das entradas de usuário

---

### 6. Como aplicar o princípio da Inversão de Dependência com Injeção de Dependência em um sistema que usa múltiplos gateways de pagamento?

- [ ] Criando classes concretas para cada gateway de pagamento e instanciando-as diretamente na classe de gerenciamento de estoque
- [x] Definindo uma interface para os gateways de pagamento e injetando a implementação específica durante o tempo de execução
- [ ] Implementando a lógica de cada gateway de pagamento diretamente na classe de gerenciamento de estoque
- [ ] A Inversão de Dependência e a Injeção de Dependência facilitam a utilização da arquitetura MVC separando a camada de controle da camada de persistência.

---

### 7. Qual o papel da JPA no desenvolvimento com bancos relacionais?

- [ ] A JPA exige que os desenvolvedores escrevam código SQL puro para todas as operações de banco de dados.
- [x] A JPA fornece um conjunto de interfaces e anotações para mapear objetos Java para tabelas de banco de dados, abstraindo o SQL
- [ ] A JPA é útil apenas para aplicações pequenas e não é adequada para sistemas corporativos complexos.
- [ ] A JPA é uma linguagem de consulta de banco de dados semelhante ao SQL.

---

### 8. A entrega de software funcional a cada duas semanas está alinhada com qual prática ágil?

- [ ] Desenvolvimento do Product Backlog
- [ ] Sprint retrospective
- [x] Sprints
- [ ] Programação por pares

---

### 9. Qual o papel do projeto de arquitetura no processo de desenvolvimento de software?

- [ ] especifica como o acesso ao banco de dados será configurado.
- [ ] define como os requisitos serão implementados no cronograma diminuindo os riscos de atraso na entrega.
- [x] ajuda a explicar como o sistema pode ser particionado em componentes, reduzindo, assim, a complexidade para seu entendimento
- [ ] permite planejar a alocação de recursos de acordo com as necessidades de programação identificadas no projeto.

---

### 10. Comportamento esperado ao definir um endpoint REST com Spring MVC:

- [ ] aceita os dados no formato texto no corpo da requisição, que é essencial em conjunto com @PostMapping para garantir que os dados sejam desserializados corretamente para um objeto Java
- [ ] recebe um objeto Java no corpo da mensagem que é desserializado para um objto JSon com objetivo de atender ao comportamento da logica definida de criação do usuário.
- [x] recebe um objeto Json que é desserializado para um objeto java com objetivo de atender ao comportamento da logica definida de criação do usuário.
- [ ] a anotação @ResponseBody identifica em tempo de execução o tipo de dados enviado no corpo da mensagem para processar o comportamento esperado na criação de usuário.

---

### 11. Desvantagem da abordagem sem DIP (dependência concreta dentro de NotificacaoService):

- [ ] Ela promove um alto acoplamento entre NotificacaoService e EmailService, tornando o código mais difícil de entender.
- [ ] Ela dificulta a criação de testes unitários isolados para NotificacaoService, pois a dependência concreta de EmailService está embutida.
- [ ] Ela impede a extensão do sistema para suportar novos métodos de notificação (como SMS) sem modificar a classe NotificacaoService.
- [x] Todas as alternativas acima estão corretas.

---

### 12. Benefício principal da interface `Notificador` no contexto de DIP:

- [ ] Ela permite que as classes concretas (EmailService, SMSService) controlem o comportamento de NotificacaoService.
- [x] Ela estabelece um contrato que as classes de alto nível cliente de email e sms devem seguir, dependendo de uma abstração.
- [x] Ela elimina a necessidade de instanciar classes concretas dentro de NotificacaoService, simplificando a lógica interna.
- [ ] Ela melhora a performance da aplicação ao reduzir a criação de múltiplos objetos.

---

### 13. Principal desafio ao adicionar uma nova notificação (Push) na abordagem sem interfaces:

- [ ] Seria necessário criar uma nova classe PushNotificationService, mas NotificacaoService não precisaria ser alterada.
- [x] Seria preciso modificar a classe NotificacaoService para incluir a lógica de envio de "Push Notification", potencialmente introduzindo bugs e violando o OCP.
- [ ] A interface Notificador precisaria ser alterada para incluir um método específico para "Push Notification".
- [ ] Não haveria diferença significativa entre as duas abordagens ao adicionar um novo método de notificação.

---

### 14. Impacto positivo da aplicação do DIP em projetos web de grande escala:

- [ ] Facilita a criação de código mais conciso e com menos linhas.
- [ ] Garante que todas as classes sigam um padrão de nomenclatura consistente.
- [ ] Reduz a necessidade de escrever documentação detalhada, pois o código se torna autoexplicativo.
- [x] Permite que diferentes equipes trabalhem em módulos independentes sem se preocuparem com os detalhes de implementação uns dos outros.
