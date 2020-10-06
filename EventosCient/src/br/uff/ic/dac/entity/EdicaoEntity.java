package br.uff.ic.dac.entity;

import java.io.Serializable;


public class EdicaoEntity implements Serializable {

	private static final long serialVersionUID = 6483485505450924598L;
	private String nome;
	private String sigla;
	private String area_conc;
	private String inst_org;

	public EdicaoEntity() {
	};

	public EdicaoEntity(String nome, String sigla, String area_conc, String inst_org) {
		super();
		this.nome = nome;
		this.sigla = sigla;
		this.area_conc = area_conc;
		this.inst_org = inst_org;
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
