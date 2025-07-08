require('dotenv').config();
const { Client } = require('pg');

const MAX_TENTATIVAS = 5;
const INTERVALO = 5000; // 5 segundos

function getDbClient() {
  return new Client({
    host: process.env.DB_HOST,
    database: process.env.DB_NAME,
    user: process.env.DB_USER,
    password: process.env.DB_PASSWORD,
    port: process.env.DB_PORT,
    ssl: { rejectUnauthorized: false } // obrigatório para Render
  });
}

async function tentarConexao() {
  const client = getDbClient();
  try {
    await client.connect();
    const result = await client.query('SELECT 1;');
    console.log('✅ Banco acordado! Resultado:', result.rows);
    await client.end();
    return true;
  } catch (error) {
    console.log('⚠️  Erro ao tentar conexão:', error.message);
    return false;
  }
}

async function acordarBanco() {
  console.log('🔎 Verificando o status do banco PostgreSQL...');
  for (let tentativa = 1; tentativa <= MAX_TENTATIVAS; tentativa++) {
    console.log(`⏳ Tentativa ${tentativa}/${MAX_TENTATIVAS}...`);
    const sucesso = await tentarConexao();

    if (sucesso) {
      console.log('✅ Conexão estabelecida com sucesso!');
      return;
    }

    if (tentativa < MAX_TENTATIVAS) {
      console.log(`🕐 Aguardando ${INTERVALO / 1000} segundos para tentar novamente...`);
      await new Promise(resolve => setTimeout(resolve, INTERVALO));
    }
  }

  console.log('🚫 Não foi possível acordar o banco após várias tentativas.');
}

acordarBanco();
