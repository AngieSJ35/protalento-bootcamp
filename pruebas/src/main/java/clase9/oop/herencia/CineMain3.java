package clase9.oop.herencia;

public class CineMain3 {
	 
	public static void main(String[] args) {
		
		Empleado empleado = new Empleado("empleadoa", "apellidoemp1", "rojo", 1);
//no hace falta crear un director
		//porque el metodo delegar no pertenece a una instancia sino al director
		
		
		Director.delegar(empleado, "archivar");

	}
}