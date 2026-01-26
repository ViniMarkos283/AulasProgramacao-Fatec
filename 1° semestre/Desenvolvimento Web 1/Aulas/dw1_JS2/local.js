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

function pegaObjeto(){ // função para pegar o valor
    let obj = JSON.parse(localStorage.getItem("ds")) // o JSON.parse transforma o vetor no tipo n legivel q era no começo

    

    alert(obj[0].nome)
    console.log(obj[0].nome)
}