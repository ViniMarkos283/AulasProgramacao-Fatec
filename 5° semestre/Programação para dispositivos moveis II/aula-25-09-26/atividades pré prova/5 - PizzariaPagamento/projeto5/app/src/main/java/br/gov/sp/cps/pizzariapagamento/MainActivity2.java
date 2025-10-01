package br.gov.sp.cps.pizzariapagamento;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private RadioButton rb1, rb2, rb3, rb4, rb5, rb6;
    private Button btn2;
    private double[] adicionalTamanho = {0, 1.00, 2.50};
    private String pagment, pizzaSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        ArrayList<String> sabores = intent.getStringArrayListExtra("sabores");
        double precoParcial = intent.getDoubleExtra("precoParcial", 0.0);

        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);
        rb5 = findViewById(R.id.rb5);
        rb6 = findViewById(R.id.rb6);
        btn2 = findViewById(R.id.btn2);

        btn2.setOnClickListener(v -> {
            double precoTotal = 0;
            if(rb1.isChecked()){
                pizzaSize = rb1.getText().toString();
            }
            if(rb2.isChecked()){
                precoTotal += adicionalTamanho[1];
                pizzaSize = rb2.getText().toString();
            }
            if(rb3.isChecked()){
                precoTotal += adicionalTamanho[2];
                pizzaSize = rb3.getText().toString();
            }

            if(rb4.isChecked()){
                pagment = rb4.getText().toString();
            }
            if(rb5.isChecked()){
                pagment = rb5.getText().toString();
            }
            if(rb6.isChecked()){
                pagment = rb6.getText().toString();
            }

            precoTotal += precoParcial;

            Intent intent2 = new Intent(this, MainActivity3.class);
            intent2.putStringArrayListExtra("sabores", sabores);
            intent2.putExtra("precoTotal", precoTotal);
            intent2.putExtra("pagamento", pagment);
            intent2.putExtra("tamanho", pizzaSize);
            startActivity(intent2);
        });
    }
}