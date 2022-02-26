package practicaAdicionalSemana4;

public class Helicoptero extends Voladores implements TorreDeControl{
	
	private boolean enFuncionamiento;

	public Helicoptero(String nombre, boolean enFuncionamiento) {
		super(nombre);
		this.enFuncionamiento = enFuncionamiento;
	}

	public boolean isEnFuncionamiento() {
		return enFuncionamiento;
	}

	public void setEnFuncionamiento(boolean enFuncionamiento) {
		this.enFuncionamiento = enFuncionamiento;
	}

	public void aterrizar() {
		System.out.println(nombre + " ha aterrizado con exito.");
	}

	@Override
	public String toString() {
		return nombre;
	}

	
	
}
