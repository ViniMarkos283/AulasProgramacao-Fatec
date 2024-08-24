// carregando modulo HTTP
const http = require('http') // requer o protocolo http | http != https

const server =  http.createServer(function (request, response){ // cria o servidor http | request pega a info / response envia a info
    response.writeHead(200, {"content-type":"text/plain"}) // passa para ele o tipo 
    response.end("Hello World Node!") // se der resposta, manda um hello world
})
// porta do server q vai escutar
server.listen(3000) 
console.log("Servidor iniciado em http://localhost:3000/")