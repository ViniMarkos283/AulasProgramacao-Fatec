package br.gov.sp.cps.numerossortidos;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // criação de tela
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main); // classe R é a recursos, e ela está chamando a activity main (a tela xml)
    }

    public void sortearNumero(View view){
            // vinculo do objeto desde view com o texto resultado
            TextView resultado = findViewById(R.id.textoResultado); // vincula com o id do resultado

            int i = 0;
            int[] res = new int[6];
            Random random = new Random();

            // sorteio de 5 números únicos de 1 a 60
            while (i < 6) {
                int num = random.nextInt(60) + 1; // Gera um número de 1 a 60
                // Verificar se o número já foi sorteado
                boolean exists = false;
                for (int j = 0; j < i; j++) {
                    if (res[j] == num) {
                        exists = true;
                        break;
                    }
                }
                // Se o número não existir no array, adicione
                if (!exists) {
                    res[i] = num;
                    i++;
                }
            }

            // mostrar o resultado
            String arrayAsString = Arrays.toString(res); // Converts the array to a string like "[1, 2, 3]"
            resultado.setText(arrayAsString);
        }


    public void limparNumero(View view){
        // vincula o objeto desde view com o texto resultado
        TextView resultado = findViewById(R.id.textoResultado);

        // retorna o resultado para o inicial
        resultado.setText("- - - - - -");

    }
}
