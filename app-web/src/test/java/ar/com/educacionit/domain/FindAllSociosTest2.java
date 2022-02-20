package ar.com.educacionit.domain;

import ar.com.educacionit.dao.ICrud;
import ar.com.educacionit.dao.impl.SocioDaoImpl;
import ar.com.educacionit.dao.impl.SociosSQLCustom;

public class FindAllSociosTest2 {

	public static void main(String[] args) {
	
	SocioDaoImpl socioImpl = new SocioDaoImpl();
	//ArticuloDaoImpl articuloImpl = new SocioDaoImpl();
	//CuponDaoImpl cuponImpl = new SocioDaoImpl();
	
	ICrud[] cruds = new ICrud[] {socioImpl,/*articuloImpl*/} ;
	
	for(ICrud unCrud : cruds) {
		if(unCrud instanceof SociosSQLCustom) {
			SociosSQLCustom sc = (SociosSQLCustom)unCrud;
			sc.selecCustom();
		}
	}
	
	}
}
	
