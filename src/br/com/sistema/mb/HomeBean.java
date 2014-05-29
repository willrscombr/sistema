package br.com.sistema.mb;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HomeBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5073499018580781087L;

	public String cadastrarPedido(){
		return "cadastro?faces-redirect=true";
	}
	
}
