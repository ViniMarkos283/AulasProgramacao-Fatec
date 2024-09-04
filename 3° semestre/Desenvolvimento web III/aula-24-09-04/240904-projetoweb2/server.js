// Importação
const app = require('./app');

// importação da configuração (variables.env)
require('dotenv').config({path:'variables.env'})

// configuração do servidor: 
app.set('port', process.env.PORT || 7777); // trouxe a variavel do env para cá
const server = app.listen(app.get('port'), () => {
    console.log("[OK] - Servidor PORT " + server.address().port);
});