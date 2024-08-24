const mysql = require('mysql')
const connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: '',
    database: 'fatec'
})

// inserir
function insert(nome, email) {
    let sql = 'insert into alunos set = ?'
    let dados = { nome: nome, email: email }
    connection.query(sql, dados, function (error, results, fields) {
        if (error) throw error; // try catch
        console.log("Inserido!")
    })
}

// ler
function select(id) {
    let sql = 'select * from alunos where id = ?'
    connection.query(sql, id, function (error, results, fields) {
        if (error) throw error; // try catch
        for (let i = 0; i < results.length; i++) { // laço repetição for
            console.log("seu id é: " + results[i].id + "\n" + "seu nome é: " + results[i].nome + "\n" + "seu e-mail é: " + results[i].email)
        }
    })
}

// apagar
function delection(id) {
    let sql = 'delete from alunos where id = ?'
    connection.query(sql, id, function (error, results, fields) {
        if (error) throw error; // try catch
        for (let i = 0; i < results.length; i++) {
            console.log("Apagando o registro: " + results[i].affectedRows)
        }
    })

}

// atualizar
function update(id, nome, email) {
    let sql = 'update alunos set = ? where id = ?'
    let dados = { id: id, nome: nome, email: email }
    let meuId = dados.id
    connection.query(sql, [dados, meuId], function (error, results, fields) {
        if (error) throw error; // try catch
        console.log("Atualizado " + results.affectedRows)
    })
}

// insert('predo', 'predinGameplays@gmail.com') // não ta pegando ;-;

// update(3, 'kratos', 'godofwar@gmail.com') // tbm n pega...

// arrumar 2 funções com defeito

