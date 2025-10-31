package br.gov.sp.cps.vestibularalunos.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.gov.sp.cps.vestibularalunos.R;
import br.gov.sp.cps.vestibularalunos.model.Aluno;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Aluno> listaAlunos;

    public Adapter(List<Aluno> lista){
        this.listaAlunos = lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_layout, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position){
        Aluno aluno = listaAlunos.get(position);
        holder.nome.setText(aluno.getNome());
        holder.curso.setText(aluno.getCurso()); // 👈 novo campo
        holder.nota.setText(String.valueOf(aluno.getNota()));
    }

    @Override
    public int getItemCount(){
        return listaAlunos.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView nome, nota, curso;

        public MyViewHolder(View itemView){
            super(itemView);

            nome = itemView.findViewById(R.id.textNome);
            curso = itemView.findViewById(R.id.textCurso);
            nota = itemView.findViewById(R.id.textNota);
        }

    }

}
