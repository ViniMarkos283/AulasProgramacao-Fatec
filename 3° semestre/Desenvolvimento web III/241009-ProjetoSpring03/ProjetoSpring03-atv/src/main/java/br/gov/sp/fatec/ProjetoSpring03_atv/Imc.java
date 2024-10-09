package br.gov.sp.fatec.ProjetoSpring03_atv;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Imc {

    @Bean(name = "aval")
    public String calcularPeso(Double alt, Double peso){
        String classif;
        double total = calculo(alt, peso);
        if(total < 16.9){
            classif = "SUper abaixo do peso";

        }else if (total <= 18.4){
            classif = "Abaixo do peso";

        }
        else if (total <= 24.9) {
            classif = "Peso normal";

        }
        else if (total <= 29.9){
            classif = "Acima do peso";

        }
        else if (total <= 34.9){
            classif = "Obesidade grau I";

        }
        else if (total <= 40){
            classif = "Obesidade grau II";

        }
        else{
            classif = "Obesidade grau III";
        }
        return classif;
    }

    @bean(name = "imc")
    public Double calculo(double p, double a){
        Double total = p / (a * a);

        return total;
    }
}
