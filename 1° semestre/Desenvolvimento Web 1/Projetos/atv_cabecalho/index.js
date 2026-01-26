function local() { // esses nomes n foram escolhidos por acaso
    let dados = [{ "id": 1, "nome": "leonardo", "senha": 1111 },
    { "id": 2, "nome": "rafael", "senha": 2222 },
    { "id": 3, "nome": "donatello", "senha": 3333 },
    { "id": 4, "nome": "michelangelo", "senha": 4444 },
    ]
    let n = JSON.stringify(dados);
    localStorage.setItem("tds", n);
    return dados
}

function logon() {  // adicionei umas coisas a mais pra deixar mais interativo
    const dados = JSON.parse(localStorage.getItem("tds"))
    
    let color = ['leo','raf','don','mic']
    
    let login = document.querySelector("#login").value
    let senha = document.querySelector("#senha").value
    let span = document.querySelector("#span")
    let head = document.querySelector('#head')
    let opt = document.querySelector('#logButton')

    for (let i = 0; dados.length > i; i++) {
        if (login == dados[i].nome && senha == dados[i].senha) {
            span.classList.replace('notOk','ok')
            head.classList.add(color[i])
            opt.classList.replace('bk', color[i])
            span.textContent = "conectado com sucesso!"

            document.querySelector("#nome").value = 'Bem vindo, ' + dados[i].nome + '!'

            let n = JSON.stringify(dados[i]);
            sessionStorage.setItem("user", n)
            break
        }
    
}

if (login == '' || senha == '') {
    span.classList.replace('ok','notOk')
    span.textContent = "preencha todos os campos antes de logar"
}
}