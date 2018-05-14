package mz.sgaspringapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mz.sgaspringapp.model.Classe;
import mz.sgaspringapp.model.Turma;
import mz.sgaspringapp.repository.ClasseRepository;
import mz.sgaspringapp.service.ClasseService;
import mz.sgaspringapp.service.TurmaService;

@Controller
public class ClasseController {
	
	@Autowired
	ClasseService cSer;
	

	@Autowired
	ClasseRepository cr;
	
	@Autowired
	TurmaService tSer;
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/classe")
	public String cadastroClasse() {
		return "cadastro/classe";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/classe")
	public String cadastrarClasse(Classe classe) {
		
		cSer.cadastraClasse(classe);
		
		return "cadastro/classe";
	}
	
	@RequestMapping("/classe/lista")
	public ModelAndView listaClasses() {
		ModelAndView mv = new ModelAndView ("cadastro/classe/lista");
		
		mv.addObject("lista", cSer.todasClasses());
		
		return mv;
	}
	
	@RequestMapping("/classe/{codigo}")
	public ModelAndView actualizarClasse(@PathVariable ("codigo") int codigo) {
		ModelAndView mv = new ModelAndView ("cadastro/classe/actualiza");
				
		mv.addObject("classes",cSer.encontraClasse(codigo));
		
		return mv;
	}
	
	@RequestMapping("/classe/lista/apagar")
	public String apagarClasse(int codigo) {
		cSer.apagaClasse(codigo);
		
		return "redirect:/classe/lista";
	}
	
	@RequestMapping("/classe/{codigoClasse}/turma")
	public String adicionarTurmaForm(@PathVariable ("codigoClasse") int codigo) {
		return "cadastro/turma";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/classe/{codigoClasse}/turma")
	public String adicionarTurma(@PathVariable ("codigoClasse") int codigoClasse, Turma turma) {
		Classe classe = cr.findByCodigo(codigoClasse);
		classe.getTurma().add(turma);
		tSer.cadastraTurma(turma);
		cSer.cadastraClasse(classe);
		
		
		return "cadastro/turma";
	}
}
