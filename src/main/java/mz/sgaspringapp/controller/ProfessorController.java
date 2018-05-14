package mz.sgaspringapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mz.sgaspringapp.model.Professor;
import mz.sgaspringapp.service.ProfessorService;

@Controller
public class ProfessorController {
	
	@Autowired
	ProfessorService pSer;
	
	@RequestMapping("/professor")
	public String cadastroProfessor() {
		return "cadastro/professor";
	}
	
	@RequestMapping(method = RequestMethod.POST, value ="/professor")
	public String cadastrarProfessor(Professor professor) {
		pSer.cadastraProfessor(professor);
		
		return "redirect:/professor";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/professor/lista")
	public ModelAndView listaProfessores() {
		ModelAndView mv = new ModelAndView("cadastro/professor/lista");
		mv.addObject("lista", pSer.todosProfessores());
		
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "professor/{codigo}")
	public ModelAndView actualizarProfessor(@PathVariable ("codigo") int codigo) {
		ModelAndView mv = new ModelAndView("cadastro/professor/actualiza");
		mv.addObject("professores", pSer.encontraProfessor(codigo));
		
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "professor/detalhes/{codigo}")
	public ModelAndView detalhesProfessor(@PathVariable ("codigo") int codigo) {
		ModelAndView mv = new ModelAndView("cadastro/professor/detalhes");
		mv.addObject("lista", pSer.encontraProfessor(codigo));
		
		return mv;
	}
	
	@RequestMapping("/professor/lista/apagar")
	public String apagarProfessor(int codigo) {
		pSer.apagaProfessor(codigo);
		
		return "redirect:/professor/lista";
	}
}
