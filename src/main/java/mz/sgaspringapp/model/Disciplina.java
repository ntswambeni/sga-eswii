package mz.sgaspringapp.model;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Disciplina {

	@Id
	private int codigo;
	private String nomeDisciplina;
	
	public Disciplina() {
		
	}

	public Disciplina(int codigo, String nomeDisciplina) {
		this.codigo = codigo;
		this.nomeDisciplina = nomeDisciplina;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
			
}
