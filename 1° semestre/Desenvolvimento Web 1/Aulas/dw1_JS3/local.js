function insereLocal() {
    const dados = [ // reaproveitamento de código antigo :)
        { id: 1, login: "seu Madruga", senha: 12345678 },
        { id: 2, login: "junin", senha: "juningameplays" },
        { id: 3, login: "predo", senha: "danone" }
    ]

    let bd = JSON.stringify(dados) // transforma o vetor [] em escrita, string

    // let nome = "marcos"

    localStorage.setItem("bd", bd)

    // localStorage.setItem("nome", nome) // insere o dado

    // localStorage.removeItem("nome") // remove o dado
}

function addExtra() { // adiciona mais um dado
    const dados = JSON.parse(localStorage.getItem("bd"))

    let lg = "ringo"
    let sn = "12345678"

    let registro = { id: Date.now(), login: lg, senha:sn } // o date.now gera um numero da data atual e coloca no id, se n tiver todos os parametros, dará erro

    dados.push(registro) // dados(vetor).push(empurra) = adiciona para dentro do dados

    const dd = JSON.stringify(dados) // torna legivel
    localStorage.setItem("bd", dd)

    const d2 = JSON.parse(localStorage.getItem("bd"))

    console.log(dados)
    alert(dados)
}

function pegaObjeto() { // função para pegar o valor
    let obj = JSON.parse(localStorage.getItem("ds")) // o JSON.parse transforma o vetor no tipo n legivel q era no começo

    alert(obj[0].nome)
    console.log(obj[0].nome)
}