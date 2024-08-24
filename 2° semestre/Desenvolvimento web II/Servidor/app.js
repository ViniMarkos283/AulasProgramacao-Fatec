// no terminal, para instalar o framework do express, usa: 'npm install express' ou 'npm i express'
// usa-se o express para driblar a limitação do navegador a respeito de n rodar determinadas coisas

const express = require('express') // framework express, precisa instalar pra funcionar
const app = express() // inicia o framework (dps de instalar, claro)

app.get('/', function (req, res) { // pega o / do localhost, usa o request e o responde como parametros
    //    res.send("Olá Express") // retorna uma mensagem
    res.json({ nome: 'Marcos', sobrenome: 'Oliveira' }) // retorna uma mensagem
})

// iniciando o server
const server = app.listen(3000, function () {
    const host = server.address().address
    const port = server.address().port
    console.log("Servidor iniciando", host, port)
})

