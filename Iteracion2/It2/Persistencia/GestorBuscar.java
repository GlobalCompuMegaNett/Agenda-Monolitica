package It2.Persistencia;

import java.io.IOException;

import It1.Dominio.Contacto;

public class GestorBuscar {

	
	
	public static String BuscarContacto(String nombre) throws IOException {
		Contacto c=null;
		Object o=null;
		o=ContactoDaoBuscar.BuscarContacto(nombre);
		c=(Contacto)o;
		String texto=c.toString();
	return texto;
	}
	
}
