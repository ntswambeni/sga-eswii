package mz.sgaspringapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mz.sgaspringapp.model.Classe;
import mz.sgaspringapp.repository.ClasseRepository;

@Service
public class ClasseService {
	
	@Autowired
	private ClasseRepository cR;
	

	//Cadastro de Classe	
	public void cadastraClasse(Classe classe) {
		cR.save(classe);
	}
	
	public List <Classe> todasClasses(){
		List<Classe> lista = new ArrayList <>();
		cR.findAll().forEach(lista::add);
		
		return lista;
	}
	
	public List <Classe> encontraClasse(int codigo) {
		List<Classe> lista = new ArrayList <>();
		lista.add(cR.findByCodigo(codigo));
		return lista;
	}
	
	public void apagaClasse(int codigo) {
		cR.deleteById(codigo);
	}
}
