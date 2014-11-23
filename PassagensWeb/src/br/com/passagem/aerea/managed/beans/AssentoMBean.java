package br.com.passagem.aerea.managed.beans;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
	
	private Trecho trechoEscolhido = new Trecho();
	
	private Trecho trechoReserva = new Trecho();
	
	
	
	private Set<Assento>listAssentos = new HashSet<Assento>();
	
	public String cadastrar(){
		assento.setIdTrecho(trechoEscolhido);
		bo.cadastrar(assento);
		setAssento(new Assento());
		return "cadastro-trecho";
	}
	
	public List<Trecho> recuperaTrechos(){
		return bo2.recuperaTrechos();
	}
	
	public void popularAssentos(){
		if(trechoReserva != null){
			listAssentos = trechoReserva.getAssentos();
		}
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

	public Set<Assento> getListAssentos() {
		return listAssentos;
	}

	public void setListAssentos(Set<Assento> listAssentos) {
		this.listAssentos = listAssentos;
	}

	public Trecho getTrechoReserva() {
		return trechoReserva;
	}

	public void setTrechoReserva(Trecho trechoReserva) {
		this.trechoReserva = trechoReserva;
	}

}
