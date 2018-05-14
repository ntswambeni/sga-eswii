package mz.sgaspringapp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


public class TurmaClasse {
	
	private int codigo;
	private int codigoTurma;
	private int codigoClasse;
	
	
	private Date data;
	private int vagas;
	
	
	private Turma turma;
	
	private Classe Classe;
	
	public TurmaClasse() {
		
	}

	public TurmaClasse(Date data, int vagas) {
		this.data = data;
		this.vagas = vagas;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Classe getClasse() {
		return Classe;
	}

	public void setClasse(Classe classe) {
		Classe = classe;
	}

	public int getCodigoTurma() {
		return codigoTurma;
	}

	public void setCodigoTurma(int codigoTurma) {
		this.codigoTurma = codigoTurma;
	}

	public int getCodigoClasse() {
		return codigoClasse;
	}

	public void setCodigoClasse(int codigoClasse) {
		this.codigoClasse = codigoClasse;
	}
	
}
