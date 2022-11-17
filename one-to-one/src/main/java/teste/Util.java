package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Util {
	
	private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("onetoone");
	
	
	public static EntityManager getEntityManager() {
		return FACTORY.createEntityManager();
	}
	
	
}
