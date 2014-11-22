package br.com.passagem.aerea.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TRECHO", schema = "passagemaerea")
public class Trecho implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	
	@Column(name="NOME")
	private String nome;
	
	@Temporal(value=TemporalType.TIMESTAMP)
	@Column(name="HORARIO_SAIDA")
	private Date horarioSaida;

	@Temporal(value=TemporalType.TIMESTAMP)
	@Column(name="HORARIO_CHEGADA")
	private Date horarioChegada;

	@Column(name="NUMERO_VOO")
	private Integer numeroVoo;
	
	@Column(name="PRECO")
	private Double preco;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getHorarioSaida() {
		return horarioSaida;
	}

	public void setHorarioSaida(Date horarioSaida) {
		this.horarioSaida = horarioSaida;
	}

	public Date getHorarioChegada() {
		return horarioChegada;
	}

	public void setHorarioChegada(Date horarioChegada) {
		this.horarioChegada = horarioChegada;
	}

	public Integer getNumeroVoo() {
		return numeroVoo;
	}

	public void setNumeroVoo(Integer numeroVoo) {
		this.numeroVoo = numeroVoo;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
}
