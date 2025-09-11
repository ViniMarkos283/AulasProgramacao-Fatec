package br.gov.sp.cps.seekbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBarFelicidade;
    private TextView textResultado;
    private ImageView imgReaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        seekBarFelicidade = findViewById(R.id.seekBarFelicidade);
        textResultado = findViewById(R.id.textResultado);
        imgReaction = findViewById(R.id.imgReaction);

        seekBarFelicidade.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textResultado.setText("✨ felicidade: " + i + " / " + seekBarFelicidade.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                textResultado.setText("▶\uFE0F vamos começar...");

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                textResultado.setText("✨ Sua felicidade: " + seekBarFelicidade.getProgress() +
                        "\n\uD83C\uDFAD reação: " + felicidadeCharger(seekBarFelicidade.getProgress()) +
                        "\n\uD83D\uDCCC Confirmar esse valor?");

                int img = imageCharger(seekBarFelicidade.getProgress());
                imgReaction.setImageResource(img);
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void registrarDados(View view){
        textResultado.setText("✅ Felicidade Registrada: \nStatus: " + felicidadeCharger(seekBarFelicidade.getProgress()));
    }

    public String felicidadeCharger(int val){
        String[] reactions = {
                "Muito triste",
                "Devastado",
                "Triste",
                "Abatido",
                "Insatisfeito",
                "Indiferente",
                "Razoavelmente Satisfeito",
                "Contente",
                "feliz",
                "Muito Feliz",
                "Extremamente Feliz"};

        return  reactions[val];
    }

    public int imageCharger(int val){
        int[] icons = {
                R.drawable.sup_triste, // 1
                R.drawable.devastado, // 2
                R.drawable.triste, // 3
                R.drawable.abatido, // 4
                R.drawable.insatisfeito, // 5
                R.drawable.indiferente, // 6
                R.drawable.razo_satisfeito, // 7
                R.drawable.contente, // 8
                R.drawable.feliz, // 9
                R.drawable.sup_feliz, // 10
                R.drawable.extra_feliz, // 11
        };
        return  icons[val];
    }
}