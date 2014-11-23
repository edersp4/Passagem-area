package br.com.passagem.aerea.bo;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import br.com.passagem.aerea.dao.AssentoDAO;
import br.com.passagem.aerea.entity.Assento;
import br.com.passagem.aerea.interfaces.IAssentoBO;

@Stateless
@Local(IAssentoBO.class)
public class AssentoBO implements IAssentoBO{

	@EJB
	AssentoDAO dao;
	
	public void cadastrar(Assento assento){
		dao.save(assento);
	}
	
}
