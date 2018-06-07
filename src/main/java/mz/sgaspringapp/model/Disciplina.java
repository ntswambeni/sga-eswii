package mz.sgaspringapp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Disciplina {

	@Id
	@GeneratedValue
	private int codigo;
	private String nomeDisciplina;
	
	private int classefk;
	
	@ManyToMany(mappedBy="disciplina")
	private List <Classe> classe;
	
	@ManyToMany
	private List <Professor> professores;
	
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

	public List<Classe> getClasse() {
		return classe;
	}

	public void setClasse(List<Classe> classe) {
		this.classe = classe;
	}

	public int getClassefk() {
		return classefk;
	}

	public void setClassefk(int classefk) {
		this.classefk = classefk;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
	
	
}
