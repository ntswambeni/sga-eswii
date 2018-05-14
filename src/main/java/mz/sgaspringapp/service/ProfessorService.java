package mz.sgaspringapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mz.sgaspringapp.model.Professor;
import mz.sgaspringapp.repository.ProfessorRepository;

@Service
public class ProfessorService {

	@Autowired
	ProfessorRepository pR;
	
	public void cadastraProfessor(Professor professor) {
		pR.save(professor);
	}
	
	public List <Professor> todosProfessores(){
		List <Professor> lista = new ArrayList <>();
		pR.findAll().forEach(lista::add);
		
		return lista;
	}
	
	public List <Professor> encontraProfessor(int codigo){
		List <Professor> lista = new ArrayList <>();
		
		Professor disc = pR.findByCodigo(codigo);
		lista.add(disc);
		
		return lista;
	}
	
	public void apagaProfessor(int codigo) {
		pR.deleteById(codigo);
	}
}
