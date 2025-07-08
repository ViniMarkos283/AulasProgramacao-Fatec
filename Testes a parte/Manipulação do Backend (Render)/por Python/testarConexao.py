import psycopg2
from psycopg2 import OperationalError
from dotenv import load_dotenv
import os

# Carrega variáveis do arquivo .env
load_dotenv()

# Lê os valores das variáveis de ambiente
DB_HOST = os.getenv("DB_HOST")
DB_NAME = os.getenv("DB_NAME")
DB_USER = os.getenv("DB_USER")
DB_PASSWORD = os.getenv("DB_PASSWORD")
DB_PORT = os.getenv("DB_PORT")

def testar_conexao():
    try:
        conexao = psycopg2.connect(
            host=DB_HOST,
            dbname=DB_NAME,
            user=DB_USER,
            password=DB_PASSWORD,
            port=DB_PORT
        )
        print("✅ Conexão bem-sucedida!")
        cursor = conexao.cursor()
        cursor.execute("SELECT 1;")
        resultado = cursor.fetchone()
        print("Resultado do teste:", resultado)
        cursor.close()
        conexao.close()
    except OperationalError as erro:
        print("❌ Erro ao conectar ao banco:")
        print(erro)

testar_conexao()
