package br.gov.sp.fatec.ProjetoSpring03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ProjectSpring03Application {

	@Autowired // puxa o que tiver na marcação em outro arquivo, instancia
	@Qualifier("appTexto") // vincula o nome com a tag
	private String nomeAplicacao;

	public static void main(String[] args) {
		SpringApplication.run(ProjectSpring03Application.class, args);
	}

	@GetMapping("/")
	public String index() {
		return nomeAplicacao;
	}
}

