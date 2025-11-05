package br.gov.sp.cps.bancodados;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    // constantes que representam os dados do BD e da Tabela:
    public static final String DATABASE_NAME = "dados.db";
    public static final String TABLE_NAME = "pessoas";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "NOME";
    public static final String COL_3 = "IDADE";

    // Construtor da classe que chama o construtor da Superclasse
    // passando o contexto: o nome e a versão do DB:
    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, 1);
    }

    // metodo que chama automaticamente ao criar o DB e cria as colunas
    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, NOME TEXT, IDADE INTEGER)");
    }
    // metodo chamado quando o DB é atualizado para uma nova versão
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    // metodo para Gravar:
    public boolean inserirDados(String nome, int idade){
        // obter o DB no modo escrito:
        SQLiteDatabase db = this.getWritableDatabase();
        // armazena valores para serem inseridos
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, nome);
        contentValues.put(COL_3, idade);
        // inserir os dados e armazena o resultado na tabela:
        long resultado = db.insert(TABLE_NAME, null, contentValues);
        // fechar o DB:
        db.close();
        // retorna o true se a inserção foi bem sucedida:
        return resultado != -1;
    }

    // metodo para Consultar:
    public Cursor obterIdadePorNome(String nome){
        // obter o Db no modo leitura
        SQLiteDatabase db = this.getReadableDatabase();
        // especificar a coluna IDADE para retorno
        String[] colums = {COL_3};
        // define a codição de seleção (filtra por Nome):
        String selection = COL_2 + " = ?";
        // argumento da condição:
        String[] selectionArgs = {nome};
        // execução da consulta no DB:
        return db.query(TABLE_NAME,colums,selection,selectionArgs,null,null,null);
    }

    // metodo para atualizar a idade de uma pessoa pelo nome
    // retorna true se a atualizacao for bem sucedida
    public boolean atualizarDados(String nome, int novaIdade){
        // obtem o Db em modo de escrita:
        SQLiteDatabase db = this.getWritableDatabase();
        // armazena o novo valor para a oluna IDADE:
        ContentValues valores = new ContentValues();
        valores.put(COL_3, novaIdade);
        // Atualiza a tabela com a nova idade:
        int linhasAfetadas = db.update(TABLE_NAME, valores, COL_2 + " = ?", new String[]{nome});
        // fecha o DB
        db.close();
        // retorna true se pelo menos uma linha foi afetada
        return linhasAfetadas > 0;
    }

    // metodo DELETAR um registro da tabela pelo nome
    // retorna true se a deleção foi bem sucedida:
    public boolean deletaDados(String nome){
        SQLiteDatabase db = this.getWritableDatabase();
        // deleta o registro pelo nome:
        int linhasAfetadas = db.delete(TABLE_NAME, COL_2 + " = ?", new String[]{nome});
        // fecha o DB
        db.close();
        return linhasAfetadas > 0;
    }
}
