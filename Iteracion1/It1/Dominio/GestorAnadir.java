package It1.Persistencia;

import java.io.IOException;

import It1.Dominio.*;


public class GestorAnadir {

	public static void guardarContacto(String nombre, String telefono) throws IOException {
		Contacto c=new Contacto(nombre,telefono);
		ContactoDaoAnadir.anadirContacto(c);
	}

}
