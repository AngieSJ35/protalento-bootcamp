package clase9.oop.herencia;

public class CineMain2 {
	 
	public static void main(String[] args) {
		
		//Persona persona = new Persona("persona1","apellido1", "Negro");
		Empleado empleado = new Empleado("empleadoa", "apellidoemp1", "rojo", 1);
		Efectivo efectivo = new Efectivo("efectivo1", "apellidoefectivo1", "rubio", 1);
		Contratado contratado = new Contratado("nombre contratado1", "apellido contratado1", "azul", 1, 6);
		
		Director director = new Director("nombre director", "apellido director", "negro", 10);
		
		//todas las personas pueden ir al cine
		Persona[] personas = new Persona[4];
		
		System.out.println(empleado.cantidadNariz);
		System.out.println(efectivo.cantidadNariz);
		
		//Persona.cantidadNariz = 5;//cambia en todo.
		
		System.out.println(contratado.cantidadNariz);
		System.out.println(director.cantidadNariz);
			}
}
