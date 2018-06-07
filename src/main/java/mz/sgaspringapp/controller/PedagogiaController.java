package mz.sgaspringapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PedagogiaController {
    
@RequestMapping( value = "/Pedagogico")
	public String cadastroClasse() {
		return "cadastro/Pedagogico";
	}
}
