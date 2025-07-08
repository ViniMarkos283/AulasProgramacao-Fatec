import psycopg2
from psycopg2 import OperationalError
from dotenv import load_dotenv
import os
import time

# Carrega variáveis do .env
load_dotenv()

DB_HOST = os.getenv("DB_HOST")
DB_NAME = os.getenv("DB_NAME")
DB_USER = os.getenv("DB_USER")
DB_PASSWORD = os.getenv("DB_PASSWORD")
DB_PORT = os.getenv("DB_PORT")


def conectar():
    return psycopg2.connect(
        host=DB_HOST,
        dbname=DB_NAME,
        user=DB_USER,
        password=DB_PASSWORD,
        port=DB_PORT,
        sslmode='require'  # importante para Render
    )


def verificar_banco():
    print("🔎 Verificando se o banco está acordado...")
    try:
        conexao = conectar()
        cursor = conexao.cursor()
        cursor.execute("SELECT 1;")
        resultado = cursor.fetchone()
        print("✅ Banco está acordado! Resultado:", resultado)
        cursor.close()
        conexao.close()
        return True
    except OperationalError as erro:
        print("⚠️ Banco parece estar dormindo ou inacessível.")
        return False


def acordar_banco(max_tentativas=5):
    tentativas = 0
    while tentativas < max_tentativas:
        tentativas += 1
        print(f"⏳ Tentando acordar o banco... (tentativa {tentativas})")
        try:
            conexao = conectar()
            cursor = conexao.cursor()
            cursor.execute("SELECT 1;")
            resultado = cursor.fetchone()
            print("✅ Banco acordado com sucesso. Resultado:", resultado)
            cursor.close()
            conexao.close()
            return True
        except OperationalError as erro:
            print("❌ Ainda não foi possível conectar. Esperando 5 segundos...")
            time.sleep(5)

    print("🚫 Não foi possível acordar o banco após várias tentativas.")
    return False


# Execução principal
if verificar_banco():
    print("🔁 Banco já está ativo, pronto para uso.")
else:
    acordar_banco()
