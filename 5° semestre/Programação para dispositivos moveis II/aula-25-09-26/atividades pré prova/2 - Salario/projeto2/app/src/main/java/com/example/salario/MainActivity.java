package com.example.salario;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText textSalario;
    private RadioButton rb1, rb2, rb3;
    private Button btnResultado;
    private TextView textResultado;
    private double total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textSalario = findViewById(R.id.textSalario);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        btnResultado = findViewById(R.id.btnResultado);
        textResultado = findViewById(R.id.textResultado);

        btnResultado.setOnClickListener(v -> {
            String salarioStr = textSalario.getText().toString();

            if (salarioStr.isEmpty()) {
                textResultado.setText("Digite o salário!");
                return;
            }

            double salario = Double.parseDouble(salarioStr);

            if (rb1.isChecked()) {
                total = salario * 1.4; // 40% de aumento
            } else if (rb2.isChecked()) {
                total = salario * 1.45; // 45% de aumento
            } else if (rb3.isChecked()) {
                total = salario * 1.5; // 50% de aumento
            }

            textResultado.setText("R$ " + String.format("%.2f", total));
        });
    }
}
