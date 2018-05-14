package mz.sgaspringapp.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Estudante {
	@Id
	private int codigo;
	private String nome;
	private char sexo;
	private Date dataNasc;
	private String moorada;
	private String nomeEncarregado;
	private int telefoneEncarregado;
	
	public Estudante() {
		
	}
	
	

	public Estudante(int codigo, String nome, char sexo, Date dataNasc, String moorada, String nomeEncarregado,
			int telefoneEncarregado) {
		this.codigo = codigo;
		this.nome = nome;
		this.sexo = sexo;
		this.dataNasc = dataNasc;
		this.moorada = moorada;
		this.nomeEncarregado = nomeEncarregado;
		this.telefoneEncarregado = telefoneEncarregado;
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getMoorada() {
		return moorada;
	}

	public void setMoorada(String moorada) {
		this.moorada = moorada;
	}

	public String getNomeEncarregado() {
		return nomeEncarregado;
	}

	public void setNomeEncarregado(String nomeEncarregado) {
		this.nomeEncarregado = nomeEncarregado;
	}

	public int getTelefoneEncarregado() {
		return telefoneEncarregado;
	}

	public void setTelefoneEncarregado(int telefoneEncarregado) {
		this.telefoneEncarregado = telefoneEncarregado;
	}
	
	
}
