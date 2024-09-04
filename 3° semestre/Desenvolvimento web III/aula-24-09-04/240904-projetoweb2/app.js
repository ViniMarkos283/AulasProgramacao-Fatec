// importação:
const express = require('express');
const router = require('./index');

// configuração geral do projeto
const app = express();
app.use('/', router);

// exportação:
module.exports = app;