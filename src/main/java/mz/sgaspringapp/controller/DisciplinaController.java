package mz.sgaspringapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mz.sgaspringapp.model.Disciplina;
import mz.sgaspringapp.service.DisciplinaService;

@Controller
public class DisciplinaController {
	
	@Autowired
	private DisciplinaService dSer;
	
		@RequestMapping(method = RequestMethod.GET, value = "/disciplina")
		public String cadastroDisciplina() {		
				
			return "cadastro/disciplina";
		}
			
		@RequestMapping(method = RequestMethod.POST, value = "/disciplina")
		public String cadastrarDisciplina(Disciplina disc) {
				
			dSer.cadastraDisciplina(disc);
				
			return "cadastro/disciplina";
		}
		
		@RequestMapping(method = RequestMethod.GET, value = "/disciplina/lista")
		public ModelAndView listaDisciplinas() {
			ModelAndView mv = new ModelAndView("cadastro/disciplina/lista");
			mv.addObject("lista", dSer.todasDisciplinas());
			
			return mv;
		}
		
		@RequestMapping(method = RequestMethod.GET, value = "disciplina/{codigo}")
		public ModelAndView actualizarDisciplina(@PathVariable ("codigo") int codigo) {
			ModelAndView mv = new ModelAndView("cadastro/disciplina/actualiza");
			mv.addObject("disciplinas", dSer.encontraDisciplina(codigo));
			
			return mv;
		}
		
		@RequestMapping("/disciplina/lista/apagar")
		public String apagarDisciplina(int codigo) {
			dSer.apagaDisciplina(codigo);
			
			return "redirect:/disciplina/lista";
		}
}
