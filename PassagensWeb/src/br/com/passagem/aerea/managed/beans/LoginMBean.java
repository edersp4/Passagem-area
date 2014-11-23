package br.com.passagem.aerea.managed.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.passagem.aerea.dao.ClienteDAO;
import br.com.passagem.aerea.entity.Cliente;
import br.com.passagem.aerea.entity.Reserva;
import br.com.passagem.aerea.interfaces.IClienteBO;

@ManagedBean
@SessionScoped
public class LoginMBean implements Serializable{

	private Cliente cliente = new Cliente();
	
	private List<Reserva> listReservas  = new ArrayList<Reserva>();
	
	@EJB
	IClienteBO bo;
	
	@EJB
	ClienteDAO dao;
	
	public String login(){
		listReservas.clear();
		if(bo.login(cliente) != null){
			cliente = dao.buscarPorLoginSenha(cliente);
			return "consulta-reserva";
		}
		return "";
	}
	
	public void popularlistaReserva(){
		cliente = dao.buscarPorLoginSenha(cliente);
		listReservas = cliente.getReservas();
	}
	
	public void limparLista(){
		listReservas.clear();
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Reserva> getListReservas() {
		return listReservas;
	}

	public void setListReservas(List<Reserva> listReservas) {
		this.listReservas = listReservas;
	}
}
