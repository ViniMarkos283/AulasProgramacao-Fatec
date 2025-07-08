require('dotenv').config();
const { Client } = require('pg');

async function testarConexao() {
  const client = new Client({
    host: process.env.DB_HOST,
    database: process.env.DB_NAME,
    user: process.env.DB_USER,
    password: process.env.DB_PASSWORD,
    port: process.env.DB_PORT,
    ssl: {
      rejectUnauthorized: false  // importante para Render
    }
  });
  
  try {
    await client.connect();
    console.log('✅ Conexão bem-sucedida!');
    const res = await client.query('SELECT 1;');
    console.log('Resultado do teste:', res.rows);
  } catch (err) {
    console.error('❌ Erro ao conectar ao banco:', err);
  } finally {
    await client.end();
  }
}

testarConexao();
