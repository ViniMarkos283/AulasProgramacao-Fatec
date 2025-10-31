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
import br.gov.sp.cps.vestibularalunos.model.AlunoRepository;

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
        listaAlunos = AlunoRepository.getListaAlunos();

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

    public void criarAlunos() {
        Aluno aluno;

        aluno = new Aluno("Ana Clara", 9.5, "123.456.789-00", "Engenharia de Software");
        listaAlunos.add(aluno);

        aluno = new Aluno("João Pedro", 7.0, "987.654.321-00", "Administração");
        listaAlunos.add(aluno);

        aluno = new Aluno("Maria Alexandra", 8.25, "111.222.333-44", "Ciência da Computação");
        listaAlunos.add(aluno);

        aluno = new Aluno("Lucas Gabriel", 5.5, "555.666.777-88", "Engenharia Elétrica");
        listaAlunos.add(aluno);

        aluno = new Aluno("Isabella Vitoria", 10.0, "999.888.777-66", "Design Gráfico");
        listaAlunos.add(aluno);

        aluno = new Aluno("Guilherme Augusto", 6.75, "222.333.444-55", "Engenharia Mecânica");
        listaAlunos.add(aluno);

        aluno = new Aluno("Sofia Helena", 9.0, "333.222.111-00", "Psicologia");
        listaAlunos.add(aluno);

        aluno = new Aluno("Matheus Henrique", 4.5, "444.555.666-77", "Economia");
        listaAlunos.add(aluno);

        aluno = new Aluno("Laura Beatriz", 7.8, "777.888.999-11", "Arquitetura");
        listaAlunos.add(aluno);

        aluno = new Aluno("Felipe Xavier", 6.0, "888.777.666-22", "Engenharia Civil");
        listaAlunos.add(aluno);

        aluno = new Aluno("Camila Ferreira", 8.5, "101.202.303-40", "Biomedicina");
        listaAlunos.add(aluno);

        aluno = new Aluno("Daniel Pereira", 5.2, "404.505.606-70", "Sistemas de Informação");
        listaAlunos.add(aluno);

        aluno = new Aluno("Mariana Luiza", 9.8, "707.808.909-10", "Ciência de Dados");
        listaAlunos.add(aluno);

        aluno = new Aluno("Rafael Mendes", 3.75, "909.808.707-11", "Gestão Financeira");
        listaAlunos.add(aluno);

        aluno = new Aluno("Alice Ferreira", 7.5, "121.212.121-21", "Publicidade e Propaganda");
        listaAlunos.add(aluno);

        aluno = new Aluno("Bruno Costa", 6.5, "343.434.343-43", "Logística");
        listaAlunos.add(aluno);

        aluno = new Aluno("Larissa Oliveira", 8.9, "565.656.565-65", "Enfermagem");
        listaAlunos.add(aluno);

        aluno = new Aluno("Eduardo Silva", 4.9, "676.767.676-76", "Engenharia Ambiental");
        listaAlunos.add(aluno);

        aluno = new Aluno("Gabriela Souza", 9.2, "787.878.787-87", "Medicina Veterinária");
        listaAlunos.add(aluno);

        aluno = new Aluno("Thiago Martins", 5.8, "898.989.898-98", "Ciências Contábeis");
        listaAlunos.add(aluno);

        aluno = new Aluno("Vitória Santos", 7.3, "909.909.909-09", "Engenharia de Produção");
        listaAlunos.add(aluno);

        aluno = new Aluno("Pedro Rocha", 6.1, "010.101.010-10", "Educação Física");
        listaAlunos.add(aluno);

        aluno = new Aluno("Julia Almeida", 8.0, "020.202.020-20", "Nutrição");
        listaAlunos.add(aluno);

        aluno = new Aluno("Gustavo Reis", 4.25, "030.303.030-30", "Física");
        listaAlunos.add(aluno);

        aluno = new Aluno("Manuela Lima", 9.7, "040.404.040-40", "Matemática");
        listaAlunos.add(aluno);

        aluno = new Aluno("Leonardo Barros", 5.6, "050.505.050-50", "Ciência Política");
        listaAlunos.add(aluno);

        aluno = new Aluno("Beatriz Carvalho", 8.4, "060.606.060-60", "Direito");
        listaAlunos.add(aluno);

        aluno = new Aluno("André Gomes", 3.5, "070.707.070-70", "Filosofia");
        listaAlunos.add(aluno);

        aluno = new Aluno("Natália Ribeiro", 7.9, "080.808.080-80", "Letras");
        listaAlunos.add(aluno);

        aluno = new Aluno("Caio Freitas", 6.8, "090.909.090-90", "História");
        listaAlunos.add(aluno);

        aluno = new Aluno("Patrícia Neves", 9.1, "101.101.101-10", "Engenharia Química");
        listaAlunos.add(aluno);

        aluno = new Aluno("Marcelo Dantas", 4.0, "202.202.202-20", "Análise e Desenvolvimento de Sistemas");
        listaAlunos.add(aluno);

        aluno = new Aluno("Carolina Pires", 7.25, "303.303.303-30", "Moda");
        listaAlunos.add(aluno);

        aluno = new Aluno("Victor Queiroz", 5.9, "404.404.404-40", "Administração Pública");
        listaAlunos.add(aluno);

        aluno = new Aluno("Érica Fernandes", 8.6, "505.505.505-50", "Publicidade Digital");
        listaAlunos.add(aluno);

        aluno = new Aluno("Diego Sales", 5.0, "606.606.606-60", "Engenharia de Computação");
        listaAlunos.add(aluno);

        aluno = new Aluno("Elisa Morais", 9.4, "707.707.707-70", "Relações Internacionais");
        listaAlunos.add(aluno);

        aluno = new Aluno("Ricardo Castro", 3.0, "808.808.808-80", "Sociologia");
        listaAlunos.add(aluno);

        aluno = new Aluno("Lorena Teixeira", 7.6, "909.909.909-00", "Turismo");
        listaAlunos.add(aluno);

        aluno = new Aluno("Paulo Junior", 6.3, "111.111.111-11", "Geografia");
        listaAlunos.add(aluno);

        aluno = new Aluno("Letícia Vieira", 8.75, "222.222.222-22", "Arquitetura de Interiores");
        listaAlunos.add(aluno);

        aluno = new Aluno("Alexandre Borges", 5.4, "333.333.333-33", "Ciências Biológicas");
        listaAlunos.add(aluno);

        aluno = new Aluno("Fernanda Conceição", 9.3, "444.444.444-44", "Enfermagem");
        listaAlunos.add(aluno);

        aluno = new Aluno("Hugo Vasconcelos", 4.8, "555.555.555-55", "Gestão de TI");
        listaAlunos.add(aluno);

        aluno = new Aluno("Raquel Menezes", 7.1, "666.666.666-66", "Farmácia");
        listaAlunos.add(aluno);

        aluno = new Aluno("Samuel Andrade", 6.6, "777.777.777-77", "Engenharia Mecatrônica");
        listaAlunos.add(aluno);

        aluno = new Aluno("Vivian Dias", 8.3, "888.888.888-88", "Pedagogia");
        listaAlunos.add(aluno);

        aluno = new Aluno("Benício Correia", 3.9, "999.999.999-99", "Ciências Atuariais");
        listaAlunos.add(aluno);

        aluno = new Aluno("Cecília Duarte", 9.6, "112.233.445-56", "Engenharia Biomédica");
        listaAlunos.add(aluno);

        aluno = new Aluno("Davi Nogueira", 5.75, "223.344.556-67", "Ciência da Computação");
        listaAlunos.add(aluno);

        aluno = new Aluno("Heloísa Monte", 8.1, "334.455.667-78", "Psicologia");
        listaAlunos.add(aluno);

        aluno = new Aluno("Igor Zamboni", 4.6, "445.566.778-89", "Engenharia Civil");
        listaAlunos.add(aluno);

        aluno = new Aluno("Jennifer Lacerda", 7.4, "556.677.889-90", "Publicidade e Propaganda");
        listaAlunos.add(aluno);

        aluno = new Aluno("Kevin Noronha", 6.2, "667.788.990-01", "Design de Produto");
        listaAlunos.add(aluno);

        aluno = new Aluno("Lívia Peixoto", 8.8, "778.899.001-12", "Medicina");
        listaAlunos.add(aluno);

        aluno = new Aluno("Miguel Zacarias", 3.25, "889.900.112-23", "Física");
        listaAlunos.add(aluno);

        aluno = new Aluno("Nicole Costa", 9.9, "990.011.223-34", "Engenharia Aeroespacial");
        listaAlunos.add(aluno);

        aluno = new Aluno("Otávio Farias", 5.1, "111.222.333-45", "História");
        listaAlunos.add(aluno);

        aluno = new Aluno("Priscila Guedes", 7.75, "222.333.444-56", "Matemática");
        listaAlunos.add(aluno);

        aluno = new Aluno("Quentin Hofman", 6.4, "333.444.555-67", "Engenharia de Software");
        listaAlunos.add(aluno);

        aluno = new Aluno("Renata Iglesias", 8.95, "444.555.666-78", "Ciência de Dados");
        listaAlunos.add(aluno);

        aluno = new Aluno("Sérgio Kaled", 4.1, "555.666.777-89", "Filosofia");
        listaAlunos.add(aluno);

        aluno = new Aluno("Tainá Lemos", 9.05, "666.777.888-90", "Moda");
        listaAlunos.add(aluno);

        aluno = new Aluno("Ulisses Mattos", 5.3, "777.888.999-01", "Sistemas de Informação");
        listaAlunos.add(aluno);

        aluno = new Aluno("Vanessa Nunez", 7.0, "888.999.000-12", "Design Digital");
        listaAlunos.add(aluno);

        aluno = new Aluno("William Osório", 6.9, "999.000.111-23", "Administração");
        listaAlunos.add(aluno);

        aluno = new Aluno("Ximena Paiva", 8.7, "123.321.456-54", "Engenharia Ambiental");
        listaAlunos.add(aluno);

        aluno = new Aluno("Yago Quintela", 4.75, "321.123.654-76", "Engenharia Mecânica");
        listaAlunos.add(aluno);

        aluno = new Aluno("Zara Rodrigues", 9.15, "456.654.789-98", "Ciência da Computação");
        listaAlunos.add(aluno);

        aluno = new Aluno("Jonas Silva", 7.45, "654.456.987-00", "Engenharia de Software");
        listaAlunos.add(aluno);
    }

}
