function insereDados() {
    const dados = [
        { id: 1, login: "luffy", senha: "3_000_000_000" },
        { id: 2, login: "zoro", senha: "1_110_000_000" },
        { id: 3, login: "sanji", senha: "999" }
    ]
    let ds = JSON.stringify(dados)
    localStorage.setItem("bd", ds)
}

// Abaixo as funçoes do CRUD (create, read, update and delete)

function inserir() { // função para inserir (create, insert)
    const dados = JOSN.parse(localStorage.getItem("bd"))

    let lg = document.querySelector("#login").value // vai pegar o id do login e capturar seu valor
    let sn = document.querySelector("#senha").value

    let data = { id: Date.now(), login: lg, senha: sn } // adiciona os valores no data

    dados.push(data)
    const ds = JSON.stringify(dados)
    localStorage.setItem("bd", ds)
}

function seleciona() { // função para localizar (read)
    const dados = JOSN.parse(localStorage.getItem("bd"))

    let nm = document.querySelector("#nome").value

    for (let i = 0; i < dados.length; i++) { // laço, verifica até o ultimo item do vetor
        if (dados[i].login == nm) {
            console.log(dados[i].id + ":" + dados[i].login + ":" + dados[i].senha)

            //aqui ele vai escrever os dados respectivos ao que foi encontrado
            document.querySelector("#id").innerHTML = dados[i].id
            // document.querySelector("#nome").innerHTML = dados[i].login
            document.querySelector("#senha").innerHTML = dados[i].senha
        }
    }
}

function atualizar() { // função para atualizar os campos (update)
    const dados = JSON.parse(localStorage.getItem("bd"))
    localStorage.removeItem("tds")
    let id = document.querySelector("#id").value
    let login = document.querySelector("#login").value
    let senha = document.querySelector("#senha").value

    let nm = document.querySelector("#nome").value

    for (let i = 0; i < dados.length; i++) { // o I é o contador, o length mede o tamanho do vetor e vai até o ultimo registro, o i++ é o incremento (i +=1) e  tbm tem o decremento ++i (i -= 1)
        if (id == dados[i].id) { // comparação de valores de id
            let user = {id: id, nome: login, senha: senha}
            dados[i] = user // atribuiu o user aos dados
            localStorage.setItem("tds", JSON,stringify(dados)) // adicionando na tabela e transformando em formato JSON
            alert("Atualizado!")
            break // quebra do loop assim q achar o resultado
        }
    }
}