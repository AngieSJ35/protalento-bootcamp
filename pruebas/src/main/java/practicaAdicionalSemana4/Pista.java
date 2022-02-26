package practicaAdicionalSemana4;

public class Pista {

	public static void main(String[] args) {
		
		Avion a = new Avion("Avion1", 2);
		Helicoptero h = new Helicoptero("Helicoptero1",true);
		Superman s = new Superman("Superman1", 25L);
		Ovni o = new Ovni("Ovni1", "Jupiter");
		
		Voladores[] volador = new Voladores[] {a,h,s,o};
		
		for(Voladores v : volador) {
			if(v instanceof TorreDeControl) {
				
				TorreDeControl atr = (TorreDeControl) v;
				
				atr.aterrizar();
			}else {
				System.out.println(v.toString() + " no puede aterrizar, no cumple contrato.");
				
			}
		}
	}
	

}
