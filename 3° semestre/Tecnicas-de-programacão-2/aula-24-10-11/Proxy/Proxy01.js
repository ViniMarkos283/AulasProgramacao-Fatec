// objeto real
class ServicoReal {
    executar() {
        console.log("Obejto Real - Executando o serviço real.");
    }
}

// Proxy (Procurador)
class ProxyServicoReal {
    constructor() {
        this.ServicoReal = new ServicoReal();
    }

    executar() {
        console.log("Proxy - Antes da execução do serviço");
        this.ServicoReal.executar();
        console.log("Proxy - Depois da execução do serviço");
    }
}

// Uso do proxy:
const proxy = new ProxyServicoReal();
proxy.executar();
