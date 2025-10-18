# Machine Learning (Aprendizagem de Maquina)
#### Na matéria de Machine Learning (Aprendizado de Máquina), aprende-se principalmente como ensinar um computador a reconhecer padrões, fazer previsões e tomar decisões com base em dados, sem a necessidade de programação explícita para cada tarefa.

## 1. **Fundamentos**
- **Aprendizado supervisionado**: Aprender com dados rotulados.
- **Aprendizado não supervisionado**: Encontrar padrões em dados sem rótulos.
- **Aprendizado por reforço**: Aprender por tentativa e erro, com feedback.

## 2. **Pré-processamento de Dados**
- Limpeza, transformação e normalização de dados.
- Lidar com valores ausentes e codificar variáveis categóricas.

## 3. **Algoritmos**
- **Regressão Linear/Logística**: Previsões contínuas ou classificações.
- **Árvores de Decisão e Random Forest**: Modelos de decisão e ensembles.
- **Máquinas de Vetores de Suporte (SVM)**: Classificação baseada em margens.
- **K-Vizinhos Mais Próximos (KNN)**: Classificação baseada em distâncias.
- **Redes Neurais (ANNs)**: Modelos inspirados no cérebro para tarefas complexas.
- **Boosting (XGBoost, LightGBM)**: Técnicas para melhorar a performance de modelos de previsão.

## 4. **Avaliação de Modelos**
- **Métricas de desempenho**: Precisão, recall, F1-score, etc.
- **Overfitting e Underfitting**: Ajuste excessivo ou insuficiente do modelo.
- **Validação Cruzada**: Teste do modelo em diferentes subconjuntos de dados.

## 5. **Deep Learning**
- **Redes Neurais Convolucionais (CNNs)**: Usadas para visão computacional (ex: reconhecimento de imagens).
- **Redes Neurais Recorrentes (RNNs) e LSTMs**: Usadas para dados sequenciais (ex: texto, séries temporais).
- **Redes Generativas Adversariais (GANs)**: Para gerar novos dados (ex: criação de imagens).

## 6. **Aplicações**
- **Visão Computacional**: Análise e interpretação de imagens.
- **Processamento de Linguagem Natural (NLP)**: Análise de texto e linguagem humana.
- **Recomendação de Sistemas**: Sugerir itens baseados no comportamento do usuário.
- **Previsão**: Prever eventos futuros (ex: demanda de produtos, clima).

## 7. **Ética**
- **Viés em Algoritmos**: Como dados enviesados podem afetar os resultados.
- **Privacidade**: Proteção de dados sensíveis.
- **Explicabilidade**: Tornar modelos mais transparentes e compreensíveis.

## 8. **Ferramentas**
- **Linguagens de Programação**: Python (bibliotecas como Scikit-learn, TensorFlow, PyTorch), R.
- **Ambientes de Desenvolvimento**: Jupyter Notebooks, Google Colab.
- **Plataformas de Nuvem**: AWS, Google Cloud, Microsoft Azure.


## Links dos notebooks
### [Felicidade](https://colab.research.google.com/drive/1sbweFzjHWFr0k5aoVJCQLP-LDA6yEgIj?usp=sharing)
#### Um dataset sobre qualidade de vida e hábitos alimentares. Ele relaciona o grau de felicidade de uma pessoa com a idade, tipo de alimentação (vegetariana, vegana, onívora) e expectativa de vida. Pode ser usado para análises correlacionais ou regressões sobre o impacto dos hábitos alimentares na felicidade e longevidade.
### [Housing price](https://colab.research.google.com/drive/1Mtgn5ZlidT1enyNT9ru8Rms-BFo7ugUR?usp=sharing)
#### Conjunto de dados de preço de imóveis, comum em projetos de regressão. Cada linha representa uma casa com informações sobre área, número de quartos, banheiros, andares, vaga de garagem e outras características (ex: tem ar-condicionado, está mobiliada). Usado para prever o preço de uma casa com base nessas variáveis.
### [Iris 1](https://colab.research.google.com/drive/1GXav-eblvIXgaVaHBFKPzNlkvMHLFpEt?usp=sharing)
#### É o clássico dataset de classificação de flores Iris, usado em aprendizado de máquina. Ele contém medidas do comprimento e largura das sépalas e pétalas de três espécies de flores (Iris setosa, Iris versicolor e Iris virginica). O objetivo típico é prever a espécie da flor com base nessas medidas.
### [Prepara Felicidade](https://colab.research.google.com/drive/1EP9L0tGT-KU9xBrl-HlSn2iEvGuTX_3i?usp=sharing)
#### Uso de regressão linear na mesma base de dados Felicidade.
### [Iris 2](https://colab.research.google.com/drive/14q1UKGsYOx33OJAFM0OnrkkgGGADoIKK?usp=sharing)
#### Uso de Random Forest na base de dados Iris.
### [P1 explicada](https://colab.research.google.com/drive/1k_4MkUoQo1K5whNnYNKjeT0FdrWglJT1?usp=sharing)
#### Um conjunto de dados sobre eventos espaciais — provavelmente alertas de possível colisão entre satélites. Contém informações sobre satélites envolvidos, distância mínima prevista (MIN_RNG), probabilidade de colisão (PC) e datas de criação e previsão do evento (TCA). Esse tipo de dado é usado em monitoramento de tráfego espacial e previsão de riscos orbitais.
### [Arvore de decisão - risco Credito](https://colab.research.google.com/drive/1YgKXWSi-UQ6pjC5X-4tdTPb6rqAWdMA8)
#### É um pequeno dataset usado para análise de risco de crédito. Cada linha representa um perfil de cliente com histórico financeiro, nível de dívida, presença de garantias, faixa de renda e o nível de risco (alto, moderado, baixo). Costuma ser usado para treinar modelos de decisão (ex: árvore de decisão) que classificam o risco de inadimplência de um cliente.

## Base de dados
#### As bases de dados utilizados em aula estão no diretório `/dados` e são obrigatórios para o funcionamento dos códigos dos notebooks, para utiliza-los, adicione na raiz de seu drive a pasta "dados" e faça o upload dos arquivos dentro da mesma.