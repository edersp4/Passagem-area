package br.com.passagem.aerea.managed.beans;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.passagem.aerea.entity.Assento;
import br.com.passagem.aerea.entity.Trecho;
import br.com.passagem.aerea.interfaces.IAssentoBO;
import br.com.passagem.aerea.interfaces.ITrechoBO;

@ManagedBean
@SessionScoped
public class AssentoMBean {
	
	private Assento assento = new Assento();
	
	@EJB
	IAssentoBO bo;
	
	@EJB
	ITrechoBO bo2;
	
	public String trechoEscolhido;
	
	public String cadastrar(){


		assento.setTrecho(new Integer(this.trechoEscolhido).intValue());
		bo.cadastrar(getAssento());
		setAssento(new Assento());
		
		return "";
	}
	
	public List<Trecho> recuperaTrechos(){
		return bo2.recuperaTrechos();
	}

	public Assento getAssento() {
		return assento;
	}

	public void setAssento(Assento assento) {
		this.assento = assento;
	}

	public String getTrechoEscolhido() {
		return trechoEscolhido;
	}

	public void setTrechoEscolhido(String trechoEscolhido) {
		this.trechoEscolhido = trechoEscolhido;
	}

}
