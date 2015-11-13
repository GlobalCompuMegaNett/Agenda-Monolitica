package It3.Persistencia;

import java.io.IOException;

import It1.Dominio.Contacto;
import It1.Persistencia.Agente;

public class ContactoDaoBorrar {
	
	public static void BorrarContacto(String nombre) {
		try {
			Agente.BorrarContacto(nombre);
		} catch (IOException e) {
			System.out.println("no se ha podido guardar el contacto ");
			e.printStackTrace();
		}
	}
}
