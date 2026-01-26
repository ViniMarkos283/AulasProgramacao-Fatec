// simulando um banco de dados maroto 

function banco(lg, sn){
    const dados = [ // banco de dados simulado
        {id:1, login:"seu Madruga", senha:12345678},
        {id:2, login:"junin", senha:"juningameplays"},
        {id:3, login:"predo", senha:"danone"}
    ]

    for(let i = 0; i < dados.length; i++){
        if(dados[i].login == lg && dados[i].senha == sn){ // laço, vai procurar o login no banco
            console.log("registro de cadastro encontrado!")

            window.location.href = "contas.html" // redireciona para outra página após logar
        }
    }
}

function logar(){
    let lg = document.getElementById("login").value
    let sn = document.getElementById("senha").value

    banco(lg,sn) // chamou outra função dentro de uma
}
