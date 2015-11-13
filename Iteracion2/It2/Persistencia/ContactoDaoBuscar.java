package It2.Persistencia;

import java.io.IOException;

import It1.Persistencia.Agente;

public class ContactoDaoBuscar {

	
	public static Object BuscarContacto(String nombre) throws IOException {
		
		Object o=null;
		o=Agente.BuscarContacto(nombre);
		return o;
	}	
}
