package br.com.sistema.mb;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

import br.com.sistema.modelo.Usuario;

@ManagedBean
public class UsuarioBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3939362643519909936L;

	private Usuario usuario = new Usuario();

	public Usuario getUsuario() {
		return usuario;
	}
	
	public String logar(){
		return "home?faces-redirect=true";
	}
}
