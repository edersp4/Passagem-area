package br.com.passagem.aerea.managed.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.passagem.aerea.bo.TrechoBO;
import br.com.passagem.aerea.entity.Trecho;



@ManagedBean
@SessionScoped
public class TrechoMBean {
	
	
	
	Trecho trecho ;
	
	public Trecho getTrecho() {
		return trecho;
	}

	public void setTrecho(Trecho trecho) {
		this.trecho = trecho;
	}

	public void cadastrar(){
	
	}
}
