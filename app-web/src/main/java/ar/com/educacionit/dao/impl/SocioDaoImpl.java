package ar.com.educacionit.dao.impl;

import ar.com.educacionit.dao.ICrud;
import ar.com.educacionit.dao.SociosDao;
import ar.com.educacionit.domain.Socios;

public class SocioDaoImpl implements SociosDao{

	public Socios save(Socios socio) {
		
		//mas adelante veremos como conectarnos a la data base
		//insertar datos
		
		String sql = "INSERT INTO SOCIOS(nombre,apellido,wemail,direcci�n) VALUES(los valores)";
		System.out.println("Ejecutando sql:" + sql);
		
		
		return new Socios(10L,"carlos", "lopez", "krloss@gmail.com", "av. siempre viva 46",1l);
		
		
		
	}

	public Socios getOne(Long id) {
		String sql = "SELECT * FROM SOCIOS WHERE ID = " + id;
		System.out.println("Ejecutando sql:" + sql);
		return new Socios(id,"carlos", "lopez", "krloss@gmail.com", "av. siempre viva 46",1l);
	}
	//selec
	public Socios[] findAll() {
		String sql ="select *from socios";
		//varios row 0>n
		Socios socio1 = new Socios(1l,"carlos", "lopez", "krloss@gmail.com", "av. siempre viva 46",1l);
		Socios socio2 = new Socios(2l,"carlos", "lopez", "krloss@gmail.com", "av. siempre viva 46",1l);
		Socios socio3 = new Socios(3l,"carlos", "lopez", "krloss@gmail.com", "av. siempre viva 46",1l);
		System.out.println("Ejecutando sql:" + sql);
		return new Socios[] {socio1,socio2,socio3};
	}

	public void delete(Long id) {
		
	}
	
	
	public void update(Socios entity) {
		String sql = "update socios" +
				"SET direccion = " + entity.getDireccion()+"'apellido = '" + entity.getApellido()+"' , paises_id = " +entity.getPaisesId()+" "+
				"where id = 1";
		System.out.println(sql);
		
	}

	public Object save(Object entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Object entity) {
		// TODO Auto-generated method stub
		
	}

	/*public Socios selecCustom() {
		String sql = "select nombre,apellido from socios";
		System.out.println("Ejecutando sql: "+sql);
		return new Socios(1l,"carlos", "lopez", "krloss@gmail.com", "av. siempre viva 46",1l);*/
	
}
