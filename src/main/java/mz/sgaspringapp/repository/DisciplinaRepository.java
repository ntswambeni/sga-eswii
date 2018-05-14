package mz.sgaspringapp.repository;

import org.springframework.data.repository.CrudRepository;

import mz.sgaspringapp.model.Disciplina;

public interface DisciplinaRepository extends CrudRepository <Disciplina, Integer>{

	public Disciplina findByCodigo(int codigo);
}
