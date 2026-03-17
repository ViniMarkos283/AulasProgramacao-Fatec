Questionário: Fundamentos de Machine Learning e Engenharia de Dados
1. Qual é a principal limitação do modelo tradicional baseado em regras desenvolvidas por especialistas humanos?

[ ] Sistemas manuais exigem muita infraestrutura de hardware.

[X] O processo torna-se impraticável devido ao grande volume de dados.

[ ] A produção de relatórios manuais é mais precisa que sistemas automatizados.

[ ] Os especialistas não possuem conhecimento técnico sobre algoritmos de ML.

2. No contexto de sistemas de Machine Learning, o que define o requisito de 'Confiabilidade' (Reliability)?

[ ] Por exemplo, está relacionado ao aumento da acurácia de 94% para 94.2% em conjuntos de teste.

[ ] A facilidade de atualizar o modelo com novos dados sem interromper o serviço.

[X] A capacidade do sistema executar funções específicas sob condições determinadas, mesmo diante de falhas silenciosas.

[ ] A habilidade de um modelo ser compreendido por especialistas de domínio.

3. Qual é a principal diferença entre os formatos de armazenamento de dados CSV e Apache Parquet?

[X] O CSV é orientado a linhas e legível por humanos, enquanto o Parquet é orientado a colunas e otimizado para compressão.

[ ] Arquivos CSV permitem leituras de colunas específicas de forma mais rápida que o Parquet.

[ ] O Parquet é baseado em texto simples, facilitando a depuração manual.

[ ] O Parquet não suporta grandes quantidades de dados (Big Data).

4. Sobre a escalabilidade em sistemas de ML, por que gerenciar 100 modelos é fundamentalmente diferente de gerenciar apenas 1?

[ ] O treinamento de um único modelo consome menos recursos de rede que o de centenas.

[ ] Com 100 modelos, a precisão individual é mais complexa de ser mantida.

[ ] Manter a documentação exige mais recursos quando o sistema escala para muitos modelos.

[X] A gestão de múltiplos modelos exige a automação total dos processos de monitoramento e retreinamento.

5. No processo de KDD, qual é a função primordial da etapa de pré-processamento de dados?

[ ] Selecionar o algoritmo de ML com a maior acurácia possível.

[ ] Garantir que o deploy do modelo seja feito sem interrupções de serviço.

[ ] Criar a interface de usuário final para visualização de relatórios.

[X] Tratar problemas de incompletude, inconsistência e ruído nos dados brutos.

6. Diferencie o conceito de 'Rótulo' (Label) e 'Atributo' (Feature) em um conjunto de dados para ML supervisionado.

[ ] Atributos são os resultados finais e rótulos são as variáveis independentes.

[ ] O rótulo representa a identificação do cliente e o atributo representa a resposta da predição.

[X] O rótulo é a resposta que queremos prever, enquanto os atributos são os valores usados para realizar essa previsão.

[ ] Rótulos são usados apenas em dados contínuos e atributos em dados nominais.

7. Sobre o processo de ELT (Extract, Load, Transform), por que ele é considerado vantajoso para o gerenciamento de Big Data?

[ ] Garante que apenas dados perfeitamente limpos entrem no Data Warehouse.

[ ] É um método considerado padrão para Data Warehousing.

[ ] Ele exige que todas as regras de negócio sejam definidas rigidamente antes da extração.

[X] Ele carrega os dados brutos diretamente no destino, sendo mais rápido e flexível para dados não estruturados.

8. O que caracteriza a 'Imparcialidade' (Fairness) em um algoritmo de aprendizado de máquina?

[X] A ausência de preconceitos históricos ou vieses socioeconômicos codificados nos dados de treinamento.

[ ] A capacidade do algoritmo de realizar cálculos com 100% de precisão matemática.

[ ] O uso exclusivo de dados anonimizados sem qualquer metadado.

[ ] A garantia de que o modelo nunca precisará ser atualizado.

9. Segundo as notas de aula, o que é a 'degradação' de um modelo de ML em produção?

[ ] A perda gradual de histórico na análise dos dados.

[ ] A redução do desempenho do conjunto de dados para recuperar informações históricas de negócio.

[X] A perda gradual de acurácia à medida que a realidade e os dados do mundo real mudam.

[ ] A degradação da relevância da informação causada na transformação de variáveis categóricas em numéricas.

10. Qual é a função do especialista no domínio dentro do processo de KDD?

[ ] Identificar objetivos de negócio para configurar os parâmetros de recuperação dos dados no software de produção.

[ ] Conciliar os parâmetros dos algoritmos utilizados no treinamento para obter padrões de dados que atendam os objetivos de negócios.

[ ] Estabelecer os objetivos de negócios de acordo com a necessidade de coleta de dados brutos.

[X] Identificar objetivos, restrições e avaliar se os padrões obtidos fazem sentido para o negócio.

11. Observando os pares (experiência, salário), qual etapa de pré-processamento seria MAIS importante antes de rodar a regressão?

[X] Verificação e tratamento de possíveis outliers (valores atípicos).

[ ] Conversão das variáveis numéricas para variáveis categóricas.

[ ] Exclusão de todas as instâncias onde a experiência é menor que 5 anos.

[ ] Ordenação dos dados por ordem alfabética.

12. Em um modelo de regressão linear para prever remuneração baseada em experiência, como devem ser classificadas essas variáveis?

[ ] Ambas são variáveis dependentes.

[ ] Experiência é a variável dependente e Salário é a variável independente.

[ ] Ambas são variáveis independentes.

[X] Salário é a variável de resposta (dependente) e Experiência é o preditor (independente).

13. Qual é o objetivo principal para se treinar um modelo de regressão linear?

[ ] Maximizar a soma dos erros absolutos.

[ ] Eliminar completamente o ruído dos dados.

[X] Minimizar a soma dos erros quadráticos da função de aproximação.

[ ] Transformar problemas lineares em problemas não lineares.

14. Se o modelo de regressão linear apresentar um 'Erro Absoluto Médio' alto, o que isso indica?

[ ] Que a reta de regressão está passando exatamente por todos os pontos.

[ ] Que o número de dados de entrada é insuficiente.

[ ] Que o modelo é paramétrico e determinístico.

[X] Que a relação entre experiência e salário pode não ser perfeitamente linear ou existe muita variância nos dados.