package mz.sgaspringapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mz.sgaspringapp.model.Disciplina;
import mz.sgaspringapp.repository.DisciplinaRepository;

@Service
public class DisciplinaService {

	@Autowired
	private DisciplinaRepository dR;
	
	//Cadastro de Disciplina
		public void cadastraDisciplina(Disciplina disc) {
			dR.save(disc);
		}
		
		public List <Disciplina> todasDisciplinas(){
			List <Disciplina> lista = new ArrayList <>();
			dR.findAll().forEach(lista::add);
			
			return lista;
		}
		
		public List <Disciplina> encontraDisciplina(int codigo){
			List <Disciplina> lista = new ArrayList <>();
			
			Disciplina disc = dR.findByCodigo(codigo);
			lista.add(disc);
			
			return lista;
		}
		
		public void apagaDisciplina(int codigo) {
			dR.deleteById(codigo);
		}
		
}
