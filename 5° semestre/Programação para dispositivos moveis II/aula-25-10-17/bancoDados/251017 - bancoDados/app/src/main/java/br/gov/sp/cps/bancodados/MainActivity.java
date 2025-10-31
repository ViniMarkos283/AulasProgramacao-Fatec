package br.gov.sp.cps.bancodados;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import android.database.Cursor;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    TextView textResultado;
    TextInputEditText textNome, textIdade;
    Button btnGravar, btnConsultar, btnAtualizar, btnDeletar;
    DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        dbHelper = new DatabaseHelper(this);

        textNome = findViewById(R.id.textNome);
        textIdade = findViewById(R.id.textIdade);
        textResultado = findViewById(R.id.textResultado);
        btnGravar = findViewById(R.id.btnGravar);
        btnConsultar = findViewById(R.id.btnConsultar);
        btnAtualizar = findViewById(R.id.btnAtualizar);
        btnDeletar = findViewById(R.id.btnDeletar);

        // Metodo GRAVAR:
        btnGravar.setOnClickListener(v -> {
            // entrada de dados:
            String nome = textNome.getText().toString();
            String idade = textIdade.getText().toString();

            // Validar os dados:
            if(nome.isEmpty() || idade.isEmpty()){
                Toast.makeText(MainActivity.this, "Preencha todos os dados", Toast.LENGTH_LONG).show();
                return;
            }

            // Caso seja Validado (Apresenta nome e idade corretamente):
            try{
                // Converte Idade de String para Numerica(int):
                int numIdade = Integer.parseInt(idade);
                // chama o DB e o metodo InserirDados:
                if(dbHelper.inserirDados(nome, numIdade)){
                    // caso a gravação seja realizada com sucesso
                    Toast.makeText(MainActivity.this, "Dados Inseridos com Sucesso.", Toast.LENGTH_SHORT).show();
                }else{
                    //  caso a gravação não foi concluida:
                    Toast.makeText(MainActivity.this, "Erro ao inserir Dados.", Toast.LENGTH_LONG).show();
                }
            }catch(NumberFormatException e){
                Toast.makeText(MainActivity.this, "Idade inválida.", Toast.LENGTH_LONG).show();
            }
        });

        // metodo CONSULTAR:
        btnConsultar.setOnClickListener(v -> {
            // entrada de dados:
            String nome = textNome.getText().toString();

            // Valido o dado nome:
            if(nome.isEmpty()){
                Toast.makeText(MainActivity.this, "Digite um nome válido", Toast.LENGTH_SHORT).show();
                return;
            }

            Cursor cursor = dbHelper.obterIdadePorNome(nome);
            if(cursor!=null && cursor.moveToFirst()){
                String idade = cursor.getString(0);
                textResultado.setText("Idade: " + idade);
            }else{
                Toast.makeText(MainActivity.this, "Nome não encontrado", Toast.LENGTH_SHORT).show();
            }
        });

        // Metodo ATUALIZAR:
        btnAtualizar.setOnClickListener(v -> {
            // entrada de dados:
            String nome = textNome.getText().toString();
            String idade = textIdade.getText().toString();

            // validar os dados:
            if(nome.isEmpty() || idade.isEmpty()){
                Toast.makeText(MainActivity.this, "Preencha todos os dados", Toast.LENGTH_SHORT).show();
                return;
            }

            try {
                int numIdade = Integer.parseInt(idade);
                if(dbHelper.atualizarDados(nome, numIdade)){
                    Toast.makeText(MainActivity.this, "Dados Atualizados com sucesso!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "nome não encontrado.", Toast.LENGTH_SHORT).show();
                }
            }catch (NumberFormatException e){
                Toast.makeText(MainActivity.this, "Idade inválida.", Toast.LENGTH_SHORT).show();
            }
        });

        // metodo DELETAR:
        btnDeletar.setOnClickListener(v -> {
            // entrada de dados:
            String nome = textNome.getText().toString();

            // validação dos dados:
            if(nome.isEmpty()){
                Toast.makeText(MainActivity.this, "Digite seu nome", Toast.LENGTH_SHORT).show();
                return;
            }

            if(dbHelper.deletaDados(nome)){
                Toast.makeText(MainActivity.this, "Dados deletados com sucesso!", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(MainActivity.this, "Nome não encontrado.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}