package br.com.sistema.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.sistema.modelo.Produto;

@Stateless
public class ProdutoDao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8829430757194511756L;
	
	@Inject
	private EntityManager manager;
	
	public void salvar(Produto produto){
		manager.persist(produto);
	}
	
	@SuppressWarnings("unchecked")
	public List<Produto> getProdutos(){
		
		String jpql = "select p from Produto p";
		Query q = manager.createQuery(jpql, Produto.class);
		return q.getResultList() ;
		
	}
	
}
