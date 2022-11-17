package bessa.morangon.rafael.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import bessa.morangon.rafael.model.Livro;

public class LivroDAO {

	private EntityManager getEntityManager() {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("crud");
		return factory.createEntityManager();

	}

	public Livro salvar(Livro livro) throws Exception {

		var em = getEntityManager();
		
		em.getTransaction().begin();
		em.persist(livro);
		em.getTransaction().commit();
		em.close();

		return livro;
	}

	public void excluir(Long id) throws Exception {
		
		var em = getEntityManager();
		em.getTransaction().begin();
		Livro livroDeletado = em.find(Livro.class, id);
		em.remove(livroDeletado);
		em.getTransaction().commit();
		em.close();
	}

	public Livro consultarPorId(Long id) throws Exception {
		var em = getEntityManager();
		Livro livro = em.find(Livro.class, id);	
		System.out.println(livro.getAutor() + " : " + livro.getTitulo() + " : " + livro.getId());
		return livro;
		
	}

}
