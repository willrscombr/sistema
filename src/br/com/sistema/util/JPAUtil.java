package br.com.sistema.util;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

@ApplicationScoped
public class JPAUtil {

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Produces
	@RequestScoped
	public EntityManager getEntityManager(){
		
		return factory.createEntityManager();
	
	}
	
	public void fechar(@Disposes EntityManager manager){
		manager.close();
	}
	
}
