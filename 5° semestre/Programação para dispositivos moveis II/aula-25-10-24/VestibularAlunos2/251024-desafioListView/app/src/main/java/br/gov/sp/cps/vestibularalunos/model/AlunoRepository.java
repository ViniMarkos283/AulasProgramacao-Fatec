package br.gov.sp.cps.vestibularalunos.model;

import java.util.ArrayList;
import java.util.List;

public class AlunoRepository {
    private static final List<Aluno> listaAlunos = new ArrayList<>();

    public static List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public static void adicionarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
    }
}
