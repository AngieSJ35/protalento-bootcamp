package practicaAdicionalSemana4;

public class Avion extends Voladores implements TorreDeControl{

	private int cantidadDeAlas;

	public Avion(String nombre, int cantidadDeAlas) {
		super(nombre);
		this.cantidadDeAlas = cantidadDeAlas;
	}

	public int getCantidadDeAlas() {
		return cantidadDeAlas;
	}

	public void aterrizar() {
		System.out.println(nombre + " ha aterrizado con exito.");
	}

	@Override
	public String toString() {
		return nombre;
	}
	


}
