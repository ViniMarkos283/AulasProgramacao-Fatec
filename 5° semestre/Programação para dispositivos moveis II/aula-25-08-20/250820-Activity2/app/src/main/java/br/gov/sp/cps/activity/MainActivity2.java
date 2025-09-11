package br.gov.sp.cps.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private Button btnFrente_t2;
    private Button btnVolta_t2;
    private TextView resultado_t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("ciclo de vida", "Tela 2 - onCreate");

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        // vincular o botão com a view
        btnFrente_t2 = findViewById(R.id.btnFrente_t2);
        btnVolta_t2 = findViewById(R.id.btnVolta_t2);
        resultado_t2 = findViewById(R.id.Resultado_t2);

        // Recebendo os dados:
        Bundle bundle = getIntent().getExtras();

        String nome = bundle.getString("nome");
        String nacionalidde = bundle.getString("nacionalidade");
        int idade = bundle.getInt("idade");
        double altura = bundle.getDouble("altura");

        // organização dos resultados
        String resultado = "Nome: " + nome + "\n" +
                "Nacionalidade: " + nacionalidde + "\n" +
                "Idade: " + idade + "\n" +
                "Altura: " + altura + "\n";

        btnFrente_t2.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity3.class);

            // Adicionando valores:
            String nome1 = "João da Silva";

            // Adicionar parametros para ser enviado:
            intent.putExtra("Idade", 65);
            intent.putExtra("altura", 1.75);
            intent.putExtra("nacionalidade", "Brasileiro");
            intent.putExtra("nome", nome1);

            startActivity(intent);
        });

        // retorna uma view destruindo a ultima acessada
        btnVolta_t2.setOnClickListener(view -> {
            finish();
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("ciclo de vida", "Tela 2 - onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("ciclo de vida", "Tela 2 - onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("ciclo de vida", "Tela 2 - onPause");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("ciclo de vida", "Tela 2 - onDestroy");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("ciclo de vida", "Tela 2 - onStop");
    }
}