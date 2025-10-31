package br.gov.sp.cps.vestibularalunos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2, btn3, btnCad, btnConsul;
    private String filter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btnCad = findViewById(R.id.btnCad);
        btnConsul = findViewById(R.id.btnConsul);

        btn1.setOnClickListener(v -> {
            nextPage(1);
        });
        btn2.setOnClickListener(v -> {
            nextPage(2);
        });
        btn3.setOnClickListener(v -> {
            nextPage(3);
        });
        btnCad.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity3.class);
            startActivity(intent);
        });
        btnConsul.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity4.class);
            startActivity(intent);
        });
    }

    public void nextPage(int btn){
        if(btn == 1){
            filter = btn1.getText().toString();
        }if(btn == 2){
            filter = btn2.getText().toString();
        }if(btn == 3){
            filter = btn3.getText().toString();
        }
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("filtro", filter);
        startActivity(intent);
    }
}