package mz.sgaspringapp.repository;

import org.springframework.data.repository.CrudRepository;

import mz.sgaspringapp.model.Professor;

public interface ProfessorRepository extends CrudRepository<Professor, Integer> {

	Professor findByCodigo(int codigo);

}
