package br.gov.sp.fatec.ProjetoSpring03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {

    @Bean(name = "appTexto") // funciona como uma exportação, tem como nomear
    public String appName(){
        return "mucho texto";
    }
}
