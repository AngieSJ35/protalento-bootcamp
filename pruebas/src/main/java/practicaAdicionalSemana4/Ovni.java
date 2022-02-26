package practicaAdicionalSemana4;

public class Ovni extends Voladores{

	private String planetaOrigen;

	public Ovni(String nombre, String planetaOrigen) {
		super(nombre);
		this.planetaOrigen = planetaOrigen;
	}

	public String getPlanetaOrigen() {
		return planetaOrigen;
	}

	
	public String toString() {
		return nombre ;
	}

	
}

