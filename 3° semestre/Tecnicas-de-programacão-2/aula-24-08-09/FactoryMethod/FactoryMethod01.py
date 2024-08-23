# versão python do msm codigo do JS

# classe base de veiculo
class Veiculo:
    def __init__(self, modelo): # o init é o construtor, se escreve __init__
        self.modelo = modelo # self é igual ao this

    def mostrarDetalhes(self): # def cria uma função
        print(f'Modelo: {self.modelo}')

# subclasses de veiculos
class Carro(Veiculo): # o extends no python é um parametro da classe q chama sua superclasse Veiculo
    def __init__(self, modelo):
        super().__init__(modelo)

class Moto(Veiculo):
    def __init__(self, modelo):
        super().__init__(modelo)

class Barco(Veiculo):
    def __init__(self, modelo):
        super().__init__(modelo)

# Fabrica abstrata de veiculos
class FabricaDeVeiculos:
    def criarVeiculo(self, modelo):
        raise NotImplementedError('O modelo criarVeiculo deve ser implementado pelas subclasses') # raise é a exceção de erro, se n for implementado a função

# fabrica concreta de Carros
class FabricaDeCarros(FabricaDeVeiculos):
    def criarVeiculo(self, modelo):
        return Carro(modelo)
    
# fabrica concreta de Motos
class FabricaDeMotos(FabricaDeVeiculos):
    def criarVeiculo(self, modelo):
        return Moto(modelo)
    
# fabrica concreta de Barcos
class FabricaDeBarcos(FabricaDeVeiculos):
    def criarVeiculo(self, modelo):
        return Barco(modelo)
    
# --------------------------- uso do Factory Method ------------------------------
fabricaDeCarros = FabricaDeCarros()
carro1 = fabricaDeCarros.criarVeiculo('Sedan')
carro2 = fabricaDeCarros.criarVeiculo('Fusca')
carro1.mostrarDetalhes()
carro2.mostrarDetalhes()

fabricaDeMotos = FabricaDeMotos()
moto1 = fabricaDeMotos.criarVeiculo('Esportiva')
moto1.mostrarDetalhes()

fabricaDeBarcos = FabricaDeBarcos()
barco1 = fabricaDeBarcos.criarVeiculo('Lancha')
barco1.mostrarDetalhes()
