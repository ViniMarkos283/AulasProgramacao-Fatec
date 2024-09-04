// importação
const express = require('express');
const fs = require('fs');
const path = require('path')

// cria a rota
const router = express();

// cria rota '/'
router.get('/', (req, res) => {
    fs.readFile(path.join(__dirname, 'index.html'), (err, data) => {
        if (err) {
            res.status(500).send("500 - Erro interno do servidor")
        } else {
            res.status(200).type('text/html').send(data);
        }
    })
})
// cria rota '/rota1'
router.get('/rota1', (req, res) => { // 
    let num1 = parseFloat(req.query.num1);
    let num2 = parseFloat(req.query.num2);
    let soma = num1 + num2
    let resultado = soma.toString() // converte para string

    res.send("soma = " + num1 + " + " + num2 + " = " + soma)
})
// cria rota '/rota2'
router.get('/rota2', (req, res) => {
    res.send('rota 2 ...')
})

// exportação
module.exports = router;