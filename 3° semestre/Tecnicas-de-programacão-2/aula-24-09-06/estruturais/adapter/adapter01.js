// interface do cliente
class Target{
    resquest(){}
}

// cliente
class Cliente{
    constructor(target){
        console.log("cliente fazendo uma requisição")
        this.target.resquest();
    }
}

// serviço existente
class Adaptee{
    requestEspecifico(){
        console.log("Requsisição especifica do adaptee")
    }
}

// adaptador
class Adapter{
    constructor(Adaptee){
        this.adaptee = Adaptee;
    }

    request(){
        this.Adaptee.requestEspecifico();
    }
}

// utilização do adaptador
const adapte = new Adaptee();
const adapter = new Adapter(adaptee);
const cliente = new Cliente(adapter);

cliente.criarRequest();

// cliente faz uma requisição e a requisição especifica do adaptee deve ser demonstrada