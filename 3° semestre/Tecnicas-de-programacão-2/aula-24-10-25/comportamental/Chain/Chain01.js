// classe Base:
class EtapaProcesso {
    constructor() {
        this.proximaEtapa = null;
    }

    setProximaEtapa(proximaEtapa) {
        this.proximaEtapa = proximaEtapa;
    }

    processar(pagamento) {
        throw new Error("Este metodo deve ser implementado pelas subclasses.");
    }
}

// Etapas concretas:
class EtapaConexao extends EtapaProcesso {
    processar(pagamento) {
        console.log("Estabelecendo conexão...")
        // incluir uma logica de conexao aqui
        if (true) {
            if (this.proximaEtapa) { // supondo que a conexao foi bem sucedida
                this.proximaEtapa.processar(pagamento);
            }
        } else {
            console.log("Falha na conexão - Processamento Encerrado... ")
        }
    }
}

class EtapaValidacao extends EtapaProcesso {
    processar(pagamento) {
        console.log("Validando informações do pagamento ...");
        // inlcuir uma logica de validação aqui
        if (pagamento.valor > 0) {
            console.log("Informações validadas ...")
            if (this.proximaEtapa) {
                this.proximaEtapa.processar(pagamento);
            }
        } else {
            console.log("Informações Invalidas - Processamento Encerrado ...")
        }
    }

}

class EtapaEnvioInformacao extends EtapaProcesso {
    processar(pagamento) {
        console.log("Enviando informações do pagamento ...")
        // logica de envio de informações
        console.log("Informações enviadas.")
        if (this.proximaEtapa) {
            this.proximaEtapa.processar(pagamento);
        }

    }

}

class EtapaAutenticacao extends EtapaProcesso {
    processar(pagamento) {
        console.log("Autenticação do pagamento ...")
        // logica da Autenticação
        if (true) { // supondo autenticação bem sucedida
            console.log("Pagamento Autenticado ...")
            if (this.proximaEtapa) {
                this.proximaEtapa.processar(pagamento);
            }
        } else {
            console.log("Autenticação Falhou - Processo Encerrado ...")
        }
    }

}

class EtapaConfirmacao extends EtapaProcesso {
    processar(pagamento) {
        console.log("Confirmando Pagamento ...")
        // Logica de Confirmação
        console.log("Pagamento Confirmado com sucesso !!!")
    }
}

// objeto alvo - pagamento:
class Pagamento {
    constructor(valor) {
        this.valor = valor;
        // inserir outros dados relevantes
    }
}

// Cliente:
class Cliente {
    iniciarProcessoPagamento(valor) {
        // criação das etapas:
        const etapaConexao = new EtapaConexao();
        const etapaValidacao = new EtapaValidacao();
        const etapaEnvio = new EtapaEnvioInformacao();
        const etapaAutenticacao = new EtapaAutenticacao();
        const etapaConfirmacao = new EtapaConfirmacao();

        // configurações da cadeia (chain) de processamento:
        etapaConexao.setProximaEtapa(etapaValidacao);
        etapaValidacao.setProximaEtapa(etapaEnvio);
        etapaEnvio.setProximaEtapa(etapaAutenticacao);
        etapaAutenticacao.setProximaEtapa(etapaConfirmacao);

        // criação do pagamento
        const pagamento = new Pagamento(valor);

        // inicio do processo:
        etapaConexao.processar(pagamento);
    }
}

// uso do Chain como fluxo de pagamento:
const cliente = new Cliente();
cliente.iniciarProcessoPagamento(100.00); // inicia pagamento com R$100