package It1.Persistencia;
import It1.Dominio.Contacto;

import java.io.IOException;


public class ContactoDaoAnadir {
	public static void anadirContacto(Contacto c) {

		try {
			Agente.guardarContacto(c,c.getNombre());
		} catch (IOException e) {
			System.out.println("no se ha podido guardar el contacto ");
			e.printStackTrace();
		}
	}
}
