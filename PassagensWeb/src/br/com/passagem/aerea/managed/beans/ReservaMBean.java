package br.com.passagem.aerea.managed.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import br.com.passagem.aerea.dao.ClienteDAO;
import br.com.passagem.aerea.entity.Reserva;
import br.com.passagem.aerea.interfaces.IReservaBO;

@ManagedBean
@SessionScoped
public class ReservaMBean implements Serializable{
	
	@EJB
	IReservaBO bo;
	
	@EJB
	ClienteDAO clienteDao;
	
	private Reserva reserva = new Reserva(); 
	
	@ManagedProperty(value="#{loginMBean}")
	private LoginMBean loginBean;  
	
	List<Reserva> listReservas = new ArrayList<Reserva>();
	
	public void listarReserva(){
		listReservas = bo.listarTodasReserva();
	}
	
	public void limpar(){
		listReservas.clear();
	}
	
	public void salvar(){
		clienteDao.salvaReserva(reserva, loginBean.getCliente());
	}

	public List<Reserva> getListReservas() {
		return listReservas;
	}

	public void setListReservas(List<Reserva> reservas) {
		this.listReservas = reservas;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public LoginMBean getLoginBean() {
		return loginBean;
	}

	public void setLoginBean(LoginMBean loginBean) {
		this.loginBean = loginBean;
	}
}
