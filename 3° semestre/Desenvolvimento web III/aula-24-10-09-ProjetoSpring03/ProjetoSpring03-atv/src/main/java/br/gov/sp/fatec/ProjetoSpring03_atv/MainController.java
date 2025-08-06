package br.gov.sp.fatec.ProjetoSpring03_atv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

    @Autowired
    @Qualifier("imc")
    private double imc;

    @Autowired
    @Qualifier("aval")
    private String aval;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/imc/{p}/{a}")
    public String imc(@PathVariable double p, @PathVariable double a, Model model){
        double total = imc;
        String classif = aval;
        model.addAttribute("classif", classif);
        model.addAttribute("total", total);

        return "index";
    }
}
