package br.com.passagem.aerea.bo;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import br.com.passagem.aerea.dao.ClienteDAO;
import br.com.passagem.aerea.entity.Cliente;
import br.com.passagem.aerea.interfaces.IClienteBO;

@Stateless
@Local(IClienteBO.class)
public class ClienteBO implements IClienteBO {

	@EJB
	ClienteDAO dao;
	
	public void cadastrar(Cliente cliente){
		dao.save(cliente);
	}
	
	public boolean login(Cliente cliente){
		Cliente cli = null;
		try {
			cli = dao.buscarPorLoginSenha(cliente);
			
			if(cli != null)
				return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
