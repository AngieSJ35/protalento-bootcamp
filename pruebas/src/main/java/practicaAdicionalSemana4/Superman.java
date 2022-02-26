package practicaAdicionalSemana4;

public class Superman extends Voladores{

	private float edad;

	public Superman(String nombre, float edad) {
		super(nombre);
		this.edad = edad;
	}

	public float getEdad() {
		return edad;
	}

	public void setEdad(float edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	
}
