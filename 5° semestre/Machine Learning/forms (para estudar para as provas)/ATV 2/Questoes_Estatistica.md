# Exercícios de Estatística Descritiva e Pré-Processamento de Dados

Este documento contém questões de múltipla escolha para estudo de Pandas, Boxplots e Pré-Processamento de dados para Machine Learning.

---

## 1. Estatística Descritiva
**Assinale a linha de instrução que gera o resultado ilustrado pela figura desta questão, valores relacionados à estatística descritiva**  
(1 Ponto)

- `base.head()`
- `base.shape[1]`
- `base.shape`
- `base.head[25:35]`
- `base.describe()`
- `base.shape[0]`

---

## 2. Quantidade de Linhas e Colunas
**Assinale a linha de instrução que gera o resultado ilustrado pela figura desta questão, a quantidade de linhas e colunas do dataframe**  
(1 Ponto)

- `base.describe()`
- `base.head()`
- `base.shape`
- `base.shape[1]`
- `base.shape[0]`
- `base.head[25:35]`

---

## 3. Conjunto de Linhas Específico
**Assinale a linha de instrução que gera o resultado ilustrado pela figura desta questão, exatamente um conjunto de linhas numeradas de 25 a 34**  
(1 Ponto)

- `base.shape`
- `base[25:35]`
- `base.shape[0]`
- `base.head()`
- `base.describe()`
- `base.shape[1]`

---

## 4. Número de Linhas
**Assinale a linha de instrução que gera como resultado 545, que é o número de linhas da base**  
(1 Ponto)

- `base.shape[1]`
- `base.describe()`
- `base.shape[0]`
- `base.shape`
- `base.head()`
- `base.head[25:35]`

---

## 5. Número de Colunas
**Assinale a linha de instrução que gera como resultado 13, que é o número de colunas da base**  
(1 Ponto)

- `base.shape[0]`
- `base.head[25:35]`
- `base.shape`
- `base.describe()`
- `base.head()`
- `base.shape[1]`

---

## 6. Quantidade de Colunas do DataFrame
**Assinale a linha de instrução que gera como resultado 13, que é o número de colunas do dataframe.**  
(1 Ponto)

- `base.describe()`
- `base.shape[0]`
- `base.shape`
- `base.head()`
- `base.shape[1]`
- `base.head[25:35]`

---

## 7. Interpretação de Boxplot
```python
dados = base["area"]
plt.figure(figsize=(8, 6))
boxplot_dict = sns.boxplot(dados)
ax = plt.gca()
lines = ax.get_lines()
valor1 = lines[0].get_ydata()[0]
valor3 = lines[1].get_ydata()[0]
valor0 = lines[0].get_ydata()[1]
valor4 = lines[1].get_ydata()[1]
valor2 = lines[4].get_ydata()[0]
```
**Assinale a alternativa que corresponde ao significado de valor0, valor1, valor2, valor3 e valor4, respectivamente:**  
(1 Ponto)

- limite inferior, primeiro quartil, mediana, terceiro quartil e limite superior
- limite inferior, primeiro quartil, média, segundo quartil e limite superior
- limite superior, primeiro quartil, mediana, segundo quartil e limite inferior
- primeiro quartil, mediana, segundo quartil, limite superior e limite inferior
- limite inferior, primeiro quartil, média, terceiro quartil e limite superior

---

## 8. Filtro de Outliers no Boxplot
```python
base[base['price'] > valor4]
```
**Assinale a alternativa que corresponde ao significado do resultado do filtro:**  
(1 Ponto)

- devolve todas as linhas cuja coluna price seja maior que o segundo quartil  
- devolve todas as linhas cuja coluna price seja maior que o limite inferior  
- devolve todas as linhas cuja coluna price seja maior que o limite superior  
- devolve todas as linhas cuja coluna price seja maior que o primeiro quartil  
- devolve todas as linhas cuja coluna price seja maior que a média  

---

## 9. Limpeza de Dados
```python
x = base[base['area']>12000]
lista = x.index
novabase = base.drop(lista)
```
**Assinale a alternativa que corresponde ao significado das 3 últimas linhas do código-fonte:**  
(1 Ponto)

