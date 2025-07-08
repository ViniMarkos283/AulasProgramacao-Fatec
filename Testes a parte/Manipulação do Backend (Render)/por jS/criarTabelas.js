require('dotenv').config();
const { Client } = require('pg');

async function criarTabelas() {
  const client = new Client({
    host: process.env.DB_HOST,
    database: process.env.DB_NAME,
    user: process.env.DB_USER,
    password: process.env.DB_PASSWORD,
    port: process.env.DB_PORT
  });

  const comandos = [
    `CREATE TABLE IF NOT EXISTS clientes (
      id SERIAL PRIMARY KEY,
      nome VARCHAR(100),
      email VARCHAR(100) UNIQUE,
      senha VARCHAR(100),
      telefone VARCHAR(20),
      data_nascimento DATE
    );`,
    `CREATE TABLE IF NOT EXISTS treinos (
      id SERIAL PRIMARY KEY,
      cliente_id INTEGER REFERENCES clientes(id),
      nome_treino VARCHAR(100),
      descricao TEXT,
      data_inicio DATE
    );`,
    `CREATE TABLE IF NOT EXISTS aulas (
      id SERIAL PRIMARY KEY,
      nome VARCHAR(100),
      professor VARCHAR(100),
      horario TIME
    );`,
    `CREATE TABLE IF NOT EXISTS agendamentos (
      id SERIAL PRIMARY KEY,
      cliente_id INTEGER REFERENCES clientes(id),
      aula_id INTEGER REFERENCES aulas(id),
      data DATE
    );`,
    `CREATE TABLE IF NOT EXISTS pagamentos (
      id SERIAL PRIMARY KEY,
      cliente_id INTEGER REFERENCES clientes(id),
      data_pagamento DATE,
      valor NUMERIC(10,2),
      status VARCHAR(50)
    );`
  ];

  try {
    await client.connect();
    for (const sql of comandos) {
      await client.query(sql);
    }
    console.log('✅ Tabelas criadas com sucesso!');
  } catch (err) {
    console.error('❌ Erro ao criar tabelas:', err);
  } finally {
    await client.end();
  }
}

criarTabelas();
