package clase9.oop.herencia;

public class Empleado extends Persona{

	//atributo propio del empleado
	private Integer id;
	
	public Empleado(String nombre,
			String apellido,
			String colorPelo,
			Integer id) {
		//antes de nacer el empleado, nacer la persona
		super(nombre, apellido, colorPelo);
		
		//puedo "setear" los atributos propios
		this.id = id;
		
		//cantidadOrejas = 3;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	//cambiar el compirtamiento del padre(reutilizar lo del padre + lo propio)
	/*public void detalle() {
		super.detalle();
		//muestre lo propio
		System.out.println("id: " + this.getId());
	}*/
//implementar el metodo abtracto del padre
	@Override
	public void detallar() {
		System.out.println("id: " + this.getId());
	}

}
	
	



