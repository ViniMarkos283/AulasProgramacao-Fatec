/*
- para achar os nomes certos dos itens q vao no writehead, procura no site Media types
*/


// importação dos modulos necessários:
const http = require('http');
const url = require('url');
const fs = require('fs'); // fire system 

// criar o server:
const server = http.createServer((req, res) => {

    // implementação de libs necessarias para trabalhar com url/uri
    const reqUrl = url.parse(req.url, true); // analise da url
    const path = reqUrl.pathname; // analise do conteudo do caminho
    const query = reqUrl.query; // analise das variaveis pela URL

    // criação dos endPoints
    if (path == "/") {
        // res.writeHead(200, { 'Content-Type': 'text/plain; charset=utf-8' });
        // res.end("rota raiz acessada com sucesso!")
        fs.readFile('./index.html', 'utf-8', (err, data) => {
            if (err) { // se ele n conseguir ler...
                res.writeHead(500, { 'Content-Type': 'text/plain; charset=utf-8' }); // erro 500 = problema do server
                res.end("500 - erro interno do servidor ...")
            } else {
                res.writeHead(200, { 'Content-Type': 'text/html; charset=utf-8' }); // no lugar do text plain, agr é text html
                res.end(data); // arquivo html
            }
        }) // mandando um html
    }
    else if (path == "/pdf") {
        // caso o endpoint for pdf, executa esse bloco
        fs.readFile('./arquivos/arquivo.pdf', 'utf-8', (err, data) => {
            if (err) {
                res.writeHead(500, { 'Content-Type': 'text/plain; charset=utf-8' }); // no lugar do text plain, agr é text html
                res.end("500 - erro interno do servidor ...")

            } else {
                res.writeHead(200, { 'Content-Type': 'application/pdf; charset=utf-8' });
                res.end("pdf acessado com sucesso!")
            }
        })
    }
    // variaveis dos endpoints IMC:
    else if (path == "/imc") {
        // caso seja imc, executa esse
        const nome = query.n;
        const peso = parseFloat(query.p);
        const altura = parseFloat(query.a);

        // processamento da informação no back-end:
        if (isNaN(peso) || isNaN(altura)) {
            // caso variaveis não estejam corretas...
            res.writeHead(400, { 'Content-Type': 'text/plain; charset=utf-8' })
            res.end('400 - Os valores devem ser conteudos válidos')
        } else {
            // caso as variaveis estejam corretas...
            const imc = peso / (altura * altura);

            // Classificação do IMC:
            let classificacao;
            if (imc < 18.5) {
                classificacao = "Abaixo do peso";
            } else if (imc < 24.9) {
                classificacao = "Peso normal";
            } else if (imc < 29.9) {
                classificacao = "Sobrepeso";
            } else if (imc < 39.9) {
                classificacao = "Obesidade 1";
            } else {
                classificacao = "Obesidade grave";
            }

            // classificação do IMC:
            if (imc < 18.5) {
                // abaixo do peso (cambito)
                // res.writeHead(200, { 'Content-Type': 'text/plain; charset=utf-8' })
                // res.end("IMC - Abaixo do peso")
                fs.readFile("index.html", 'utf-8', (err, data) => {
                    if (err) {
                        res.writeHead(500, { 'Content-Type': 'text/plain; charset=utf-8' });
                        res.end("500 - Erro no servidor")
                    } else {
                        data = data.replace(`{imc}`, imc.toFixed(1)) // vai achar o imc no html e substituir pelo valor
                        data = data.replace(`{peso}`, classificacao)
                        console.log(imc)
                        res.writeHead(200, { 'content-type': 'text/html;charset=utf-8' })
                        res.end(data);
                    }
                })
            } else if (imc < 24.9) {
                // peso normal
                // res.writeHead(200, { 'Content-Type': 'text/plain; charset=utf-8' })
                // res.end("IMC - peso normal")
                fs.readFile("index.html", 'utf-8', (err, data) => {
                    if (err) {
                        res.writeHead(500, { 'Content-Type': 'text/plain; charset=utf-8' });
                        res.end("500 - Erro no servidor")
                    } else {
                        data = data.replace(`{imc}`, imc.toFixed(1)) // vai achar o imc no html e substituir pelo valor
                        data = data.replace(`{peso}`, classificacao)
                        res.writeHead(200, { 'content-type': 'text/html;charset=utf-8' })
                        res.end(data);
                    }
                })

            } else if (imc < 29.9) {
                // sobre peso
                // res.writeHead(200, { 'Content-Type': 'text/plain; charset=utf-8' })
                // res.end("IMC - Sobrepeso")
                fs.readFile("index.html", 'utf-8', (err, data) => {
                    if (err) {
                        res.writeHead(500, { 'Content-Type': 'text/plain; charset=utf-8' });
                        res.end("500 - Erro no servidor")
                    } else {
                        data = data.replace(`{imc}`, imc.toFixed(1)) // vai achar o imc no html e substituir pelo valor
                        data = data.replace(`{peso}`, classificacao)
                        res.writeHead(200, { 'content-type': 'text/html;charset=utf-8' })
                        res.end(data);
                    }
                })
            } else if (imc < 39.9) {
                // obesidade 1
                // res.writeHead(200, { 'Content-Type': 'text/plain; charset=utf-8' })
                // res.end("IMC - obesidade 1")
                fs.readFile("index.html", 'utf-8', (err, data) => {
                    if (err) {
                        res.writeHead(500, { 'Content-Type': 'text/plain; charset=utf-8' });
                        res.end("500 - Erro no servidor")
                    } else {
                        data = data.replace(`{imc}`, imc.toFixed(1)) // vai achar o imc no html e substituir pelo valor
                        data = data.replace(`{peso}`, classificacao)
                        res.writeHead(200, { 'content-type': 'text/html;charset=utf-8' })
                        res.end(data);
                    }
                })
            } else {
                // obesidade grave (baleia)
                // res.writeHead(200, { 'Content-Type': 'text/plain; charset=utf-8' })
                // res.end("IMC - Obesidade grave")
                fs.readFile("index.html", 'utf-8', (err, data) => {
                    if (err) {
                        res.writeHead(500, { 'Content-Type': 'text/plain; charset=utf-8' });
                        res.end("500 - Erro no servidor")
                    } else {
                        data = data.replace(`{imc}`, imc.toFixed(1)) // vai achar o imc no html e substituir pelo valor
                        data = data.replace(`{peso}`, classificacao)
                        res.writeHead(200, { 'content-type': 'text/html;charset=utf-8' })
                        res.end(data);
                    }
                })
            }
        }
    }
    else {
        // caso não seja, chama o 404
        res.writeHead(200, { 'Content-Type': 'text/plain; charset=utf-8' });
        res.end("404 - Rota não encontrada ...")
    }
}
)

// configuração do server:
const port = 3000; // configura a porta

server.listen(port, () => { // inicia o listen e envia uma msg ao user pelo terminal
    console.log(`Servidor iniciado na porta: ${port} ...`)
})