package br.com.passagem.aerea.managed.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.passagem.aerea.entity.Cliente;
import br.com.passagem.aerea.interfaces.IClienteBO;

@ManagedBean
@SessionScoped
public class ClienteMBean {
	
	private Cliente cliente = new Cliente();
	
	@EJB
	IClienteBO bo;
	
	public String cadastrar(){
		bo.cadastrar(getCliente());
		setCliente(new Cliente());
		
		return "";
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
