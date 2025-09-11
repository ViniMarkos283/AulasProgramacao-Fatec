package br.gov.sp.cps.fatecdiadema.checkbox;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private CheckBox cbVerde, cbVermelho, cbAzul, cbAmarelo;
    private Button btnEnviar;
    private TextView textResultado;
    private RadioButton rbOpcao1, rbOpcao2, rbOpcao3;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        cbAmarelo = findViewById(R.id.cbAmarelo);
        cbVermelho = findViewById(R.id.cbVermelho);
        cbAzul = findViewById(R.id.cbAzul);
        cbVerde = findViewById(R.id.cbVerde);
        btnEnviar = findViewById(R.id.btnEnviar);
        textResultado = findViewById(R.id.textResultado);
        rbOpcao1 = findViewById(R.id.rbOpcao1);
        rbOpcao2 = findViewById(R.id.rbOpcao2);
        rbOpcao3 = findViewById(R.id.rbOpcao3);

        radioButton();

        /*btnEnviar.setOnClickListener(view -> {
            String texto = "";
            if(cbVermelho.isChecked()){ texto = texto + "Vermelho";}
            if(cbAmarelo.isChecked()){ texto = texto + "Amarelo";}
            if(cbVerde.isChecked()){ texto = texto + "Verde";}
            if(cbAzul.isChecked()){ texto = texto + "Azul";}

            textResultado.setText(texto);
        });*/

        btnEnviar.setOnClickListener(view -> {

        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    private void radioButton() {
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(@NonNull RadioGroup radioGroup, int i){
                if(i == R.id.rbOpcao1) {
                    textResultado.setText("selecionado Op 1");
                } else if(i == R.id.rbOpcao2){
                    textResultado.setText("selecionado Op 2");
                } else if(i == R.id.rbOpcao3){
                    textResultado.setText("selecionado Op 3");
                }
            }
        });
    }
}