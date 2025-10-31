package br.gov.sp.cps.alertdialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnAlertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnAlertDialog = findViewById(R.id.btnAlertDialog);
    }

    public void abrirDialog(View view){
        // instanciamento do alertDialog:
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        // configuração titulo e da mesnagem:
        dialog.setTitle("FATEC ALERT DIALOG");
        dialog.setMessage("Mensagem do alertDialog aqui");
        dialog.setIcon(android.R.drawable.ic_dialog_info);

        // configuração ações SIM e NÂO e NÂO SEI:
        dialog.setPositiveButton("sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Usuario clicou em SIM", Toast.LENGTH_SHORT).show();
            }
        });
        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Usuario clicou em NÂO", Toast.LENGTH_SHORT).show();
            }
        });
        dialog.setNeutralButton("não sei", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Usuario clicou em NÃO SEI", Toast.LENGTH_SHORT).show();
            }
        });

        // Criar e Exibir o AlertDialog:
        dialog.setCancelable(false); // torna obrigatório escolher um, n deixa fugir
        dialog.create();
        dialog.show();
    }
}