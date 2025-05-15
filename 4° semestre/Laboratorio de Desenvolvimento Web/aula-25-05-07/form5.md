# Formulário: Form05 LDW - Desenvolvimento Web  
**Tema:** Monolítico / Microsserviços / SOLID

---

### 1. Durante as aulas foi discutido as fragilidades relacionadas à arquitetura monolítica.  
**Qual característica dessa arquitetura torna difícil a adaptação quando os requisitos do sistema mudam, especialmente devido aos seus altos níveis de dependência?**  
(1 Ponto)

- [ ] O gerenciamento do deploy é a característica que dificulta a necessidade de adaptação.  
- [ ] A fácil reutilização de componentes em diferentes partes do sistema.  
- [ ] A capacidade de implantar partes independentemente.  
- [x] A combinação de diferentes responsabilidades em uma única camada e o alto acoplamento resultante.

---

### 2. Em uma arquitetura de microsserviços, a comunicação eficiente entre serviços é vital.  
**Qual é uma vantagem fundamental da abordagem assíncrona, especialmente para aumentar a resiliência do sistema?**  
(1 Ponto)

- [x] Promoção do desacoplamento entre os serviços, permitindo que um serviço fique indisponível sem interromper o fluxo dos outros.  
- [ ] Simplicidade de implementação para interações diretas e imediatas.  
- [ ] A capacidade de um serviço fazer uma requisição direta e aguardar uma resposta imediata.  
- [ ] Rastreamento de transações mais direto e menos desafiador.

---

### 3. Considerando a classe SalaryCalculator no sistema de folha de pagamento  
**Qual princípio SOLID foi mais diretamente violado?**  
(1 Ponto)

- [ ] Princípio Aberto-Fechado (OCP)  
- [x] Princípio da Responsabilidade Única (SRP)  
- [ ] Princípio da Segregação da Interface (ISP)  
- [ ] Princípio da Inversão da Dependência (DIP)

---

### 4. Classe `ProcessadorDePedidos` precisa ser modificada para novas funcionalidades  
**Qual princípio SOLID é violado?**  
(1 Ponto)

- [ ] Princípio da Substituição de Liskov (LSP)  
- [ ] Princípio da Responsabilidade Única (SRP)  
- [x] Princípio Aberto-Fechado (OCP)  
- [ ] Princípio da Inversão da Dependência (DIP)

---

### 5. Uso de `FormaGeometrica` com `Retangulo` causa comportamentos inesperados  
**Qual princípio SOLID está sendo violado?**  
(1 Ponto)

- [x] Princípio da Substituição de Liskov (LSP)  
- [ ] Princípio da Responsabilidade Única (SRP)  
- [ ] Princípio da Segregação da Interface (ISP)  
- [ ] Princípio Aberto-Fechado

---

### 6. Cálculo de salário para "LabAssistant" no sistema de folha de pagamento  
**Qual seria o impacto na versão atual do sistema?**  
(1 Ponto)

- [x] Adicionar um método na interface ICalculate e implementar na classe SalaryCalculator.  
- [ ] Atualizar a classe TaxCalculator para atender a necessidade do novo requisito.  
- [ ] Incluir um tipo de empregado "LabAssistant" para permitir cálculo.  
- [ ] Nenhuma modificação necessária, pois SalaryCalculator tem baixo acoplamento.

---

### 7. Se não houver mudança na `TaxCalculator`, qual princípio SOLID não será atendido?  
(1 Ponto)

- [x] Princípio da Segregação de Interfaces (ISP)  
- [ ] Princípio da Responsabilidade Única (SRP)  
- [ ] Princípio Aberto-Fechado (OCP)  
- [ ] Princípio da Inversão da Dependência (DIP)

---

### 8. Módulo "Processamento de Pagamento" usa diretamente classes concretas  
**Qual princípio SOLID é o foco principal da melhoria com interfaces?**  
(1 Ponto)

- [ ] Permite que a classe tenha apenas uma responsabilidade.  
- [ ] Garante que a classe está fechada para modificação.  
- [ ] Assegura que subclasses de gateways são substituíveis.  
- [x] Facilita a substituição do gateway e melhora a testabilidade.

---

### 9. Web Services e sistemas legados  
**Qual a principal questão de longo prazo que essa abordagem resolve?**  
(1 Ponto)

- [ ] A necessidade de reescrever completamente o software legado.  
- [ ] Os altos custos de licenciamento de novas linguagens.  
- [x] Manutenibilidade e interoperabilidade entre sistemas diferentes.  
- [ ] Dificuldade em encontrar desenvolvedores especializados em linguagens antigas.

---

### 10. Estágio lógico que envolve análise dos processos de negócios  
**Qual é o nome do estágio?**  
(1 Ponto)

- [ ] Implementação e implantação de serviço  
- [x] Análise Orientada a Serviços  
- [ ] Projeto de serviço  
- [ ] Testes de integração de serviço

---

### 11. Serviço baseado em "Matrícula" de alunos  
**Qual tipo fundamental de serviço representa?**  
(1 Ponto)

- [x] Serviço de entidade (serviço de negócios)  
- [ ] Serviço utilitário  
- [ ] Serviço de tarefa (workflow)  
- [ ] Serviço de apresentação

---

### 12. Característica essencial ao adotar microserviços  
(1 Ponto)

- [ ] Responsabilidade única e código conciso  
- [ ] Uso exclusivo de contêineres e Kubernetes  
- [ ] Interfaces segregadas para reuso  
- [x] Implantáveis de forma independente

---

### 13. Diferença fundamental entre monolitos e microsserviços  
(1 Ponto)

- [ ] Monolito agrupa por camadas, microsserviços por funcionalidades  
- [ ] Microsserviços usam sempre as mesmas tecnologias  
- [ ] Monolito tem alto acoplamento tecnológico  
- [x] Microsserviços buscam coesão funcional e domínio de negócio

---

### 14. Desvantagem de múltiplos microsserviços compartilharem banco de dados  
(1 Ponto)

- [ ] Diminui a integridade dos dados  
- [ ] Aumenta a complexidade de transações distribuídas  
- [x] Aumenta o acoplamento ao descentralizar dados  
- [ ] Mudanças no schema quebram outros serviços

---

### 15. Lei de Conway e a prevalência de arquiteturas  
**Como ela se relaciona com monolitos e microsserviços?**  
(1 Ponto)

- [x] Monolitos refletem equipes por competência técnica, microsserviços por domínio de negócio  
- [ ] A Lei de Conway sugere que a tecnologia impulsiona a estrutura organizacional  
- [ ] Monolitos surgem por organização em domínios de negócio  
- [ ] A Lei de Conway é irrelevante na escolha entre arquiteturas

---

*Este formulário foi criado com Microsoft Forms.*
