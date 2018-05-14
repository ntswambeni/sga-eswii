package mz.sgaspringapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Inscricao {
	@Id
	private int codigo;
	
	private double mediaFrequencia;
	
	public Inscricao() {
		
	}
	
	public Inscricao(int codigo, double mediaFrequencia) {
		this.codigo = codigo;
		this.mediaFrequencia = mediaFrequencia;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getMediaFrequencia() {
		return mediaFrequencia;
	}

	public void setMediaFrequencia(double mediaFrequencia) {
		this.mediaFrequencia = mediaFrequencia;
	}
		
}
