const mysql = require('mysql2');
const connection = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "",
    database: "fatec"
})

function createAdd() {
    let lg = document.querySelector('#inputLogin').value
    let sn = document.querySelector('#inputPassword4').value
    let end = document.querySelector('#inputAddress').value
    let em = document.querySelector('#inputEmail').value
    let cid = document.querySelector('#inputCity').value
    let uf = document.querySelector('#inputEstado').value
    let cp = document.querySelector('#inputCEP').value

    console.log(lg, sn, end, em, cid, uf, cp)

    // let lg = 'vinimarkos'
    // let sn = '12345678'
    // let end = 'rua do cafe'
    // let em = 'marcos@gmail.com'
    // let cid = 'diadema'
    // let uf = 'SP'
    // let cp = '09981111'

    let sql = 'insert into usuario set ?'
    let dados = { login: lg, senha: sn, endereco: end, email: em, cidade: cid, estado: uf, cep: cp }
    alert(dados)
    connection.query(sql, dados, function (error, results, fields) {
        if (error) throw error
        console.log("Dados inseridos com sucesso!")
    })
}

function selectAdd() {
    let lg = document.querySelector('#inputLogin').value

    let sql = 'select * from usuario where login = ?'
    query.connection(sql, lg, function (error, results, fields) {
        if (error) throw error
        console.log("Seus dados são: " + results.affectedRows)
    })
}

function updateAdd() {

}

function deleteAdd() {

}

createAdd()