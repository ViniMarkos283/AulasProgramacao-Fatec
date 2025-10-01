package br.gov.sp.cps.pizzariapagamento;

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

    private TextView textResultado, textTotal;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();
        ArrayList<String> sabores = intent.getStringArrayListExtra("sabores");
        double precoTotal = intent.getDoubleExtra("precoTotal", 0.0);
        String pagment = intent.getStringExtra("pagamento");
        String pizzaSize = intent.getStringExtra("tamanho");


        textResultado = findViewById(R.id.textResultado);
        textTotal = findViewById(R.id.textTotal);
        btn3 = findViewById(R.id.btn3);

        if (sabores != null && !sabores.isEmpty()) {
            StringBuilder listaSabores = new StringBuilder();
            for (String sabor : sabores) {
                listaSabores.append("- ").append(sabor).append("\n");
            }
            textResultado.setText("Sabores selecionados:\n" + listaSabores.toString() + "\nTamanho: " + pizzaSize);

        } else {
            textResultado.setText("Nenhum sabor selecionado.");
        }
        textTotal.setText(String.format("Preço total: R$ %.2f", precoTotal));

        btn3.setOnClickListener(v -> {
            Intent intent2 = new Intent(this, MainActivity.class);
            startActivity(intent2);
        });


    }
}