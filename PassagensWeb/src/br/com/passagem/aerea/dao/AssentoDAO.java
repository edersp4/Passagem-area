package br.com.passagem.aerea.dao;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

import br.com.passagem.aerea.entity.Assento;

@Stateless
public class AssentoDAO extends DaoGeneric<Assento>{
	
	@PostConstruct
    public void init(){
       super.setClass(Assento.class);
    }
}
