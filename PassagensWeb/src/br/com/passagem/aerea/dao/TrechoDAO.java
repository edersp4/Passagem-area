package br.com.passagem.aerea.dao;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

import br.com.passagem.aerea.entity.Trecho;

@Stateless
public class TrechoDAO extends DaoGeneric<Trecho>{
	
	@PostConstruct
    public void init(){
       super.setClass(Trecho.class);
    }
}
