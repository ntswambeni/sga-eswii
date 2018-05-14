package mz.sgaspringapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Matricula {
	@Id
	private int codigo;
	
	private Date data;
	
	private int nrEstudante;
	
	private boolean estado;
	
	public Matricula() {
		
	}

	public Matricula(int codigo, Date data, int nrEstudante, boolean estado) {
		this.codigo = codigo;
		this.data = data;
		this.nrEstudante = nrEstudante;
		this.estado = estado;
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

	public int getNrEstudante() {
		return nrEstudante;
	}

	public void setNrEstudante(int nrEstudante) {
		this.nrEstudante = nrEstudante;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
}
