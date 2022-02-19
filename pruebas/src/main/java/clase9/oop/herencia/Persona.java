package clase9.oop.herencia;

public abstract class Persona {

	//atributos
	private String nombre;
	public String coloPelo;
	protected String Apellido;
	public final int cantidadOrejas = 2;
	public final static int cantidadNariz = 1;
	
	
	public Persona(String nombre, String coloPelo, String apellido) {
		this.nombre = nombre;
		this.coloPelo = coloPelo;
		Apellido = apellido;
	}
	
	//metodos
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColoPelo() {
		return coloPelo;
	}
	public void setColoPelo(String coloPelo) {
		this.coloPelo = coloPelo;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	//metodo es del Object, pero Persona le cambia el comportamiento
	public String toString() {
		return "Persona [nombre=" + nombre + ", coloPelo=" + coloPelo + ", Apellido=" + Apellido + "]";
	}
	
	public void detalle() {
		System.out.println(this.toString());
		detallar();
	}
	
	public abstract void detallar();//no esta implementado> el/los hijos deben implementar

	public final int getCantidadOjos() {
		return 2;
	}

}
