package Persistencia;

import java.io.IOException;

import It1.Dominio.Contacto;
import It1.Persistencia.Agente;


public class Gestor {
	
	public static void guardarContacto(String nombre, String telefono) throws IOException {
		Contacto c=new Contacto(nombre,telefono);
		ContactoDao.anadirContacto(c);
	}
	
	public static void BorrarContacto(String nombre) throws IOException {
		ContactoDao.BorrarContacto(nombre);
	}

	public static void ModificarContacto(String nombreborrar,String nombrenuevo,String telefono){
		try {
			ContactoDao.ModificarContacto(nombreborrar, nombrenuevo, telefono);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static String BuscarContacto(String nombre) throws IOException {
		Contacto c=null;
		Object o;
		o=ContactoDao.BuscarContacto(nombre);
		c=(Contacto)o;
		String texto=c.toString();
	return texto;
	}
	
}
