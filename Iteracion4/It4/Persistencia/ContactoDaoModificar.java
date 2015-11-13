package It4.Persistencia;

import java.io.IOException;

import It1.Dominio.Contacto;
import It1.Persistencia.Agente;

public class ContactoDaoModificar {
	
	public static void ModificarContacto(String nombreborrar,String nombrenuevo,String telefono) throws IOException {
		Agente.BorrarContacto(nombreborrar);
		Contacto c=new Contacto(nombrenuevo,telefono);
		Agente.guardarContacto(c, nombrenuevo);
	}

}
