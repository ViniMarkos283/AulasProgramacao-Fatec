import psycopg2
from psycopg2 import OperationalError
from dotenv import load_dotenv
import os

# Carrega variáveis do arquivo .env
load_dotenv()

DB_HOST = os.getenv("DB_HOST")
DB_NAME = os.getenv("DB_NAME")
DB_USER = os.getenv("DB_USER")
DB_PASSWORD = os.getenv("DB_PASSWORD")
DB_PORT = os.getenv("DB_PORT")

def criar_tabelas():
    comandos = [
        """
        CREATE TABLE IF NOT EXISTS clientes (
            id SERIAL PRIMARY KEY,
            nome VARCHAR(100),
            email VARCHAR(100) UNIQUE,
            senha VARCHAR(100),
            telefone VARCHAR(20),
            data_nascimento DATE
        );
        """,
        """
        CREATE TABLE IF NOT EXISTS treinos (
            id SERIAL PRIMARY KEY,
            cliente_id INTEGER REFERENCES clientes(id),
            nome_treino VARCHAR(100),
            descricao TEXT,
            data_inicio DATE
        );
        """,
        """
        CREATE TABLE IF NOT EXISTS aulas (
            id SERIAL PRIMARY KEY,
            nome VARCHAR(100),
            professor VARCHAR(100),
            horario TIME
        );
        """,
        """
        CREATE TABLE IF NOT EXISTS agendamentos (
            id SERIAL PRIMARY KEY,
            cliente_id INTEGER REFERENCES clientes(id),
            aula_id INTEGER REFERENCES aulas(id),
            data DATE
        );
        """,
        """
        CREATE TABLE IF NOT EXISTS pagamentos (
            id SERIAL PRIMARY KEY,
            cliente_id INTEGER REFERENCES clientes(id),
            data_pagamento DATE,
            valor NUMERIC(10, 2),
            status VARCHAR(50)
        );
        """
    ]

    try:
        conexao = psycopg2.connect(
            host=DB_HOST,
            dbname=DB_NAME,
            user=DB_USER,
            password=DB_PASSWORD,
            port=DB_PORT
        )
        cursor = conexao.cursor()
        for comando in comandos:
            cursor.execute(comando)
        conexao.commit()
        print("✅ Tabelas criadas com sucesso!")
        cursor.close()
        conexao.close()
    except OperationalError as erro:
        print("❌ Erro ao conectar ao banco:")
        print(erro)
    except Exception as erro:
        print("❌ Erro ao criar tabelas:")
        print(erro)

criar_tabelas()
