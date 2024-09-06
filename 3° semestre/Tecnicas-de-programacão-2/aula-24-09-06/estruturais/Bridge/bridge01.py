from abc import ABC, abstractmethod

# IMPLEMENTAÇÃO DAS CORES
# interface das cores
class Cor(ABC):
    @abstractmethod
    def getCor(self):
        pass

# implementação das cores:
class VermelhoCor(Cor):
    def getCor(self):
        return "vermelho"
    
class AzulCor(Cor):
    def getCor(self):
        return "azul"
    
class VerdeCor(Cor):
    def getCor(self):
        return "verde"
    
# IMPLEMENTAÇÃO DAS FORMAS
class Forma(ABC):
    def __init__(self, cor):
        self.cor = cor

    @abstractmethod
    def desenho(self):
        pass

# Abstração refinada:
class Circulo(Forma):
    def desenho(self):
        print(f"desenhando um circulo {self.cor.getCor()}")

class Quadrado(Forma):
    def desenho(self):
        print(f"desenhando um quadrado {self.cor.getCor()}")

class Triangulo(Forma):
    def desenho(self):
        print(f"desenhando um triangulo {self.cor.getCor()}")

# cliente
vermelho = VermelhoCor()
azul = AzulCor()
verde = VerdeCor()

estrutura1 = Circulo(vermelho)
estrutura2 = Circulo(verde)
estrutura3 = Circulo(azul)
estrutura4 = Circulo(vermelho)
estrutura5 = Quadrado(verde)
estrutura6 = Triangulo(azul)

estrutura1.desenho()
estrutura2.desenho()
estrutura3.desenho()
estrutura4.desenho()
estrutura5.desenho()
estrutura6.desenho()
