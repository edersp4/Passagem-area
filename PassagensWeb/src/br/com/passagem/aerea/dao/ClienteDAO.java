package br.com.passagem.aerea.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import br.com.passagem.aerea.entity.Cliente;

@Stateless
public class ClienteDAO extends DaoGeneric<Cliente>{
	
	public Cliente buscarPorLoginSenha(Cliente cliente){
		
		TypedQuery<Cliente> sql = em.createQuery("Select c from Cliente c where c.usuario = :usuario and c.senha = :senha" , Cliente.class);
		sql.setParameter("usuario", cliente.getUsuario());
		sql.setParameter("senha", cliente.getSenha());
		
		try {
			List<Cliente> cli = sql.getResultList(); 
			
			if(cli.size() != 0)
				return cli.get(0);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
}
