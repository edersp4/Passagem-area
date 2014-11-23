package br.com.passagem.aerea.interfaces;

import java.util.List;

import br.com.passagem.aerea.entity.Cliente;
import br.com.passagem.aerea.entity.Reserva;


public interface IClienteBO {
	public void cadastrar(Cliente cliente);
	
	public Cliente login(Cliente cliente);
	
//	public List<Reserva>listarReservas();
}
