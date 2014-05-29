package br.com.sistema.mb;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.sistema.dao.ProdutoDao;
import br.com.sistema.modelo.Produto;

@Named
@RequestScoped
public class ProdutoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4574741331203555979L;
	
	private Produto produto = new Produto();
	private List<Produto> produtos;
	
	@Inject
	private ProdutoDao dao;
	
	public Produto getProduto() {
		return produto;
	}

	public List<Produto> getProdutos() {
		
		if(produtos == null){
			produtos = dao.getProdutos();
		}
		
		return produtos;
	}
	
	public void salvar(){
		dao.salvar(produto);
		produto = new Produto();
		produtos = dao.getProdutos();
	}
	
}
