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
	
	public Trecho trechoEscolhido = new Trecho();
	
	public String cadastrar(){
		assento.setIdTrecho(trechoEscolhido);
		bo.cadastrar(assento);
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

	public Trecho getTrechoEscolhido() {
		return trechoEscolhido;
	}

	public void setTrechoEscolhido(Trecho trechoEscolhido) {
		this.trechoEscolhido = trechoEscolhido;
	}

}
