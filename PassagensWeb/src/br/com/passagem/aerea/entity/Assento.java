package br.com.passagem.aerea.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ASSENTO" , schema="passagemaerea")
public class Assento implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	int idAssento;
	
	@Column(name="DISPONIBILIDADE")
	boolean disponibilidade;
	
	@Column(name="CLASSEASSENTO")
	String classeAssento;

	@Column(name="idtrecho")
	private int trecho;
	
	public int getIdAssento() {
		return idAssento;
	}
	public void setIdAssento(int idAssento) {
		this.idAssento = idAssento;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	public String getClasseAssento() {
		return classeAssento;
	}
	public void setClasseAssento(String classeAssento) {
		this.classeAssento = classeAssento;
	}
	public int getTrecho() {
		return trecho;
	}
	public void setTrecho(int trecho) {
		this.trecho = trecho;
	}


}