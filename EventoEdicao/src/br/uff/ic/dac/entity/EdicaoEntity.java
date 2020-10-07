package br.uff.ic.dac.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "edicao")
public class EdicaoEntity implements Serializable {

	private static final long serialVersionUID = -521534362773749203L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int edicaoId;
	private int numero;
	private int ano;
	private Date dataInicio;
	private Date dataFim;
	private String cidadeSede;
	private String paisSede;
	
	@ManyToOne
	private EventoEntity evento;
	

	public EdicaoEntity() {
	};
	
	

	public EdicaoEntity(int edicaoId, int numero, int ano, Date dataInicio, Date dataFim, String cidadeSede,
			String paisSede, EventoEntity evento) {
		super();
		this.edicaoId = edicaoId;
		this.numero = numero;
		this.ano = ano;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.cidadeSede = cidadeSede;
		this.paisSede = paisSede;
		this.evento = evento;
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



	public String getCidadeSede() {
		return cidadeSede;
	}



	public void setCidadeSede(String cidadeSede) {
		this.cidadeSede = cidadeSede;
	}



	public String getPaisSede() {
		return paisSede;
	}



	public void setPaisSede(String paisSede) {
		this.paisSede = paisSede;
	}



	public int getEdicaoId() {
		return edicaoId;
	}


	public void setEdicaoId(int edicaoId) {
		this.edicaoId = edicaoId;
	}


	public EventoEntity getEvento() {
		return evento;
	}


	public void setEvento(EventoEntity evento) {
		this.evento = evento;
	}


	public long getSerialversionuid() {
		return serialVersionUID;
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

}
