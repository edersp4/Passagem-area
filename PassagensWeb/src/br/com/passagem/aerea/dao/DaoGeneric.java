package br.com.passagem.aerea.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

@Stateless
public class DaoGeneric<T extends Serializable> implements Dao<T>{
	@PersistenceContext(unitName="fiapPU2")
	protected EntityManager em;
	
	private Class<T> entityClass;
	
	public DaoGeneric() {
	}
	
	public DaoGeneric(Class<T> entityClass) {
		this.entityClass = entityClass;
	}
	
	public void setClass(final Class<T> classset) {
	    this.entityClass = classset;
	}
	
	@Override
	public void save(T entity) {
		em.persist(entity);
	}
	
	@Override
	public void delete(T entity) {
		T entityToBeRemoved = em.merge(entity);
		em.remove(entityToBeRemoved);
	}
	
	@Override
	public void update(T entity) {
		em.merge(entity);
	}
	
	@Override
	public T find(int entityId, Class<T>clazz){
		return em.find(clazz, entityId);
	}
	
	@Override
	public T find(int entityId){
		return em.find(entityClass, entityId);
	}
	
	@Override
	@SuppressWarnings({"unchecked","rawtypes"} )
	public List<T> findAll(Class<T> clazz){
		CriteriaQuery query =  em.getCriteriaBuilder().createQuery();
		query.select(query.from(clazz));
		return em.createQuery(query).getResultList();
	}
	
	@Override
	@SuppressWarnings({"unchecked","rawtypes"} )
	public List<T> findAll(){
		CriteriaQuery query =  em.getCriteriaBuilder().createQuery();
		query.select(query.from(entityClass));
		List lista = em.createQuery(query).getResultList();
		System.out.println("encontrei " + lista.size() + " registros");
		return lista;
	}
	
}
