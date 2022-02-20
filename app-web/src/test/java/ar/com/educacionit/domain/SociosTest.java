package ar.com.educacionit.domain;

import ar.com.educacionit.dao.impl.SocioDaoImpl;

public class SociosTest {

	public static void main(String[] args) {
		//alguien cargo los datos desde el teclado
		String nombre = "Juan";
		String apellido = "Perez";
		String dni = "123456789";
		String email = "unmail@mail.com";
		String direccion = "calle 13";
		Long pais = 1l;
		
		//uso el constructor de la clase socios
		//Socios nuevoSocio = new Socios(nombre, apellido, email, direccion, pais);
		
		SocioDaoImpl socioImpl = new SocioDaoImpl();
		Socios socio = socioImpl.create(new Socios(nombre,apellido,email,direccion,pais));
		System.out.println("Se ha creado el socio id: " + socio.getId());
		
		Socios otroSocio = socioImpl.findById(5l);
				if(otroSocio != null) {
					System.out.println("Se ha creado el socio id:" + otroSocio.getId());
				}else {
					System.out.println("Se ha encontrado al socio: " + otroSocio);
				}
	}
	
	//usar el findAll()???
	
	
	

}
