package Persistencia;

import java.io.IOException;

import It1.Dominio.Contacto;
import It1.Persistencia.Agente;

public class ContactoDao {
	
	public static void anadirContacto(Contacto c) {

		try {
			Agente.guardarContacto(c,c.getNombre());
		} catch (IOException e) {
			System.out.println("no se ha podido guardar el contacto ");
			e.printStackTrace();
		}
	}
	public static void BorrarContacto(String nombre) {
		try {
			Agente.BorrarContacto(nombre);
		} catch (IOException e) {
			System.out.println("no se ha podido guardar el contacto ");
			e.printStackTrace();
		}
	}
	

	public static void ModificarContacto(String nombreborrar,String nombrenuevo,String telefono) throws IOException {
		Agente.BorrarContacto(nombreborrar);
		Contacto c=new Contacto(nombrenuevo,telefono);
		Agente.guardarContacto(c, nombrenuevo);
	}
	public static Object BuscarContacto(String nombre) throws IOException {
		Object o=null;
		o=Agente.BuscarContacto(nombre);
		return o;
	}
	
}
