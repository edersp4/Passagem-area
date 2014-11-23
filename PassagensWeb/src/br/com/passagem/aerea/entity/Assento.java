package br.com.passagem.aerea.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ID_TRECHO")
	private Trecho idTrecho;
	
	@Column(name="NUMERO")
	private int numero;
	
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Trecho getIdTrecho() {
		return idTrecho;
	}

	public void setIdTrecho(Trecho idTrecho) {
		this.idTrecho = idTrecho;
	}

}