- filtrar os imóveis com área superior a 12000, criar lista com o valor dos índices das linhas que atendem ao filtro e criar manter no dataframe denominado base apenas as linhas que atendem ao critério do filtro  
- filtrar os imóveis com área superior a 12000, criar lista com o valor dos índices das linhas que atendem ao filtro e criar um novo dataframe denominado novabase com com apenas as linhas que atendem ao critério do filtro  

---

## 10. Matriz de Dispersão
**Qual das instruções a seguir é uma matriz de dispersão que nos possibilita comparar os dados de preço, quantidade de dormitórios e quantidade de banheiros?**  
(1 Ponto)

- `plt.boxplot('price', 'bedrooms','bathrooms'])`
- `grafico = px.scatter_matrix(base, dimensions=['price', 'stories','bathrooms'])`
- `grafico = px.scatter_matrix(base, dimensions=['price', 'bedrooms','bathrooms'])`
- `grafico = px.scatter_matrix(base, dimensions=['price', 'area','bathrooms'])`
- `plt.boxplot('price', 'stories','bathrooms')`

---

## 11. Filtro com Duas Condições
```python
base[(base['price']>2490000) & (base['bedrooms'] > 2)]
```
**Assinale quantas linhas ele devolve:**  
(1 Ponto)

- 3  
- 2  
- 0  
- 4  
- 1  

---

## 12. Função `type()`
**O que retorna a função `type(X_features)`**  
(1 Ponto)

- Essa função define a escala de uma variável  
- Essa função retorna o tipo de dado de uma variável  
- Essa função define o tipo de dado de uma variável  
- Essa função retorna a escala de uma variável  

---

## 13. LabelEncoder
```python
from sklearn.preprocessing import LabelEncoder 
lbl = LabelEncoder() 
base['mainroad'] = lbl.fit_transform(base['mainroad'])
```
**O que o código acima está realizando?**  
(1 Ponto)

- Está transformando os valores numéricos da coluna mainroad em valores categóricos  
- Está contando a quantidade de linhas da coluna mainroad que não estejam em branco  
- Está contando a quantidade de linhas em branco da coluna mainroad  
- Está transformando os valores categóricos da coluna mainroad em valores numéricos, utilizando a classe LabelEncoder  

---

## 14. Criação de X_features
**Assinale o comando a seguir que cria um numpy.ndarray das entradas da base de imóveis (o preço é a saída e não deve ser incluído nessa coleção):**  
(1 Ponto)

- `X_features = base.iloc[:,1:].values`
- `X_features = base.iloc[:,0:].values`
- `X_features = base.iloc[:,1:12].values`
- `X_features = base.iloc[:,0:13].values`
- `X_features = base.iloc[:,2:13].values`

---

## 15. Boxplot e Substituição de Outliers
```python
media = base.loc[((base['bedrooms']==4.0)&(base['price']<=p4 ) & (base['price']>=p0)), 'price'].mean()
base.loc[((base['bedrooms']==4.0) & ((base['price']>p4)|(base['price']<p0))),'price']=math.ceil(media)
```
**Analise as afirmações:**  
I) A média foi calculada a partir de imóveis com 4 dormitórios cujo preço seja um valor outlier  
II) A média foi calculada a partir de imóveis com 4 dormitórios cujo preço esteja no intervalo do limite superior (inclusive) ao inferior (inclusive) obtidos no boxplot  
III) A coluna price de imóveis com 4 dormitórios cujo preço seja um valor outlier receberá o valor da média arredondado para o inteiro mais próximo  
IV) A coluna price de imóveis com 4 dormitórios cujo preço não seja um valor outlier receberá o valor da média arredondado para o inteiro mais próximo  

(1 Ponto)

- I e III, apenas  
- I e IV, apenas  
- II e III, apenas  
- II e IV, apenas  
- I, II, III e IV  

---

## 16. Criação de y_output
```python
y_output = base.iloc[:,0]/1000000
```
**Assinale a alternativa que descreve a sua função:**  
(1 Ponto)

- Gera um numpy.ndarray com a classe (area) que servirá como rótulo  
- Gera um numpy.ndarray com a classe (bathrooms) que servirá como rótulo  
- Gera um numpy.ndarray com a classe (price) que servirá como rótulo  
- Gera um numpy.ndarray com a classe (bedrooms) que servirá como rótulo  
- Gera um numpy.ndarray com a classe (parking) que servirá como rótulo  
