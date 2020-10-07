package br.uff.ic.dac.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.uff.ic.dac.entity.EdicaoEntity;

public class EdicaoDAO {
	
	private EntityManager em = JPAUtil.getEM();
	private EntityTransaction et = em.getTransaction();

	public void salvaEdicao(EdicaoEntity edicao) {
		et.begin();
		em.persist(edicao);
		et.commit();
		em.close();

	}

	public String excluiEdicao(long edicao_id) {
		try {
			et.begin();
			em.remove(edicao_id);
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
