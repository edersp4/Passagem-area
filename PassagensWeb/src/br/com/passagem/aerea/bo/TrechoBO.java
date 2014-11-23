package br.com.passagem.aerea.bo;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import br.com.passagem.aerea.dao.TrechoDAO;
import br.com.passagem.aerea.entity.Trecho;
import br.com.passagem.aerea.interfaces.ITrechoBO;

@Stateless
@Local(ITrechoBO.class)
public class TrechoBO implements ITrechoBO{

	@EJB
	TrechoDAO dao;
	
	public void cadastrar(Trecho trecho){
		dao.save(trecho);
	}
	
	public List<Trecho> recuperaTrechos(){
		List<Trecho> lista = dao.findAll();
		return lista;
	}
}
