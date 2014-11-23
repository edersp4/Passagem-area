package br.com.passagem.aerea.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sun.xml.internal.ws.api.FeatureConstructor;

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
	
	@OneToMany(cascade=CascadeType.ALL ,mappedBy="trecho" , fetch=FetchType.EAGER)
	private Set<Reserva> reservas;
	
	
	@OneToMany(mappedBy ="idTrecho",cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	private Set<Assento> assentos;

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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((assentos == null) ? 0 : assentos.hashCode());
		result = prime * result
				+ ((horarioChegada == null) ? 0 : horarioChegada.hashCode());
		result = prime * result
				+ ((horarioSaida == null) ? 0 : horarioSaida.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((numeroVoo == null) ? 0 : numeroVoo.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
		result = prime * result
				+ ((reservas == null) ? 0 : reservas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trecho other = (Trecho) obj;
		if (assentos == null) {
			if (other.assentos != null)
				return false;
		} else if (!assentos.equals(other.assentos))
			return false;
		if (horarioChegada == null) {
			if (other.horarioChegada != null)
				return false;
		} else if (!horarioChegada.equals(other.horarioChegada))
			return false;
		if (horarioSaida == null) {
			if (other.horarioSaida != null)
				return false;
		} else if (!horarioSaida.equals(other.horarioSaida))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroVoo == null) {
			if (other.numeroVoo != null)
				return false;
		} else if (!numeroVoo.equals(other.numeroVoo))
			return false;
		if (preco == null) {
			if (other.preco != null)
				return false;
		} else if (!preco.equals(other.preco))
			return false;
		if (reservas == null) {
			if (other.reservas != null)
				return false;
		} else if (!reservas.equals(other.reservas))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Trecho [id=" + id + ", nome=" + nome + ", horarioSaida="
				+ horarioSaida + ", horarioChegada=" + horarioChegada
				+ ", numeroVoo=" + numeroVoo + ", preco=" + preco
				+ ", reservas=" + reservas + ", assentos=" + assentos + "]";
	}

	public Set<Assento> getAssentos() {
		return assentos;
	}

	public void setAssentos(Set<Assento> assentos) {
		this.assentos = assentos;
	}

	public Set<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(Set<Reserva> reservas) {
		this.reservas = reservas;
	}
	
	

}
