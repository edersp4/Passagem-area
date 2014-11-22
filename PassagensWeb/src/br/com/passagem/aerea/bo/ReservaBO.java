package br.com.passagem.aerea.bo;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.passagem.aerea.dao.ReservaDAO;
import br.com.passagem.aerea.entity.Reserva;
import br.com.passagem.aerea.interfaces.IReservaBO;

@Stateless
public class ReservaBO implements IReservaBO{
	
	@EJB
	ReservaDAO dao;

	@Override
	public List<Reserva> listarTodasReserva() {
		return dao.findAll();
	}
}
