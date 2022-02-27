package practicaAdicionalSemana3;

import java.util.Arrays;
import java.util.Scanner;

public class Datos {

	public static void main(String[] args) {
		//Crear un .java donde se solicite ingresar los datos de los niños y se muestre min, max, promoción y recursar.

		int ninios = 0;
		int i = 1;
		int j = 0;
		Scanner datos = new Scanner(System.in);
		
		
		do {
			
			System.out.println("Ingrese cantidad de niños matriculados");
			ninios = datos.nextInt();
			
			datos.nextLine();
			
			if(ninios <= 0) {
			System.out.println("La cantidad de niños a registrar debe ser al menos 1");
			}else {
				
				String[] registros = new String[ninios];	{
					for(i=0;i < ninios; i++) {
						System.out.println("Ingrese registro de la forma: (Nombre, Apellido, Número de examen, Nota de Examen");
						registros[i] = datos.nextLine();
				}		
				
				System.out.println("Registro completado");
			
				System.out.println("Mi vector de resgistros es igual a: " + Arrays.toString(registros));	
				i=0;
				
				String[]nombres = new String[registros.length];
				String[]apellidos = new String[registros.length];
				Integer[]numsExamen= new Integer[registros.length];
				Float[]notsExamen= new Float[registros.length];
				
				for(i=0;i<registros.length;i++) {
					String ninio = registros[i];
					String[] dato = ninio.split(",");
					String nombre = dato[0];
					String apellido = dato[1];
					Integer numExamen = Integer.parseInt(dato[2]);
					Float notExamen = Float.parseFloat(dato[3]);
					nombres[i]= nombre;
					apellidos[i] = apellido;
					numsExamen[i]= numExamen;
					notsExamen[i]= notExamen;
				}
				System.out.println("Mi vector de nombres es igual a: " + Arrays.toString(nombres));
				System.out.println("Mi vector de apellidos es igual a: " + Arrays.toString(apellidos));
				System.out.println("Mi vector de número de examen es igual a: " + Arrays.toString(numsExamen));
				System.out.println("Mi vector de nota de examen es igual a: " + Arrays.toString(notsExamen));
				i=0;
				float notMax = notsExamen[0];
				int indiceMax = 0;
				for( i=1; i < notsExamen.length; i++) {
					if( notsExamen [i] > notMax) {
						notMax = notsExamen[i];
						indiceMax = i;
					}
				}		
				System.out.println("La nota más alta fue: " + notMax + "El nombre del estudiante que la obtuvo es: "+ nombres[indiceMax]);
				i=0;
				float notMin = notsExamen[0];
				int indiceMin = 0;
				for( i=1; i < notsExamen.length; i++) {
					if( notsExamen [i] < notMin) {
						notMin = notsExamen[i];
						indiceMin = i;

					}
				}
				System.out.println("La nota más baja fue: " + notMin + "El nombre del estudiante que la obtuvo es: "+ nombres[indiceMin]);
				int cantidad = 0;
				
				for(float notaExamen: notsExamen) {
					if(notaExamen >= 7) {	
						cantidad++;
					}
				}
				System.out.println("Niños aprobados");
				float[] aprobados= new float[cantidad];
				i=0;
				
				for(float aprobado : notsExamen) {
					
					if(aprobado >=7) {
						aprobados[i]=aprobado;
						System.out.println("Nombre y nota del alumno aprobado son: " + nombres[j] + ":" + aprobado);
							i++;
						}
						j++;	
					}
				System.out.println("Total niños aprobados: " + cantidad);
				System.out.println("Niños reprobados");
				cantidad = 0;
				for(float notaExamen: notsExamen) {
					if(notaExamen <= 7) {
						cantidad++;
					}
				}
				
				float[] reprobados= new float[cantidad];
				i=0;
				j=0;
				for(float reprobado : notsExamen) {
					if(reprobado <=7) {
						reprobados[i]=reprobado;
						System.out.println("Nombre y nota del alumno reprobado son: " + nombres[j] + ":" + reprobado);
							i++;
						}
						j++;	
					}
				System.out.println("Total niños reprobados: " + cantidad);
	
				}	
			}	
		}while (ninios <=0) ;
		datos.close();
		
	}
		
		
	}		
		
		/*System.out.println(nombre);
					System.out.println(numExamen);
					System.out.println(apellido);
					System.out.println(notExamen);
					System.out.println(Arrays.toString(dato));*/
		
		
		
	
		
	
		

		
		


