package br.uff.ic.dac.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.uff.ic.dac.entity.EventoEntity;

public class EventoDAO {

	private EntityManager em;

	public EventoDAO() {
	}

	public void salvaEvento(EventoEntity evento) {

		em = JPAUtil.getEM();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(evento);
		et.commit();
		em.close();

	}

	public String excluiEvento(int evento_id) {
		try {
			EventoEntity evento = this.buscaEventoPorId(evento_id);
			em = JPAUtil.getEM();
			EntityTransaction et = em.getTransaction();
			et.begin();
			EventoEntity eventoRemove = em.merge(evento);
			em.remove(eventoRemove);
			et.commit();
			em.close();
			return "Evento removido com sucesso.";
		} catch (Exception e) {
			return "O evento não pode ser removido: " + e.toString();
		}

	}

	/*
	 * public String alteraEvento(EventoEntity eventoNovo) {
	 * 
	 * }
	 */

	public EventoEntity buscaEventoPorId(int evento_id) {
		em = JPAUtil.getEM();
		EntityTransaction et = em.getTransaction();
		et.begin();
		EventoEntity evento = em.find(EventoEntity.class, evento_id);
		et.commit();
		em.close();
		return evento;
	}
}
