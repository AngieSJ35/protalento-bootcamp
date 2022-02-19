package clase9.oop.herencia;

public final class Director extends Persona{

	private Integer empACargo;

	public Director(String nombre, String coloPelo, String apellido) {
		super(nombre, coloPelo, apellido);
		
	}

	public Director(String nombre, String coloPelo, String apellido, Integer empACargo) {
		super(nombre, coloPelo, apellido);
		this.empACargo = empACargo;
	}

	public Integer getEmpACargo() {
		return empACargo;
	}

	public void setEmpACargo(Integer empACargo) {
		this.empACargo = empACargo;
	}
	
	/*@Override
	public void detalle() {
		super.detalle();
		System.out.println("Emplados a cargo: " + this.getEmpACargo());
	}*/
	@Override
	public void detallar() {
		System.out.println("Emplados a cargo: " + this.getEmpACargo());
		
	}
	
	//metodo estatico

	public static void delegar(Empleado empleado, String tarea) {
		empleado.detalle();
		System.out.println("Ejecutando tarea...");
	}
	
}
