package br.com.passagem.aerea.interfaces;

import java.util.List;

import br.com.passagem.aerea.entity.Trecho;

public interface ITrechoBO {
	
	public void cadastrar(Trecho trecho);
	
	public List<Trecho> recuperaTrechos();
	
}
