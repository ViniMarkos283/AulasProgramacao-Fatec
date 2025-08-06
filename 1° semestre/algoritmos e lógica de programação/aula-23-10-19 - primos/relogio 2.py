# crie uma função que exiba todos os segundos do primeiro
# minuto

from time import sleep

def relogio():
    s = 0
    while s < 60:
        print(s)
        s += 1
        sleep(1)
