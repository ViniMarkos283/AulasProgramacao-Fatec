package br.gov.sp.cps.comprascheckbox;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private CheckBox cb1, cb2, cb3, cb4, cb5;
    private Button btnTotal;
    private TextView textTotal;
    private double[] prices = {2.69, 2.70, 16.70, 3.38, 3.00};
    private double total;

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
        btnTotal = findViewById(R.id.btnTotal);
        textTotal = findViewById(R.id.textTotal);

        btnTotal.setOnClickListener(v -> {
            total = 0.00;
            if(cb1.isChecked()){
            total += prices[0];
        }
            if(cb2.isChecked()){
                total += prices[1];
            }
            if(cb3.isChecked()){
                total += prices[2];
            }
            if(cb4.isChecked()){
                total += prices[3];
            }
            if(cb5.isChecked()){
                total += prices[4];
            }
            textTotal.setText(String.format("R$ %.2f", total));
        });
    }
}