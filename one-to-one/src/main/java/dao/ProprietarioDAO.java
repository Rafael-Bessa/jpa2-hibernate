package dao;

import javax.persistence.EntityManager;

import model.Proprietario;

public class ProprietarioDAO {
	
	private EntityManager entityManager;
	
	
	public ProprietarioDAO(EntityManager em) {
		this.entityManager = em;
	}
	
	public void cadastrarProprietario(Proprietario p) {
		this.entityManager.persist(p);
	}

}
