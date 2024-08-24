# treinamento interfatecs dia 09/05/24
def exibe(L):
    for item in L:
        print(*item)

qtd_paises = int(input())
paises = []

for i in range (qtd_paises):
    nome, o, p, b = input().split()
    o, p, b = int(o), int(p), int(b)
    paises.append([nome,o,p,b])

paises.sort(key=lambda item: item[0])
paises.sort(key=lambda item: item[3], reverse=True)
paises.sort(key=lambda item: item[2], reverse=True)
paises.sort(key=lambda item: item[1], reverse=True)

exibe(paises)