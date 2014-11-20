package br.com.passagem.aerea.dao;

import java.util.List;

public interface Dao<T>{
	public void save(T entity);
	
	public void delete(T entity);
	
	public void update(T entity);
	
	public T find(int entityId);
	
	public List<T>findAll();
}
