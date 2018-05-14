package mz.sgaspringapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mz.sgaspringapp.model.Turma;
import mz.sgaspringapp.repository.TurmaRepository;

@Service
public class TurmaService {

	@Autowired
	private TurmaRepository tR;
	
	public void cadastraTurma(Turma turma) {
		tR.save(turma);
	}
	
	public List <Turma> todasTurmas(){
		List <Turma> lista = new ArrayList <>();
		tR.findAll().forEach(lista::add);
		
		return lista;
	}
	
	public List <Turma> encontraTurma(int codigo){
		List <Turma> lista = new ArrayList <>();
		lista.add(tR.findByCodigo(codigo));
		
		return lista;
	}
	
	public void apagarTurma(int codigo) {
		tR.deleteById(codigo);
	}
}
