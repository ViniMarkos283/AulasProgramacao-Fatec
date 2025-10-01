package br.gov.sp.cps.registroclientes;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private Button btnValidar;
    private EditText textNome;
    private String nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        btnValidar = findViewById(R.id.btnValidar);
        textNome = findViewById(R.id.textNome);

        btnValidar.setOnClickListener(v -> {
            nome = textNome.getText().toString();
            if(!nome.isEmpty()) {
                Intent intent = new Intent(this, MainActivity3.class);
                intent.putExtra("nome_usuario", nome);
                startActivity(intent);
            }
        });

    }
}