# interface do cliente
class Target:
    def request(self):
        pass

# cliente
class Cliente:
    def __init__(self, target):
        self.target = target

    def criarRequest(self):
        print("cliente fazendo uma requisição")
        self.target.request()

# serviço existente
class Adaptee:
    def resquestEspecifico(self):
        print("requisição especifica do adaptee")

# adaptador
class Adapter:
    def __init__(self,adaptee):
        self.adaptee = adaptee

    def request(self):
        self.adaptee.requestEspecifico()

# utilização do adaptador:
adaptee = Adaptee()
adapter = Adapter(adaptee)
cliente = Cliente(adapter)

cliente.criarRequest()

# cliente faz uma requisição e a requisição especifica do adaptee deve ser demonstrada