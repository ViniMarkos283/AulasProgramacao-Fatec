# Objeto real
class ServicoReal:
    def executar(self):
        print("Obejto real - executando o servico real")

# Proxy (procurador)
class ProxyServicoReal:
    def __init__(self):
        self.servicoReal = ServicoReal()

    def executar(self):
        print("Proxy - antes da execução do serviço")
        self.servicoReal.executar()
        print("Proxy - depois da execução do serviço")

# uso do proxy
proxy = ProxyServicoReal()
proxy.executar()