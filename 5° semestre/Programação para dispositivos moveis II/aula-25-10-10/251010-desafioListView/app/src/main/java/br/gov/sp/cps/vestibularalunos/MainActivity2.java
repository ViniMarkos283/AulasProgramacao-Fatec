package br.gov.sp.cps.vestibularalunos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.gov.sp.cps.vestibularalunos.adapter.Adapter;
import br.gov.sp.cps.vestibularalunos.model.Aluno;

public class MainActivity2 extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Aluno> listaAlunos = new ArrayList<>();
    private TextView textFilter;
    private Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        String filter = getIntent().getStringExtra("filtro");

        recyclerView = findViewById(R.id.recycleView);
        textFilter = findViewById(R.id.textFilter);
        textFilter.setText(filter);
        btnReturn= findViewById(R.id.btnReturn);

        btnReturn.setOnClickListener(v -> {
            finish();
        });

        criarAlunos();

        List<Aluno> listaFiltrada;

        switch (filter.toLowerCase()) {
            case "aprovados":
                listaFiltrada = filtrarAprovados();
                break;
            case "lista de espera":
                listaFiltrada = filtrarListaDeEspera();
                break;
            case "todos":
            default:
                listaFiltrada = listaAlunos; // Sem filtro, mostra todos
                break;
        }

        // Ordenar a lista filtrada por nome em ordem alfabética
        Collections.sort(listaFiltrada, new Comparator<Aluno>() {
            @Override
            public int compare(Aluno a1, Aluno a2) {
                return a1.getNome().compareToIgnoreCase(a2.getNome());
            }
        });

        Adapter adapter = new Adapter(listaFiltrada);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }

    private List<Aluno> filtrarAprovados() {
        List<Aluno> aprovados = new ArrayList<>();
        for (Aluno aluno : listaAlunos) {
            if (aluno.getNota() >= 7.0) {
                aprovados.add(aluno);
            }
        }
        return aprovados;
    }

    private List<Aluno> filtrarListaDeEspera() {
        List<Aluno> espera = new ArrayList<>();
        for (Aluno aluno : listaAlunos) {
            if (aluno.getNota() < 7.0) {
                espera.add(aluno);
            }
        }
        return espera;
    }

    public void criarAlunos(){
        Aluno aluno;

        aluno = new Aluno("Ana Clara", 9.5);
        listaAlunos.add(aluno);

        aluno = new Aluno("João Pedro", 7.0);
        listaAlunos.add(aluno);

        aluno = new Aluno("Maria Alexandra", 8.25);
        listaAlunos.add(aluno);

        aluno = new Aluno("Lucas Gabriel", 5.5);
        listaAlunos.add(aluno);

        aluno = new Aluno("Isabella Vitoria", 10.0);
        listaAlunos.add(aluno);

        aluno = new Aluno("Guilherme Augusto", 6.75);
        listaAlunos.add(aluno);

        aluno = new Aluno("Sofia Helena", 9.0);
        listaAlunos.add(aluno);

        aluno = new Aluno("Matheus Henrique", 4.5);
        listaAlunos.add(aluno);

        aluno = new Aluno("Laura Beatriz", 7.8);
        listaAlunos.add(aluno);

        aluno = new Aluno("Felipe Xavier", 6.0);
        listaAlunos.add(aluno);

        aluno = new Aluno("Camila Ferreira", 8.5);
        listaAlunos.add(aluno);

        aluno = new Aluno("Daniel Pereira", 5.2);
        listaAlunos.add(aluno);

        aluno = new Aluno("Mariana Luiza", 9.8);
        listaAlunos.add(aluno);

        aluno = new Aluno("Rafael Mendes", 3.75);
        listaAlunos.add(aluno);

        aluno = new Aluno("Alice Ferreira", 7.5);
        listaAlunos.add(aluno);

        aluno = new Aluno("Bruno Costa", 6.5);
        listaAlunos.add(aluno);

        aluno = new Aluno("Larissa Oliveira", 8.9);
        listaAlunos.add(aluno);

        aluno = new Aluno("Eduardo Silva", 4.9);
        listaAlunos.add(aluno);

        aluno = new Aluno("Gabriela Souza", 9.2);
        listaAlunos.add(aluno);

        aluno = new Aluno("Thiago Martins", 5.8);
        listaAlunos.add(aluno);

        aluno = new Aluno("Vitória Santos", 7.3);
        listaAlunos.add(aluno);

        aluno = new Aluno("Pedro Rocha", 6.1);
        listaAlunos.add(aluno);

        aluno = new Aluno("Julia Almeida", 8.0);
        listaAlunos.add(aluno);

        aluno = new Aluno("Gustavo Reis", 4.25);
        listaAlunos.add(aluno);

        aluno = new Aluno("Manuela Lima", 9.7);
        listaAlunos.add(aluno);

        aluno = new Aluno("Leonardo Barros", 5.6);
        listaAlunos.add(aluno);

        aluno = new Aluno("Beatriz Carvalho", 8.4);
        listaAlunos.add(aluno);

        aluno = new Aluno("André Gomes", 3.5);
        listaAlunos.add(aluno);

        aluno = new Aluno("Natália Ribeiro", 7.9);
        listaAlunos.add(aluno);

        aluno = new Aluno("Caio Freitas", 6.8);
        listaAlunos.add(aluno);

        aluno = new Aluno("Patrícia Neves", 9.1);
        listaAlunos.add(aluno);

        aluno = new Aluno("Marcelo Dantas", 4.0);
        listaAlunos.add(aluno);

        aluno = new Aluno("Carolina Pires", 7.25);
        listaAlunos.add(aluno);

        aluno = new Aluno("Victor Queiroz", 5.9);
        listaAlunos.add(aluno);

        aluno = new Aluno("Érica Fernandes", 8.6);
        listaAlunos.add(aluno);

        aluno = new Aluno("Diego Sales", 5.0);
        listaAlunos.add(aluno);

        aluno = new Aluno("Elisa Morais", 9.4);
        listaAlunos.add(aluno);

        aluno = new Aluno("Ricardo Castro", 3.0);
        listaAlunos.add(aluno);

        aluno = new Aluno("Lorena Teixeira", 7.6);
        listaAlunos.add(aluno);

        aluno = new Aluno("Paulo Junior", 6.3);
        listaAlunos.add(aluno);

        aluno = new Aluno("Letícia Vieira", 8.75);
        listaAlunos.add(aluno);

        aluno = new Aluno("Alexandre Borges", 5.4);
        listaAlunos.add(aluno);

        aluno = new Aluno("Fernanda Conceição", 9.3);
        listaAlunos.add(aluno);

        aluno = new Aluno("Hugo Vasconcelos", 4.8);
        listaAlunos.add(aluno);

        aluno = new Aluno("Raquel Menezes", 7.1);
        listaAlunos.add(aluno);

        aluno = new Aluno("Samuel Andrade", 6.6);
        listaAlunos.add(aluno);

        aluno = new Aluno("Vivian Dias", 8.3);
        listaAlunos.add(aluno);

        aluno = new Aluno("Benício Correia", 3.9);
        listaAlunos.add(aluno);

        aluno = new Aluno("Cecília Duarte", 9.6);
        listaAlunos.add(aluno);

        aluno = new Aluno("Davi Nogueira", 5.75);
        listaAlunos.add(aluno);

        aluno = new Aluno("Heloísa Monte", 8.1);
        listaAlunos.add(aluno);

        aluno = new Aluno("Igor Zamboni", 4.6);
        listaAlunos.add(aluno);

        aluno = new Aluno("Jennifer Lacerda", 7.4);
        listaAlunos.add(aluno);

        aluno = new Aluno("Kevin Noronha", 6.2);
        listaAlunos.add(aluno);

        aluno = new Aluno("Lívia Peixoto", 8.8);
        listaAlunos.add(aluno);

        aluno = new Aluno("Miguel Zacarias", 3.25);
        listaAlunos.add(aluno);

        aluno = new Aluno("Nicole Costa", 9.9);
        listaAlunos.add(aluno);

        aluno = new Aluno("Otávio Farias", 5.1);
        listaAlunos.add(aluno);

        aluno = new Aluno("Priscila Guedes", 7.75);
        listaAlunos.add(aluno);

        aluno = new Aluno("Quentin Hofman", 6.4);
        listaAlunos.add(aluno);

        aluno = new Aluno("Renata Iglesias", 8.95);
        listaAlunos.add(aluno);

        aluno = new Aluno("Sérgio Kaled", 4.1);
        listaAlunos.add(aluno);

        aluno = new Aluno("Tainá Lemos", 9.05);
        listaAlunos.add(aluno);

        aluno = new Aluno("Ulisses Mattos", 5.3);
        listaAlunos.add(aluno);

        aluno = new Aluno("Vanessa Nunez", 7.0);
        listaAlunos.add(aluno);

        aluno = new Aluno("William Osório", 6.9);
        listaAlunos.add(aluno);

        aluno = new Aluno("Ximena Paiva", 8.7);
        listaAlunos.add(aluno);

        aluno = new Aluno("Yago Quintela", 4.75);
        listaAlunos.add(aluno);

        aluno = new Aluno("Zara Rodrigues", 9.15);
        listaAlunos.add(aluno);

        aluno = new Aluno("Jonas Silva", 7.45);
        listaAlunos.add(aluno);
    }
}
