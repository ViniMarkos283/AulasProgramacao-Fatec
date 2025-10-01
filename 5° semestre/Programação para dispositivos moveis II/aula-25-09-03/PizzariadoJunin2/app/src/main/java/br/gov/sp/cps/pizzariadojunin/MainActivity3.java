package br.gov.sp.cps.pizzariadojunin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import br.gov.sp.cps.pizzariadojunin.MainActivity;

public class MainActivity3 extends AppCompatActivity {
    private double Total = 0.0;
    private Button btnConclusao;
    private TextView textPedidoSabor;
    private TextView textPedidoTamanho;
    private TextView textPedidoBorda;
    private TextView textPedidoExtras;
    private TextView textPedidoPreco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        Intent _intent = getIntent();
        Pedido pedido = (Pedido) _intent.getSerializableExtra("PEDIDO_DATA");

        textPedidoSabor = findViewById(R.id.textPedidoSabor);
        textPedidoTamanho = findViewById(R.id.textPedidoTamanho);
        textPedidoBorda = findViewById(R.id.textPedidoBorda);
        textPedidoExtras = findViewById(R.id.textPedidoExtras);
        textPedidoPreco = findViewById(R.id.textPedidoTotal);
        btnConclusao = findViewById(R.id.btnConclusao);

        textPedidoSabor.setText(pedido.sabor);
        textPedidoTamanho.setText(pedido.tamanho);
        textPedidoBorda.setText(pedido.borda);

        switch (pedido.sabor) {
            case "Mussarela": Total += 30.00; break;
            case "Calabresa": Total += 35.00; break;
            case "Frango com Catupiry": Total += 40.00; break;
        }

        switch (pedido.tamanho) {
            case "Grande": Total += 10.00; break;
            case "Medio": Total += 6.50; break;
            case "Pequeno": Total += 3.00; break;
        }

        switch (pedido.borda) {
            case "Tradicional": Total += 0.00; break;
            case "Catupiry": Total += 2.50; break;
            case "Chocolate": Total += 5.00; break;
        }

        String extras = "";
        if (pedido.extras.get(0)) {
            extras += "Bebida\n";
            Total += 8.99;
        }
        if (pedido.extras.get(1)) {
            extras += "Pastel\n";
            Total += 10.00;
        }
        if (pedido.extras.get(2)) {
            extras += "Fritas\n";
            Total += 10.00;
        }
        if (pedido.extras.get(3)) {
            extras += "Broto Doce\n";
            Total += 25.00;
        }

        textPedidoExtras.setText(extras.trim());
        textPedidoPreco.setText("Total a pagar: R$ " + String.format("%.2f", Total));

        btnConclusao.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
