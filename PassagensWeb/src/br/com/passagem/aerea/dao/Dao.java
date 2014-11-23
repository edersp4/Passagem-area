package br.com.passagem.aerea.dao;

import java.util.List;

import javax.ejb.Local;

@Local
public interface Dao<T>{
	public void save(T entity);
	
	public void delete(T entity);
	
	public void update(T entity);
	
	public T find(int entityId , Class<T>clazz);
	
	public List<T>findAll(Class<T> clazz);
}
