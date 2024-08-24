vermelho = []
laranja = []
amarelo = []
verde = []
azul = []

while True:
    try:
        entrada = input()
        if entrada == 'beep':
            if vermelho != []:
                atendido = vermelho.pop(0) # pop(): tira o ultimo item e retorna como resposta
                print(atendido)
            elif laranja != []:
                print(laranja.pop(0)) # mesmo codigo q o de cima, porem otimizado
            elif amarelo != []:
                print(amarelo.pop(0))
            elif verde != []:
                print(verde.pop(0))
            else:
                print(azul.pop(0))
        else:
            senha, risco = entrada.split()
            if risco == 'VERMELHO': vermelho.append(senha)
            elif risco == 'LARANJA': laranja.append(senha)
            elif risco == 'AMARELO': amarelo.append(senha)
            elif risco == 'VERDE': verde.append(senha)
            else: azul.append(senha)

    except:
        break

# pop(x): tira a posição escolhida e o retorna