package br.gov.sp.cps.bancodados;

import android.os.Bundle;
// Importação necessária para AlertDialog
import android.app.AlertDialog;
import android.content.DialogInterface;
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

    // Constantes para identificar as operações
    private static final int OPERACAO_GRAVAR = 1;
    private static final int OPERACAO_ATUALIZAR = 2;
    private static final int OPERACAO_DELETAR = 3;

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

            mostrarDialogoConfirmacao(OPERACAO_GRAVAR, "Confirma se deseja gravar o usuário " + nome + "?");
        });

        // metodo CONSULTAR:
        btnConsultar.setOnClickListener(v -> {
            // entrada de dados:
            String nome = textNome.getText().toString();

            // Valido o dado nome:
            if(nome.isEmpty()){
                Toast.makeText(MainActivity.this, "Digite um nome para consultar", Toast.LENGTH_SHORT).show();
                return;
            }

            Cursor cursor = dbHelper.obterIdadePorNome(nome);
            if(cursor!=null && cursor.moveToFirst()){
                // O cursor deve ser fechado após o uso. Supondo que 'obterIdadePorNome' retorna apenas a idade.
                String idade = cursor.getString(0);
                textResultado.setText("Idade: " + idade);
                cursor.close();
            }else{
                textResultado.setText(""); // Limpa o resultado se não for encontrado
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
                Toast.makeText(MainActivity.this, "Preencha o nome e a nova idade para atualizar", Toast.LENGTH_SHORT).show();
                return;
            }

            mostrarDialogoConfirmacao(OPERACAO_ATUALIZAR, "As informações do usuário " + nome + " serão reescritas e as anteriores perdidas. Deseja continuar?");
        });

        // metodo DELETAR:
        btnDeletar.setOnClickListener(v -> {
            // entrada de dados:
            String nome = textNome.getText().toString();

            // validação dos dados:
            if(nome.isEmpty()){
                Toast.makeText(MainActivity.this, "Digite o nome para deletar", Toast.LENGTH_SHORT).show();
                return;
            }

            mostrarDialogoConfirmacao(OPERACAO_DELETAR, "Tem certeza que deseja DELETAR o usuário " + nome + "?");
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // --- NOVO MÉTODO PARA MOSTRAR O DIÁLOGO DE CONFIRMAÇÃO ---
    private void mostrarDialogoConfirmacao(final int operacao, String mensagem) {
        new AlertDialog.Builder(this)
                .setTitle("Confirmação")
                .setMessage(mensagem)
                .setPositiveButton("OK", (dialog, which) -> {
                    // Ação a ser executada se o usuário clicar em OK
                    executarOperacao(operacao);
                })
                .setNegativeButton("Cancelar", (dialog, which) -> {
                    // Ação a ser executada se o usuário clicar em Cancelar
                    Toast.makeText(MainActivity.this, "Operação cancelada.", Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                })
                .setIcon(android.R.drawable.ic_dialog_alert) // Ícone de alerta
                .show();
    }

    // --- NOVO MÉTODO PARA EXECUTAR A LÓGICA DE DADOS APÓS A CONFIRMAÇÃO ---
    private void executarOperacao(int operacao) {
        String nome = textNome.getText().toString();
        String idadeStr = textIdade.getText().toString();

        switch (operacao) {
            case OPERACAO_GRAVAR:
                // Lógica de Gravar
                try{
                    // Converte Idade de String para Numerica(int):
                    int numIdade = Integer.parseInt(idadeStr);
                    // chama o DB e o metodo InserirDados:
                    if(dbHelper.inserirDados(nome, numIdade)){
                        // caso a gravação seja realizada com sucesso
                        Toast.makeText(MainActivity.this, "Dados Inseridos com Sucesso.", Toast.LENGTH_SHORT).show();
                    }else{
                        // caso a gravação não foi concluida:
                        Toast.makeText(MainActivity.this, "Erro ao inserir Dados. (Talvez o usuário já exista)", Toast.LENGTH_LONG).show();
                    }
                }catch(NumberFormatException e){
                    Toast.makeText(MainActivity.this, "Idade inválida. Operação cancelada.", Toast.LENGTH_LONG).show();
                }
                break;

            case OPERACAO_ATUALIZAR:
                // Lógica de Atualizar
                try {
                    int numIdade = Integer.parseInt(idadeStr);
                    if(dbHelper.atualizarDados(nome, numIdade)){
                        Toast.makeText(MainActivity.this, "Dados Atualizados com sucesso!", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(MainActivity.this, "Nome não encontrado para atualizar.", Toast.LENGTH_SHORT).show();
                    }
                }catch (NumberFormatException e){
                    Toast.makeText(MainActivity.this, "Idade inválida. Operação cancelada.", Toast.LENGTH_SHORT).show();
                }
                break;

            case OPERACAO_DELETAR:
                // Lógica de Deletar
                if(dbHelper.deletaDados(nome)){
                    Toast.makeText(MainActivity.this, "Usuário " + nome + " deletado com sucesso!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Nome não encontrado para deletar.", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}