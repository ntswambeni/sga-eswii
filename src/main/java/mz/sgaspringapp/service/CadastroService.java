package mz.sgaspringapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mz.sgaspringapp.model.Classe;
import mz.sgaspringapp.model.Disciplina;
import mz.sgaspringapp.repository.ClasseRepository;
import mz.sgaspringapp.repository.DisciplinaRepository;
import mz.sgaspringapp.repository.TurmaRepository;

@Service
public class CadastroService {
	
	@Autowired
	private ClasseRepository cR;
	
	@Autowired
	private TurmaRepository tR;
	
	//Cadastro de Classe	
	public void cadastraClasse(Classe classe) {
		cR.save(classe);
	}
	
	
	
}
