// 01 - Com o Padrão GoF Comportamental Chain, crie um fluxo de processamento de avaliação escolar. 
// Onde o aluno entra com a nota P1, todas as demais atividades, nota P2 e avalia seu processo escolar. 
// Se atingiu nota maior ou igual que a media, aprova e encerra o processo, caso contrario, 
// da oportunidade de fazer a P3 e reavaliar se passou ou não. No final, deve informar o status.

class EtapaProcesso {
    constructor() {
        this.proximaEtapa = null;
    }

    setProximaEtapa(proximaEtapa) {
        this.proximaEtapa = proximaEtapa;
    }

    processar(notas) {
        throw new Error("Este metodo deve ser implementado pelas suas subclasses")
    }

    calcularMedia(n1, n2, n3) {
        return (n1 + n2 + n3) / 3
    }
}

class EtapaP1 extends EtapaProcesso {
    processar(notas) {
        const { p1, atv, p2 } = notas;
        console.log("Validando nota da P1 ...")
        if (p1 != null) {
            if (p1 >= this.calcularMedia(notas)) {
                console.log("nota da P1 recebida - aprovado !!!")
            } else {
                console.log("nota da P1 recebida - reprovado !!!")
            }
            this.proximaEtapa.processar(notas);
        } else {
            console.log("Falha na obtenção da nota da P1 - encerrando operação ...")
        }
    }
}

class EtapaAtv extends EtapaProcesso {
    processar(p1, atv, p2) {
        const { p1, atv, p2 } = notas;
        console.log("Validando nota da atividade ...")
        if (atv != null) {
            if (atv >= this.calcularMedia(notas)) {
                console.log("nota da atividade recebida - aprovado !!!")
            } else {
                console.log("nota da atividade recebida - reprovado !!!")
            }
            this.proximaEtapa.processar(notas);
        } else {
            console.log("Falha na obtenção da nota da atividade - encerrando operação ...")
        }
    }
}

class EtapaP2 extends EtapaProcesso {
    processar(notas) {
        const { p1, atv, p2 } = notas;
        console.log("Validando nota da atividade ...")
        const med = this.calcularMedia(notas);
        if (p2 != null) {
            if (p2 >= med) {
                console.log("nota da atividade P2 - aprovado !!!")
            } else {
                console.log("nota da atividade P2 - reprovado !!!")
            }
            this.proximaEtapa.processar(notas);
        } else {
            console.log("Falha na obtenção da nota da P2 - encerrando operação ...")
        }
    }
}

class Notas {
    constructor(p1, atv, p2) {
        this.p1 = p1;
        this.atv = atv;
        this.p2 = p2;
    }
}

class Aluno {
    atribuirNotas(p1, atv, p2) {
        const etapaP1 = new EtapaP1();
        const etapaAtv = new EtapaAtv();
        const etapaP2 = new EtapaP2();

        etapaP1.setProximaEtapa(etapaAtv);
        etapaAtv.setProximaEtapa(etapaP2);

        const notas = new Notas(p1, atv, p2);

        etapaP1.processar(notas);
    }
}

const aluno = new Aluno();
aluno.atribuirNotas(10, 7, 4.5);
