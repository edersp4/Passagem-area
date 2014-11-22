package br.com.passagem.aerea.managed.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.passagem.aerea.entity.Trecho;
import br.com.passagem.aerea.interfaces.ITrechoBO;

@ManagedBean
@SessionScoped
public class TrechoMBean {
	
	
	Trecho trecho = new Trecho();
	
	@EJB
	ITrechoBO bo;
	
	public String cadastrar(){
		bo.cadastrar(trecho);
		trecho = new Trecho();
		return "";
		
	}

	public Trecho getTrecho() {
		return trecho;
	}

	public void setTrecho(Trecho trecho) {
		this.trecho = trecho;
	}
}
