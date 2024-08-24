    // primeira versão
// var http = require('http')

// 	http.createServer().listen(8081)

// 	console.log("O servidor está funcionando")

    // nova versão
var http = require('http')

	http.createServer(function(req,res) {
		res.end("Olá")
        }).listen(8081)

	console.log("O servidor está funcionando")