from random import randint # importa o ranint da library random

# deixa o user digitar, mas senao quiser, ele usa os valores default
def gera(n, vmin=10, vmax=99):
    L = []
    for i in range(n):
        L.append(randint(vmin,vmax))
    return L
