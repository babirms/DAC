package br.uff.ic.dac.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "evento")
public class EventoEntity implements Serializable {

	private static final long serialVersionUID = 6483485505450924598L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eventoId;
	private String nome;
	private String sigla;
	private String areaConcentracao;
	private String instituicaoOrganizadora;
	
	@OneToMany(mappedBy="evento")
	private List<EdicaoEntity> edicoes;

	public EventoEntity() {
	};
	

	public EventoEntity(int eventoId, String nome, String sigla, String areaConcentracao,
			String instituicaoOrganizadora, List<EdicaoEntity> edicoes) {
		super();
		this.eventoId = eventoId;
		this.nome = nome;
		this.sigla = sigla;
		this.areaConcentracao = areaConcentracao;
		this.instituicaoOrganizadora = instituicaoOrganizadora;
		this.edicoes = edicoes;
	}




	public int getEventoId() {
		return eventoId;
	}



	public void setEventoId(int eventoId) {
		this.eventoId = eventoId;
	}



	public List<EdicaoEntity> getEdicoes() {
		return edicoes;
	}



	public void setEdicoes(List<EdicaoEntity> edicoes) {
		this.edicoes = edicoes;
	}

	

	public String getAreaConcentracao() {
		return areaConcentracao;
	}



	public void setAreaConcentracao(String areaConcentracao) {
		this.areaConcentracao = areaConcentracao;
	}



	public String getInstituicaoOrganizadora() {
		return instituicaoOrganizadora;
	}



	public void setInstituicaoOrganizadora(String instituicaoOrganizadora) {
		this.instituicaoOrganizadora = instituicaoOrganizadora;
	}



	public long getSerialversionuid() {
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


}
