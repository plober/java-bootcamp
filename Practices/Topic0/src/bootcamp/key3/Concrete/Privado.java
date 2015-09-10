package bootcamp.key3.Concrete;

import bootcamp.key3.Producto.Hospital;
import bootcamp.key3.Producto.Sector;

public class Privado extends Hospital {

	public String getDescripcion(){
		return ("building a Private hospital");
	}

	public void registerGuest() {
		for (Sector sector : sectors) {
			if(	sector.registerGuest() )
				break;
		}
	}

	
}
