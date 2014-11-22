package br.com.passagem.aerea.interfaces;

import br.com.passagem.aerea.entity.Cliente;


public interface IClienteBO {
	public void cadastrar(Cliente cliente);
	
	public boolean login(Cliente cliente);
}
