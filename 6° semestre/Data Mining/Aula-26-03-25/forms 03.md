# Questionário - Pré-processamento de Dados e Machine Learning

---

## 1. StandardScaler antes do split
No contexto da classificação do dataset Iris, um desenvolvedor aplica o StandardScaler() a todo o conjunto de dados antes de realizar o split entre treino e teste. De acordo com o texto, qual é a consequência técnica imediata desta ação?

- [ ] A acurácia do modelo será prejudicada...
- [ ] O modelo sofrerá obrigatoriamente de overfitting...
- [x] ✅ Ocorre o 'data leakage', pois o scaler aprende a média e o desvio padrão de instâncias que deveriam ser invisíveis ao treino...
- [ ] Ao usar o dataset completo, informações estatísticas do teste...
- [ ] O processo é válido desde que o algoritmo utilizado seja robusto a outliers...

---

## 2. Importância do pré-processamento
Por que o pré-processamento de dados é considerado uma etapa essencial no pipeline de aprendizado de máquina?

- [ ] Para reduzir o tempo de execução dos algoritmos de ML.
- [ ] Para otimizar o processamento dos modelos de ML
- [x] ✅ Para garantir que os dados de entrada sejam de alta qualidade, consistentes e relevantes, melhorando a precisão e a confiabilidade do modelo.
- [ ] Para diminuir custos operacionais e encurtar os ciclos de desenvolvimento

---

## 3. Pico isolado no histograma
Ao analisar um histograma de frequência de vendas onde se observa um pico isolado em valores extremamente baixos...

- [ ] A distribuição é classificada como perfeitamente simétrica...
- [ ] Trata-se de uma evidência de multimodalidade...
- [x] ✅ Estes valores podem indicar a presença de outliers...
- [ ] O texto destaca que frequências extremamente baixas podem ser anomalias...

---

## 4. Transformação de dados
Qual das seguintes atividades é um exemplo de transformação de dados?

- [x] ✅ Normalização ou dimensionamento de dados para colocá-los na mesma escala
- [ ] Detecção e remoção de outliers.
- [ ] Preenchimento de valores ausentes...
- [ ] Identificação de anomalias...

---

## 5. Idade vs Salário
Qual técnica deveria ser aplicada para colocar os dados na mesma escala?

- [ ] Engenharia de features.
- [ ] Tratamento de valores ausentes.
- [ ] Dimensionamento e balanceamento de recurso.
- [x] ✅ Normalização e dimensionamento de recursos.

---

## 6. Etapa antes de alterações
Qual etapa é essencial para entender o dataset antes de alterações?

- [ ] Limpeza de dados.
- [x] ✅ Exploração de dados (EDA).
- [ ] Transformação de dados.
- [ ] Seleção de recursos.

---

## 7. One-Hot Encoding
Transformação da coluna "Tipo de Contrato":

- [ ] Codificação One-Hot Encoding para variáveis numéricas
- [x] ✅ Codificação One-Hot Encoding para variáveis categóricas
- [ ] Redução de dimensionalidade via PCA.
- [ ] Segmentação de dados.

---

## 8. Impacto de dados de alta qualidade
Qual o impacto direto?

- [ ] Melhora a precisão... sem ajuste de hiperparâmetros
- [ ] Melhora a precisão... coleta mais rápida
- [x] ✅ Melhora a precisão e a eficiência dos modelos, reduz ruídos e inconsistências...
- [ ] Melhora a precisão... sem engenharia de features

---

## 9. Valores ausentes ('?')
Qual técnica usar?

- [ ] Remover a coluna
- [ ] Substituir por valor fixo
- [x] ✅ Substituir pela moda, média ou mediana
- [ ] Manter os valores ausentes

---

## 10. Severidade (Maligno/Benigno)
Qual etapa é necessária?

- [ ] Normalização
- [x] ✅ Codificação da variável categórica
- [ ] Remoção da coluna
- [ ] Preenchimento de valores faltantes

---

## 11. MinMaxScaler
Valor normalizado e desvantagem:

- [ ] 0,60; impossibilidade com KNN
- [ ] 0,38; necessidade de média e DP
- [ ] 0,50; altera distribuição
- [x] ✅ 0,60; outliers comprimem os dados

---

## 12. Redução de dimensionalidade
Por que é necessária?

- [x] ✅ Porque o excesso de atributos pode tornar o esforço computacional impraticável...
- [ ] Para aumentar redundância
- [ ] Para converter NaN automaticamente
- [ ] Para usar apenas atributos categóricos ordinais

---