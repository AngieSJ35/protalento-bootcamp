package ar.com.educacionit.dao.impl;

import java.lang.reflect.ParameterizedType;
import ar.com.educacionit.dao.GenericDao;
import ar.com.educacionit.domain.Entity;

public class JdbcDaoBase<T extends Entity> implements GenericDao<T>{
	
	protected String tabla;
	protected Class<T> clazz;
	
	public JdbcDaoBase(String tablaDelHijo){
		this.tabla = tablaDelHijo;
		this.clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public T getOne(Long id) {
		String sql = "SELECT * FROM" + this.tabla  + "WHERE ID = " + id;
		System.out.println("Ejecutando SQL: " + sql);
		T entity;
		try {
			entity = this.clazz.getDeclaredConstructor().newInstance();
			entity.setId(id);
		} catch (Exception e) {
			entity = null;
		}
		
		return entity;
	}


	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	public T save(T entity) {
		
		return null;
	}

	public void update(T entity) {
		// TODO Auto-generated method stub
		
	}

	public T[] findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
