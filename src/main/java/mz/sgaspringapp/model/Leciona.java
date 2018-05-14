package mz.sgaspringapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Leciona {
	@Id
	private int codigo;
	
	private Date dataInicio;
	private Date dataFim;
	
	public Leciona() {
		
	}

	public Leciona(int codigo, Date dataInicio, Date dataFim) {
		this.codigo = codigo;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	
}
