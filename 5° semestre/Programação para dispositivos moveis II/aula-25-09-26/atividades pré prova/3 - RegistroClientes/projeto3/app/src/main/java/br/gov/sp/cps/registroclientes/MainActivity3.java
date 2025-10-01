package br.gov.sp.cps.registroclientes;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    private Button btnVoltar;
    private TextView textRetorno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        btnVoltar = findViewById(R.id.btnVoltar);

        String nome = getIntent().getStringExtra("nome_usuario");

        textRetorno = findViewById(R.id.textRetorno);
        textRetorno.setText("Bem-vindo, " + nome + "!");

        btnVoltar.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

    }
}