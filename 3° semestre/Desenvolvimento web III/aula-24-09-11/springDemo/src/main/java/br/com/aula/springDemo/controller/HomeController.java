package br.com.aula.spirngdemo.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/")

public class HomeController {

    @GetMapping("/")
    public String index(@PathVariable String nome, ModelMap model){
        return "index";
    }

    @GetMapping("/saudacao/{nome}")
    public String saudacao(@PathVariable String nome, ModelMap model){
        model.addAttribute("nome", nome);
        return "saudacao"; // retorna o nome da pagina q ele vai retornar
    }

    @GetMapping("/media/{np1}/{np2}")
    public String calculaMedia(@PathVariable String np1, @PathVariable String np2, ModelMap model){
        model.addAttribute("np1", np1);
        model.addAttribute("np2", np2);

        double numNp1 = Double.parseDouble(np1);
        double numNp2 = Double.parseDouble(np2);

        double numMedia = (numNp1 + numNp2)/2;

        String valorMedia = String.format("%.2f", numMedia);
        DecimalFormat df = new DecimalFormat("#.##");
        valorMedia = df.format(numMedia);

        model.addAttribute("valorMedia", valorMedia);
        return "media";
    }
}