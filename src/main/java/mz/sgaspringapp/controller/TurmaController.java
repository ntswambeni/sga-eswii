package mz.sgaspringapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mz.sgaspringapp.model.Turma;
import mz.sgaspringapp.service.TurmaService;

@Controller
public class TurmaController {
	
	@Autowired
	TurmaService tSer;
	
	@RequestMapping(method = RequestMethod.GET, value = "/turma")
	public String cadastroTurma() {
		return "cadastro/turma";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/turma")
	public String adicionarTurma(Turma turma) {
		tSer.cadastraTurma(turma);
		
		return "cadastro/turma";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/turma/lista")
	public ModelAndView listaTurmas() {
		ModelAndView mv = new ModelAndView("cadastro/turma/lista");
		mv.addObject("lista", tSer.todasTurmas());
				
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/turma/{codigo}")
	public ModelAndView actualizarTurma(@PathVariable ("codigo") int codigo) {
		ModelAndView mv = new ModelAndView("cadastro/turma/actualiza");
		mv.addObject("turmas", tSer.encontraTurma(codigo));
				
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/turma/lista/apagar")
	public String apagarTurma(int codigo) {
		tSer.apagarTurma(codigo);
				
		return "redirect:/turma/lista";
	}
}
