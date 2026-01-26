function tabela() {
    const dados = [
        { id: 1, login: "seu Madruga", senha: "14mesesdealuguel", nome: "Ramon Valdés", email: "madruginha@gmail.com" },
        { id: 2, login: "junin", senha: "juningameplays999", nome: "Francisco Junior", email: "junindeveloper@hotmail.com" },
        { id: 3, login: "kleiton", senha: "obomdaguerra", nome: "Kratos", email: "obomdaguerra@gmail.com" },
        { id: 4, login: "admin", senha: "mandaopix", nome: "patrick", email: "adm_ppcr_5.0@outlook.com" }
    ]
    let table = JSON.stringify(dados)
    localStorage.setItem("table", table)
}

// CRUD //

function adicionar() {
    const dados = JSON.parse(localStorage.getItem("table"))

    let lg = document.querySelector("#login").value
    let sn = document.querySelector("#senha").value
    let nm = document.querySelector("#nome").value
    let em = document.querySelector("#email").value

    if (lg != "" && sn != "" && nm != "" && em != "") { // condição pra evitar adicionar campos vazios na tabela
        let data = { id: Date.now(), login: lg, senha: sn, nome: nm, email: em }

        dados.push(data)
        const table = JSON.stringify(dados)
        localStorage.setItem("table", table)
        alert("Cadastro realizado com sucesso!")
        limparCampos()
    }

}

function localizar() {
    const dados = JSON.parse(localStorage.getItem("table"))

    let em = document.querySelector("#email").value
    let lg = document.querySelector("#login").value

    for (let i = 0; i < dados.length; i++) {
        if (dados[i].login == lg || dados[i].email == em) { // permite procurar tanto com o nome quanto o login
            alert("Cadastro encontrado!\n \nSeu ID é: " + dados[i].id + ";\nSeu username é: " + dados[i].login + ";\nSua senha é: " + dados[i].senha + ";\nSeu nome é: " + dados[i].nome + ";\nSeu E-mail é: " + dados[i].email)
        }
    }
}

function alterar() {
    const dados = JSON.parse(localStorage.getItem("table"))

    let id = parseInt(document.querySelector("#id").value) // mudei para int pq tava lendo como string
    let lg = document.querySelector("#login").value
    let sn = document.querySelector("#senha").value
    let nm = document.querySelector("#nome").value
    let em = document.querySelector("#email").value

    for (let i = 0; i < dados.length; i++) {
        if (id == dados[i].id) {
            let user = { id: id, login: lg, senha: sn, nome: nm, email: em }
            dados[i] = user;
            localStorage.setItem("table", JSON.stringify(dados))
            alert("Atualizado!")
            break
        }
    }
    limparCampos()
}

function apagar() {
    const dados = JSON.parse(localStorage.getItem("table"))

    let id = parseInt(document.querySelector("#id").value)
    let lg = document.querySelector("#login").value

    for (let i = 0; dados.length > i; i++) {
            if (id == dados[i].id && lg == dados[i].login) {
                alert("cadastro encontrado! \nApagando...")
                alert("Cadastro apagado com sucesso!")
                delete dados[i]
                break;
            }
        }
        localStorage.setItem("table", JSON.stringify(dados))
        limparCampos()
    }

function limparCampos() { // só pra deixar os inputs limpos apos algum uso
    document.querySelector("#id").value = ""
    document.querySelector("#login").value = ""
    document.querySelector("#senha").value = ""
    document.querySelector("#nome").value = ""
    document.querySelector("#email").value = ""
}

tabela()