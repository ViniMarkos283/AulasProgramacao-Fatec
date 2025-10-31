package br.gov.sp.cps.vestibularalunos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.List;

import br.gov.sp.cps.vestibularalunos.model.Aluno;
import br.gov.sp.cps.vestibularalunos.model.AlunoRepository;

public class MainActivity3 extends AppCompatActivity {

    Button btnFinishCad, btnReturn;
    TextInputEditText addNome, addCpf, addCurso, addNota;
    private List<Aluno> listaAlunos = new ArrayList<>();
    String nome, cpf, curso;
    double nota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        btnFinishCad = findViewById(R.id.btnFinishCad);
        btnReturn = findViewById(R.id.btnReturn2);
        addNome = findViewById(R.id.addNome);
        addCpf = findViewById(R.id.addCpf);
        addCurso = findViewById(R.id.addCurso);
        addNota = findViewById(R.id.addNota);

        btnReturn.setOnClickListener(v -> {
            finish();
        });

        btnFinishCad.setOnClickListener(v -> {
            nome = addNome.getText().toString();
            cpf = addCpf.getText().toString();
            curso = addCurso.getText().toString();
            nota = Double.parseDouble(addNota.getText().toString());

            Aluno aluno = new Aluno(nome, nota, cpf, curso);
            AlunoRepository.adicionarAluno(aluno);
            Toast.makeText(this, "Aluno cadastrado com sucesso!", Toast.LENGTH_SHORT).show();
        });
    }
}