package br.gov.sp.cps.pizzariapagamento;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private CheckBox cb1, cb2, cb3, cb4, cb5;
    private Button btn1;
    ArrayList<String> sabores = new ArrayList<>();
    private double[] precoSabores = {36.90, 38.90, 34.90, 42.90, 41.90};
    private double parcialPreco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);
        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(v -> {
            sabores.clear();
            parcialPreco = 0;
            if (cb1.isChecked()) {
                sabores.add(cb1.getText().toString());
                parcialPreco += precoSabores[0];
            }
            if (cb2.isChecked()) {
                sabores.add(cb2.getText().toString());
                parcialPreco += precoSabores[1];
            }
            if (cb3.isChecked()) {
                sabores.add(cb3.getText().toString());
                parcialPreco += precoSabores[2];
            }
            if (cb4.isChecked()) {
                sabores.add(cb4.getText().toString());
                parcialPreco += precoSabores[3];
            }
            if (cb5.isChecked()) {
                sabores.add(cb5.getText().toString());
                parcialPreco += precoSabores[4];
            }

            Intent intent = new Intent(this, MainActivity2.class);
            intent.putStringArrayListExtra("sabores", sabores);
            intent.putExtra("precoParcial", parcialPreco);
            startActivity(intent);
        });

    }
}