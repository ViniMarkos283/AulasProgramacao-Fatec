# esse codigo resolve aquelas contas passadas em aula e ainda dá um feedback

w0, w1, w2 = 0, 0, 0
taxa = 0.5

array_4x4 = [[1, 0, 0, 0],
             [1, 0, 1, 1],
             [1, 1, 0, 1],
             [1, 1, 1, 1]]

def Preception(linha):
    global w0, w1, w2
    v0, v1, v2, d = linha
    res = w0*v0 + w1*v1 + w2*v2

    # função de ativação (degrau)
    y = 1 if res >= 0 else 0

    if y == d:
        print("✅ combinação aceita:", linha, "-> pesos:", w0, w1, w2)
    else:
        print("❌ erro encontrado em", linha, "-> reajustando valores")
        PesoLoader(linha, y)

def PesoLoader(linha, y):
    global w0, w1, w2, taxa
    v0, v1, v2, d = linha
    erro = d - y

    w0 = w0 + taxa * erro * v0
    w1 = w1 + taxa * erro * v1
    w2 = w2 + taxa * erro * v2

    print("🔄 novos pesos:", w0, w1, w2)

    Preception(linha)


for row in array_4x4:
    Preception(row)
