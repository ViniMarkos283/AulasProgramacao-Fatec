import pandas as pd
df = pd.read_csv('Housing_Price_Data.csv')
print(df)

df=df.dropna()

from pycaret.regression import *
s = setup(df, target = 'price', session_id = 123)
print("Configuração dos dados")
print(s)

print("Pipeline")
print(s.pipeline)

print("Variaveis e propriedades do Pipeline")
print(s.get_config("variable_and_property_keys"))

# compare baseline models
best = compare_models(n_select=3) # obter os 3 melhores modelos

#criar os 3 mehlores modelos e realizar a predição
print("Criação do modelo 1")
mod1 = create_model(best[0])
print("Criação do modelo 2")
mod2 = create_model(best[1])
print("Criação do modelo 3")
mod3 = create_model(best[2])

# realizar a predição usando os dados de teste do setup
print("Predição do modelo 1")
predict_model(mod1)
print("Predição do modelo 2")
predict_model(mod2)
print("Predição do modelo 3")
predict_model(mod3)

# avaliar o modelo
print("Avaliação do modelo 1")
evaluate_model(mod1)
print("Avaliação do modelo 2")
evaluate_model(mod2)
print("Avaliação do modelo 3")
evaluate_model(mod3)

# otimizar o melhor modelo
print("Criação do modelo 1 otimizado")
mod1_ot = tune_model(mod1)
print("Criação do modelo 2 otimizado")
mod2_ot = tune_model(mod2)
print("Criação do modelo 3 otimizado")
mod3_ot = tune_model(mod3)

# avaliar o modelo otimizado
print("Avaliação do modelo 1 otimizado")
evaluate_model(mod1_ot)
print("Avaliação do modelo 2 otimizado")
evaluate_model(mod2_ot)
print("Avaliação do modelo 3 otimizado")
evaluate_model(mod3_ot)

print("Modelo 1 otimizado")
print(mod1_ot)
print("Modelo 2 otimizado")
print(mod2_ot)
print("Modelo 3 otimizado")
print(mod3_ot)
