package br.com.passagem.aerea.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="passagemaerea" , name="RESERVA")
public class Reserva implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	
	@Column(name="NUMEROASSENTO")
	private String numeroAssento;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumeroAssento() {
		return numeroAssento;
	}
	public void setNumeroAssento(String numeroAssento) {
		this.numeroAssento = numeroAssento;
	}
	
	

}
