package br.com.passagem.aerea.dao;

import java.util.List;

import javax.ejb.Stateless;

import br.com.passagem.aerea.entity.Reserva;

@Stateless
public class ReservaDAO extends DaoGeneric<Reserva>{
	
	public List<Reserva> findAll() {
		return super.findAll(Reserva.class);
	}
	
}
