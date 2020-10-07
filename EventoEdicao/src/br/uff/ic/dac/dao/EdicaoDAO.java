package br.uff.ic.dac.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.uff.ic.dac.entity.EdicaoEntity;
import br.uff.ic.dac.entity.EventoEntity;

public class EdicaoDAO {
	
	private EntityManager em = JPAUtil.getEM();
	private EntityTransaction et = em.getTransaction();

	public void salvaEdicao(EdicaoEntity edicao) {
		et.begin();
		em.persist(edicao);
		et.commit();
		em.close();

	}

	public String excluiEdicao(int edicao_id) {
		try {
			EdicaoEntity edicao = this.buscaEdicaoPorId(edicao_id);
			em = JPAUtil.getEM();
			EntityTransaction et = em.getTransaction();
			et.begin();
			EdicaoEntity edicaoRemove = em.merge(edicao);
			em.remove(edicaoRemove);
			et.commit();
			em.close();
			return "Edição removida com sucesso.";
		} catch (Exception e) {
			return "A edição não pode ser removida: " + e.toString();
		}

	}

	/*public String alteraEdicao(EdicaoEntity edicaoNova) {

	}*/

	public EdicaoEntity buscaEdicaoPorId(int edicao_id) {
		et.begin();
		EdicaoEntity edicao = em.find(EdicaoEntity.class, edicao_id);
		et.commit();
		em.close();
		return edicao;
	}

}
