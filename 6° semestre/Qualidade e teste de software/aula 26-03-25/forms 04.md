# Questionário – Testes e Qualidade de Software

---

## 1. Mitigação de risco na validação de CPF
A equipe de desenvolvimento de um novo módulo de faturamento em um sistema de e-commerce está na fase de especificação dos requisitos de usuário...

**Alternativas:**
- [ ] Iniciar imediatamente a codificação do método isValido(cpf)...
- [x] Realizar uma revisão detalhada do requisito com a equipe de testes, discutindo os cenários de sucesso e exceção para o CPF e seu impacto, considerando uma análise de risco de falha do produto.
- [ ] Especificar os casos de testes de aceitação "end-to-end"...
- [ ] Implementar a função considerando as características de testabilidade...

---

## 2. Refatoração e falha nos testes
Após refatoração do método isDomingo...

**Alternativas:**
- [ ] Eficácia dos testes de regressão de funcionalidades.
- [ ] Tempo de execução dos testes.
- [x] Estabilidade do script de teste.
- [ ] Manutenibilidade do script de teste.

---

## 3. Pirâmide de Testes
Projeto ágil implementando classe Fatura...

**Alternativas:**
- [x] Concentrar a maior parte do esforço em testes unitários para as validações isDomingo e isAnteriorDataAtual, garantindo feedback rápido do comportamento da aplicação.
- [ ] Maximizar os cenários de testes "end-to-end"...
- [ ] Priorizar testes de integração...
- [ ] Implementar testes manuais de aceitação...

---

## 4. Depuração de defeito complexo
Dificuldade em entender valores intermediários...

**Alternativas:**
- [ ] Estabilidade.
- [ ] Controlabilidade.
- [x] Observabilidade.
- [ ] Manutenibilidade.

---

## 5. Eficácia dos testes de regressão
Após erro detectado em produção...

**Alternativas:**
- [ ] O número total de linhas de código da classe Fatura.
- [x] A quantidade de código executada durante o teste de regressão, a complexidade desse código e sua criticidade para o domínio de negócio.
- [ ] O tempo de execução de cada script de teste.
- [ ] A legibilidade do script de teste.

---

## 6. Benefício dos testes E2E
Aplicação web moderna multicamadas...

**Alternativas:**
- [ ] Validar isoladamente a lógica de negócio...
- [ ] Medir o desempenho de requisições...
- [x] Simular o fluxo completo do usuário, desde a entrada de dados na interface da fatura até a confirmação.
- [ ] Verificar a correção sintática do código-fonte.

---

## 7. Capture & Replay
Testes E2E com alto custo de manutenção...

**Alternativas:**
- [ ] Necessidade de validar em diversos browsers...
- [ ] Dificuldade em iniciar automação...
- [ ] Foco excessivo em testes de desempenho...
- [x] Sensibilidade dos scripts a pequenas modificações na interface do usuário, exigindo constantes atualizações.

---

## 8. Teste com mensagem dinâmica
Mensagem de erro difícil de capturar...

**Alternativas:**
- [x] Baixa observabilidade, pois a mudança de estado é difícil de ser verificada de forma confiável pelo script de teste.
- [ ] Baixa controlabilidade...
- [ ] Instabilidade da aplicação...
- [ ] Alta complexidade inerente...

---

## 9. Vantagem da automação
Comparação com testes manuais...

**Alternativas:**
- [ ] Diminui a quantidade de recursos...
- [x] Permite a execução rápida e autônoma de um conjunto de casos de teste para avaliar regressões.
- [ ] Garante que a aplicação seja livre de defeitos.

---

## 10. Escolha de localizador
Automação do botão "Confirmar"...

**Alternativas:**
- [x] A unicidade e a estabilidade do localizador em relação a mudanças futuras na GUI.
- [ ] Compatibilidade com a ferramenta...
- [ ] Facilidade de manutenção...
- [ ] Desempenho do localizador...

---