package com.example.lanchonete;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private Button btnCompletar;
    private CheckBox cb1, cb2, cb3, cb4, cb5, cb6;
    private EditText textName;
    private String nome;
    private ArrayList<String> itens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        btnCompletar = findViewById(R.id.btnCompletar);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);
        cb6 = findViewById(R.id.cb6);
        textName = findViewById(R.id.textNome);

        btnCompletar.setOnClickListener(v -> {
            itens.clear();
            if(cb1.isChecked()) itens.add(cb1.getText().toString());
            if(cb2.isChecked()) itens.add(cb2.getText().toString());
            if(cb3.isChecked()) itens.add(cb3.getText().toString());
            if(cb4.isChecked()) itens.add(cb4.getText().toString());
            if(cb5.isChecked()) itens.add(cb5.getText().toString());
            if(cb6.isChecked()) itens.add(cb6.getText().toString());


            nome = textName.getText().toString();

            Intent intent = new Intent(this, MainActivity3.class);
            intent.putStringArrayListExtra("itens_selecionados",itens);
            intent.putExtra("nome_cliente", nome);
            startActivity(intent);
        });


    }
}