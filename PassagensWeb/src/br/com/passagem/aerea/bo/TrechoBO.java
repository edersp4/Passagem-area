package br.com.passagem.aerea.bo;

import javax.ejb.Local;
import javax.ejb.Stateless;

import br.com.passagem.aerea.dao.DaoGeneric;
import br.com.passagem.aerea.entity.Trecho;

@Stateless
@Local
public class TrechoBO implements ITrechoBO{

	DaoGeneric<Trecho>trechoDao = new DaoGeneric<Trecho>(Trecho.class);
	
	public void cadastrar(Trecho trecho){
		trechoDao.save(trecho);
	}
	
}
