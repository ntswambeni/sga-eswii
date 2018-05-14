package mz.sgaspringapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PlanoCurricular {
	@Id
	private int codigo;
	
	private String descricao;

	public PlanoCurricular() {
		
	}
	
	public PlanoCurricular(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
