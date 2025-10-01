# 📘 Questionário de Aprendizado de Máquina

## Questão 1  
Um componente da unidade de processamento possui o símbolo de somatória, assinale a alternativa que descreve a sua finalidade na unidade de processamento:  

- [x] **realiza uma junção de soma que deve realizar a combinação aditiva das entradas (X) ponderadas pelos pesos (w) sinápticos**  
- [ ] realiza a ativação de uma entrada que deve realizar a combinação aditiva das saídas (X) ponderadas pelos pesos (w) sinápticos  
- [ ] transforma o peso sináptico de um neurônio artificial em um sinal de saída  
- [ ] define se um neurônio deve ser ativado ou não de acordo com uma função específica  

---

## Questão 2  
Um componente da unidade de processamento possui o símbolo de um gráfico (f(a)), assinale a alternativa que descreve a sua finalidade na unidade de processamento:  

- [ ] realiza a ativação de uma entrada que deve realizar a combinação aditiva das saídas (X) ponderadas pelos pesos (w) sinápticos  
- [ ] realiza uma junção de soma que deve realizar a combinação aditiva das entradas (X) ponderadas pelos pesos (w) sinápticos  
- [ ] transforma o peso sináptico de um neurônio artificial em um sinal de saída  
- [x] **define se um neurônio deve ser ativado ou não de a partir da junção de soma e acordo com uma função específica**  

---

## Questão 3  
Assinale a instrução que mostra o resultado ilustrado pela figura apresentada neste exercício:  

- [x] **base.head()**  
- [ ] base.shape  
- [ ] base.head[25:35]  
- [ ] base.shape[0]  
- [ ] base.describe()  
- [ ] base.shape[1]  

---

## Questão 4  
Assinale a linha de instrução que gera exatamente um conjunto de linhas numeradas de 25 a 34:  

- [ ] base.shape[1]  
- [ ] base.shape[0]  
- [x] **base.head[25:35]**  
- [ ] base.head()  
- [ ] base.describe()  
- [ ] base.shape  

---

## Questão 5  
Um dataframe possui 13 colunas e 545 linhas. Qual instrução retorna **545** (número de linhas)?  

- [ ] base.shape[1]  
- [ ] base.shape  
- [ ] base.describe()  
- [x] **base.shape[0]**  
- [ ] base.head[25:35]  
- [ ] base.head()  

---

## Questão 6  
Um dataframe possui 13 colunas e 545 linhas. Qual instrução retorna **13** (número de colunas)?  

- [x] **base.shape[1]**  
- [ ] base.shape[0]  
- [ ] base.shape  
- [ ] base.head[25:35]  
- [ ] base.head()  
- [ ] base.describe()  

---

## Questão 7  
Sobre o boxplot, os valores retornados correspondem a:  

- [ ] limite inferior, primeiro quartil, média, terceiro quartil e limite superior  
- [x] **limite inferior, primeiro quartil, mediana, terceiro quartil e limite superior**  
- [ ] primeiro quartil, mediana, segundo quartil, limite superior e limite inferior  
- [ ] limite superior, primeiro quartil, mediana, segundo quartil e limite inferior  
- [ ] limite inferior, primeiro quartil, média, segundo quartil e limite superior  

---

## Questão 8  
Resultado do filtro `base[base['price'] > valor4]`:  

- [ ] devolve todas as linhas cuja coluna price seja maior que o segundo quartil  
- [ ] devolve todas as linhas cuja coluna price seja maior que a média  
- [x] **devolve todas as linhas cuja coluna price seja maior que o limite superior**  
- [ ] devolve todas as linhas cuja coluna price seja maior que o primeiro quartil  
- [ ] devolve todas as linhas cuja coluna price seja maior que o limite inferior  

---

## Questão 9  
Significado das últimas linhas do código (limpeza de outliers):  

- [x] **filtrar os imóveis com área superior a 12000, criar lista com os índices e criar um novo dataframe denominado `novabase` sem esses imóveis**  
- [ ] filtrar os imóveis com área superior a 12000, criar lista com índices e manter apenas as linhas filtradas na base original  

---

## Questão 10  
Qual instrução gera a matriz de dispersão para **price, bedrooms e bathrooms**?  

- [ ] plt.boxplot('price', 'stories','bathrooms')  
- [ ] grafico = px.scatter_matrix(base, dimensions=['price', 'area','bathrooms'])  
- [ ] plt.boxplot('price', 'bedrooms','bathrooms'])  
- [x] **grafico = px.scatter_matrix(base, dimensions=['price', 'bedrooms','bathrooms'])**  
- [ ] grafico = px.scatter_matrix(base, dimensions=['price', 'stories','bathrooms'])  

---

## Questão 11  
Filtro: `base[(base['price']>10000000) & (base['bedrooms'] > 2)]`  
Resultado:  

- [ ] 10  
- [ ] 7  
- [ ] 6  
- [ ] 9  
- [x] **8**  

---

## Questão 12  
O que retorna a função `type(X_features)`?  

- [ ] Essa função define a escala de uma variável  
- [x] **Essa função retorna o tipo de dado de uma variável**  
- [ ] Essa função define o tipo de dado de uma variável  
- [ ] Essa função retorna a escala de uma variável  

---

## Questão 13  
Código com `LabelEncoder` aplicado em `X_features[:,4]`:  

- [ ] Transforma valores categóricos da coluna `stories` em valores numéricos  
- [ ] Transforma valores numéricos da coluna `stories` em valores categóricos  
- [ ] Transforma valores numéricos da coluna `mainroad` em valores categóricos  
- [x] **Transforma valores categóricos da coluna `mainroad` em valores numéricos**  

---

## Questão 14  
Comando que cria um `numpy.ndarray` das entradas da base de imóveis:  

- [ ] X_features = base.iloc[:,0:13].values  
- [ ] X_features = base.iloc[:,2:13].values  
- [ ] X_features = base.iloc[:,1:12].values  
- [ ] X_features = base.iloc[:,0:].values  
- [x] **X_features = base.iloc[:,1:].values**  

---

## Questão 15  
Sobre o código do boxplot e substituição de outliers:  

- [ ] I e IV, apenas  
- [ ] I, II, III e IV  
- [x] **II e III, apenas**  
- [ ] I e III, apenas  
- [ ] II e IV, apenas  

---

## Questão 16  
Instrução: `y_output = base.iloc[:,0]/1000000`  

- [ ] Gera um numpy.ndarray com a classe (parking)  
- [ ] Gera um numpy.ndarray com a classe (bathrooms)  
- [x] **Gera um numpy.ndarray com a classe (price)**  
- [ ] Gera um numpy.ndarray com a classe (area)  
- [ ] Gera um numpy.ndarray com a classe (bedrooms)  
