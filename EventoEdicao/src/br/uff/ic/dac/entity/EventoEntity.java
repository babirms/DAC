package br.uff.ic.dac.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EventoEntity implements Serializable {

	private static final long serialVersionUID = 6483485505450924598L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String nome;
	private String sigla;
	private String area_conc;
	private String inst_org;

	public EventoEntity() {
	};
	
	

	public EventoEntity(String nome, String sigla, String area_conc, String inst_org) {
		super();
		this.nome = nome;
		this.sigla = sigla;
		this.area_conc = area_conc;
		this.inst_org = inst_org;
	}
	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getArea_conc() {
		return area_conc;
	}

	public void setArea_conc(String area_conc) {
		this.area_conc = area_conc;
	}

	public String getInst_org() {
		return inst_org;
	}

	public void setInst_org(String inst_org) {
		this.inst_org = inst_org;
	}

}
