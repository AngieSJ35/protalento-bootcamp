package ar.com.educacionit.dao;

import ar.com.educacionit.domain.Socios;

public interface ICrud {

	public Socios create(Socios socio);
	
	public Socios findById(Long id);
	
	//despues completo los demas
	
	
}
