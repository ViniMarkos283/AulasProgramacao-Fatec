// precisa instalar a library do mysql tbm
// usa o comando: npm i mysql --save

const mysql = require('mysql') // escolhe o bd q vamos usar, no caso vai ser o mysql
const connection = mysql.createConnection({ // chama a conexão
    host: "localhost",
    user: "root",
    password: "",
    database: "fatec"
}) // com esses dados se permite acessar o bd

// Select command
function select(id) {
    let id = 3
    let sql = "select * from alunos where id = ?"
    connection.query(sql, id, function (error, results, fields) { // error faz o try catch, o results retorna e o fields são as colunas
        console.log(results.id + "" results.nome) // devolve o resultdo encontrado
    })
}
