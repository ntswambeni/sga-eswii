package mz.sgaspringapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecretariaController {
	
	@RequestMapping("/secretaria")
	public String cadastroSecretaria() {
		return "cadastro/secretaria";
	}
}
