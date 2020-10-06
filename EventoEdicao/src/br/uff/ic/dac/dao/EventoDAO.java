package br.uff.ic.dac.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.uff.ic.dac.entity.EventoEntity;

public class EventoDAO {

	private EntityManager em = JPAUtil.getEM();
	private EntityTransaction et = em.getTransaction();

	public void salvaEvento(EventoEntity evento) {
		et.begin();
		em.persist(evento);
		et.commit();
		em.close();

	}

	public String excluiEdicao(long evento_id) {
		try {
			et.begin();
			em.remove(evento_id);
			et.commit();
			em.close();
			return "Evento removido com sucesso.";
		} catch (Exception e) {
			return "O evento não pode ser removido: " + e.toString();
		}

	}

	/*public String alteraEvento(EventoEntity eventoNovo) {

	}*/

	public EventoEntity buscaEdicaoPorId(long evento_id) {
		et.begin();
		EventoEntity evento = em.find(EventoEntity.class, evento_id);
		et.commit();
		em.close();
		return evento;
	}
}
