package br.uff.ic.dac.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EdicaoEntity implements Serializable {

	private static final long serialVersionUID = -521534362773749203L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int numero;
	private int ano;
	private Date data_inicio;
	private Date data_fim;
	private String cidade;
	private String pais;

	public EdicaoEntity() {
	};

	public EdicaoEntity(int numero, int ano, Date data_inicio, Date data_fim, String cidade, String pais) {
		super();
		this.numero = numero;
		this.ano = ano;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.cidade = cidade;
		this.pais = pais;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Date getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}

	public Date getData_fim() {
		return data_fim;
	}

	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}
