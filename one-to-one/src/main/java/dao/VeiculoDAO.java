package dao;

import javax.persistence.EntityManager;

import model.Veiculo;

public class VeiculoDAO {
	
	private EntityManager entityManager;
	
	
	public VeiculoDAO(EntityManager em) {
		this.entityManager = em;
	}
	
	public void cadastrarVeiculo(Veiculo v) {
		this.entityManager.persist(v);
	}

}
