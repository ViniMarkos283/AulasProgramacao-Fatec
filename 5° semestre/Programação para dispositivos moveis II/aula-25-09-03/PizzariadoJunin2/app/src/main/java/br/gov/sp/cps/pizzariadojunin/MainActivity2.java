package br.gov.sp.cps.pizzariadojunin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    Pedido pedido = new Pedido();
    private Button btnPedido;
    private RadioGroup radioGroupSabores;
    private RadioGroup radioGroupTamanhos;
    private RadioGroup radioGroupBordas;
    private CheckBox bebida, pastel, fritas, brotoDoce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        btnPedido = findViewById(R.id.btnPedido);
        radioGroupSabores = findViewById(R.id.radioGroupSabores);
        radioGroupTamanhos = findViewById(R.id.radioGroupTamanhos);
        radioGroupBordas = findViewById(R.id.radioGroupBordas);
        bebida = findViewById(R.id.checkExtraBebida);
        pastel = findViewById(R.id.checkExtraPastel);
        fritas = findViewById(R.id.checkExtraFritas);
        brotoDoce = findViewById(R.id.checkExtraBrotoDoce);

        btnPedido.setOnClickListener(view -> {
            pedido.extras = new ArrayList<>(List.of(
                    bebida.isChecked(),
                    pastel.isChecked(),
                    fritas.isChecked(),
                    brotoDoce.isChecked()
            ));

            Intent intent = new Intent(this, MainActivity3.class).putExtra("PEDIDO_DATA", pedido);
            startActivity(intent);
        });

        radioGroupSabores.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton radioButtonSabor = findViewById(checkedId);
            pedido.sabor = radioButtonSabor.getText().toString();
        });

        radioGroupTamanhos.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton radioButtonTamanho = findViewById(checkedId);
            pedido.tamanho = radioButtonTamanho.getText().toString();
        });

        radioGroupBordas.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton radioButtonBorda = findViewById(checkedId);
            pedido.borda = radioButtonBorda.getText().toString();
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
