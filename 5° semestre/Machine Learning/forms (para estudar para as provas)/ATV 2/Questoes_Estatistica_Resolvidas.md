
# Lista de Questões com Respostas

## 1
Assinale a linha de instrução que gera o resultado ilustrado pela figura desta questão, valores relacionados à estatística descritiva  
**Resposta Correta:** `base.describe()`

---

## 2
Assinale a linha de instrução que gera o resultado ilustrado pela figura desta questão, a quantidade de linhas e colunas do dataframe  
**Resposta Correta:** `base.shape`

---

## 3
Assinale a linha de instrução que gera o resultado ilustrado pela figura desta questão, exatamente um conjunto de linhas numeradas de 25 a 34  
**Resposta Correta:** `base[25:35]`

---

## 4
Assinale a linha de instrução que gera como resultado 545, que é o número de linhas da base  
**Resposta Correta:** `base.shape[0]`

---

## 5
Assinale a linha de instrução que gera como resultado 13, que é o número de colunas da base  
**Resposta Correta:** `base.shape[1]`

---

## 6
Assinale a linha de instrução que gera como resultado 13, que é o número de colunas do dataframe.  
**Resposta Correta:** `base.shape[1]`

---

## 7
Considere o boxplot para a área dos imóveis e os valores obtidos.  
**Resposta Correta:** limite inferior, primeiro quartil, mediana, terceiro quartil e limite superior

---

## 8
Considere o boxplot para o preço e o filtro `base[base['price'] > valor4]`.  
**Resposta Correta:** devolve todas as linhas cuja coluna price seja maior que o limite superior

---

## 9
Considere o código de limpeza de dados com `drop()`.  
**Resposta Correta:** filtrar os imóveis com área superior a 12000, criar lista com o valor dos índices das linhas que atendem ao filtro e criar um novo dataframe denominado novabase com com apenas as linhas que atendem ao critério do filtro

---

## 10
Qual das instruções a seguir é uma matriz de dispersão que nos possibilita comparar os dados de preço, quantidade de dormitórios e quantidade de banheiros?  
**Resposta Correta:** `grafico = px.scatter_matrix(base, dimensions=['price', 'bedrooms','bathrooms'])`

---

## 11
Dado o filtro: `base[(base['price']>2490000) & (base['bedrooms'] > 2)]`  
**Resposta Correta:** 3

---

## 12
O que retorna a função `type(X_features)`  
**Resposta Correta:** Essa função retorna o tipo de dado de uma variável

---

## 13
Código com `LabelEncoder()` para coluna mainroad  
**Resposta Correta:** Está transformando os valores categóricos da coluna mainroad em valores numéricos, utilizando a classe LabelEncoder.

---

## 14
Assinale o comando a seguir que cria um numpy.ndarray das entradas da base de imóveis (sem o preço).  
**Resposta Correta:** `X_features = base.iloc[:,1:].values`

---

## 15
Análise do código com boxplot e substituição de outliers.  
**Resposta Correta:** II e III, apenas

---

## 16
Dada a instrução `y_output = base.iloc[:,0]/1000000`  
**Resposta Correta:** Gera um numpy.ndarray com a classe (price) que servirá como rótulo para a aprendizagem de máquina, dividindo o valor de cada linha por 1000000
