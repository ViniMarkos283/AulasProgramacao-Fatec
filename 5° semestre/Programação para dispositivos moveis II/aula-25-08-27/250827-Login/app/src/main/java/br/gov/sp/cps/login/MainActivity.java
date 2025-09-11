package br.gov.sp.cps.login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText textSenha;
    private EditText textUsuario;
    private Button bntEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textSenha = findViewById(R.id.textSenha);
        textUsuario = findViewById(R.id.textUsuario);
        bntEntrar = findViewById(R.id.btnEntrar);

        bntEntrar.setOnClickListener(view -> {
            String usuarioInput = textUsuario.getText().toString();
            String senhaInput = textSenha.getText().toString();

            if(usuarioInput.equals("admin") && senhaInput.equals("admin")){
                Intent intent = new Intent(this, MainActivity2.class);
                startActivity(intent);
            }else{
                Intent intent = new Intent(this, MainActivity3.class);
                startActivity(intent);
            }
        });






        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}