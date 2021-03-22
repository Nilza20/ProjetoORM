package br.ueg.posse.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtils {
	private static final EntityManagerFactory emFactory;
	
	static {
		   emFactory = Persistence.createEntityManagerFactory("pessoa");
	}
	
	public static EntityManager getEntityManager(){
		return emFactory.createEntityManager();
	}
	
	public static void close(){
		emFactory.close();
	}
}
