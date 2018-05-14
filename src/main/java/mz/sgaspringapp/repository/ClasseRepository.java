package mz.sgaspringapp.repository;

import org.springframework.data.repository.CrudRepository;

import mz.sgaspringapp.model.Classe;

public interface ClasseRepository extends CrudRepository <Classe, Integer>{
	
	public Classe findByCodigo(int codigo);
}
