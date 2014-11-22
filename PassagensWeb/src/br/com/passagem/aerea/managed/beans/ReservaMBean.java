package br.com.passagem.aerea.managed.beans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.passagem.aerea.entity.Reserva;
import br.com.passagem.aerea.interfaces.IReservaBO;

@ManagedBean
@SessionScoped
public class ReservaMBean {
	
	@EJB
	IReservaBO bo;
	
	List<Reserva> listReservas = new ArrayList<Reserva>();
	
	public void listarReserva(){
		listReservas = bo.listarTodasReserva();
	}
	
	public void limpar(){
		listReservas.clear();
	}

	public List<Reserva> getListReservas() {
		return listReservas;
	}

	public void setListReservas(List<Reserva> reservas) {
		this.listReservas = reservas;
	}
	
	
	
}
