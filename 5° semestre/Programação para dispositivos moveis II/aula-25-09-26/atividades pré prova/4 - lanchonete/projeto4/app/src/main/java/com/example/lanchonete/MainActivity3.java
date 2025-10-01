package com.example.lanchonete;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    private TextView textResult, textPedido;
    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        ArrayList<String> itensRecebidos = getIntent().getStringArrayListExtra("itens_selecionados");
        String nome = getIntent().getStringExtra("nome_cliente");

        textResult = findViewById(R.id.textResult);
        textPedido = findViewById(R.id.textPedido);
        btnVoltar = findViewById(R.id.btnVoltar);

        textResult.setText(nome + ", obrigado por comprar conosco.\nConfira seu pedido abaixo:");
        if (itensRecebidos != null && !itensRecebidos.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (String item : itensRecebidos) {
                sb.append("- ").append(item).append("\n\n");
            }
            textPedido.setText(sb.toString());
        } else {
            textPedido.setText("Nenhum item selecionado.");
        }

        btnVoltar.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });




    }
}