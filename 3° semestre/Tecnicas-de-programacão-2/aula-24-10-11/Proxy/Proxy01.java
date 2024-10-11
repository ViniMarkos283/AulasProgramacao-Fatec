// objeto real
class ServicoReal {
    public void executar() {
        System.out.println("Objeto real - executando o serviço real");
    }
}

// Proxy (procurador)
class ProxyServicoReal {
    private ServicoReal servicoReal;

    public ProxyServicoReal(){
        this.servicoReal = new ServicoReal();
    }

    public void executar() {
        System.out.println("Proxy - Antes da execução do serviço");
        servicoReal.executar();
        System.out.println("Proxy - depois da execução do serviço");
    }
}

// Uso do Proxy (simulando)
public class Proxy01 {
    public static void main(String[] args) {
        ProxyServicoReal proxy = new ProxyServicoReal();
        proxy.executar();
    }
}