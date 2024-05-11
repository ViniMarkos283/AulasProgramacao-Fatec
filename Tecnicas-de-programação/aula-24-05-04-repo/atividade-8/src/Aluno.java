// esta é a classe Aluno
public class Aluno {
    private String nome;
    private double n1, n2, n3;

public Aluno(){
    
}

    public void recebeNome(String nome){        
        this.nome = nome;
    }
    public void recebeNota1(double nota1){        
        this.n1 = nota1;
    }
    public void recebeNota2(double nota2){        
        this.n2 = nota2;
    }
    public void recebeNota3(double nota3){        
        this.n3 = nota3;
    }

    public double soma(){
        return n1+n2+n3;
    }

    public void retornaValores(){
        String resultado;
        if(soma() < 60){
            resultado = "REPROVADO \nFaltaram " + (60 - soma()) + " pontos";
        }else{
            resultado = "APROVADO";
        }

        System.out.println("Nota Final: " + soma() + "\n"+ resultado);
    }
}
