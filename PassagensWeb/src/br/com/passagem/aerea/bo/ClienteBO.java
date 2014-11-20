package br.com.passagem.aerea.bo;

import javax.ejb.Local;
import javax.ejb.Stateless;

import br.com.passagem.aerea.dao.DaoGeneric;
import br.com.passagem.aerea.entity.Cliente;
import br.com.passagem.aerea.interfaces.IClienteBO;

@Stateless
@Local(IClienteBO.class)
public class ClienteBO implements IClienteBO {

	DaoGeneric<Cliente> dao = new DaoGeneric<Cliente>(Cliente.class) ;

	
	public void cadastrar(Cliente cliente){
		dao.save(cliente);
	}
}
