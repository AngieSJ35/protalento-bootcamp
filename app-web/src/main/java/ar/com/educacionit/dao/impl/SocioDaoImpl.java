package ar.com.educacionit.dao.impl;

import ar.com.educacionit.dao.ICrud;
import ar.com.educacionit.domain.Socios;

public class SocioDaoImpl implements ICrud{

	public Socios create(Socios socio) {
		
		//mas adelante veremos como conectarnos a la data base
		//insertar datos
		
		String sql = "INSERT INTO SOCIOS(nombre,apellido,wemail,dirección) VALUES(los valores)";
		System.out.println("Ejecutando sql:" + sql);
		
		
		return new Socios(10L,"carlos", "lopez", "krloss@gmail.com", "av. siempre viva 46",1l);
		
		
		
	}

	public Socios findById(Long id) {
		String sql = "SELECT * FROM SOCIOS WHERE ID = " + id;
		System.out.println("Ejecutando sql:" + sql);
		return new Socios(id,"carlos", "lopez", "krloss@gmail.com", "av. siempre viva 46",1l);
	}
	
}
