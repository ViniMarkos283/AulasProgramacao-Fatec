package br.gov.sp.cps.vestibularalunos;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import java.util.List;

import br.gov.sp.cps.vestibularalunos.model.Aluno;
import br.gov.sp.cps.vestibularalunos.model.AlunoRepository;

public class MainActivity4 extends AppCompatActivity {

    private TextInputEditText textConsul;
    private Button btnCheck, btnReturn3;
    private TextView textResultCons;
    private List<Aluno> listaAlunos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        textConsul = findViewById(R.id.textConsul);
        btnCheck = findViewById(R.id.btnCheck);
        btnReturn3 = findViewById(R.id.btnReturn3);
        textResultCons = findViewById(R.id.textResultCons);

        // Pega a lista do repositório
        listaAlunos = AlunoRepository.getListaAlunos();

        btnCheck.setOnClickListener(v -> {
            String cpfConsulta = textConsul.getText().toString().trim();
            boolean encontrado = false;

            for (Aluno aluno : listaAlunos) {
                if (aluno.getCpf().equals(cpfConsulta)) {
                    String situacao = aluno.getNota() >= 7.0 ? "Aprovado" : "Não aprovado";
                    textResultCons.setText(
                            "Nome: " + aluno.getNome() + "\n" +
                                    "Curso: " + aluno.getCurso() + "\n" +
                                    "Situação: " + situacao
                    );
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                textResultCons.setText("Aluno não encontrado!");
            }
        });

        btnReturn3.setOnClickListener(v -> finish());
    }
}
