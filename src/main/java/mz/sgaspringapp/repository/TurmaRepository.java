package mz.sgaspringapp.repository;

import org.springframework.data.repository.CrudRepository;

import mz.sgaspringapp.model.Turma;

public interface TurmaRepository extends CrudRepository <Turma, Integer>{
	
	public Turma findByCodigo(int codigo);
}
