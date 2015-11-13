package It1.Persistencia;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Agente{
	private static ObjectInputStream lectorArchivo;

	public static void guardarContacto(Object o,String nombre) throws IOException  {
		File fichero=new File(nombre+".txt");	
		 try
	        {
			 ObjectOutputStream oos = new ObjectOutputStream(
                     new FileOutputStream(fichero));
                 oos.writeObject(o);
             oos.close();
	        } catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	}	
	
	
	public static void BorrarContacto(String nombre) throws IOException  {

		File fichero=new File("C:\\Users\\Kike\\Desktop\\EclipsePortable\\Data\\workspace\\AgendaMonolitica\\"+nombre+".txt");
		if(fichero.exists())
			if (fichero.delete())
				System.out.println("El fichero ha sido borrado satisfactoriamente");
			else
				System.out.println("El fichero no puede ser borrado");
	}

	
	 
	public static void ModificarContacto(String nombreborrar,String nombreguardar, String telefono){
		try {
			BorrarContacto(nombreborrar);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			guardarContacto(nombreguardar,telefono);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static Object BuscarContacto(String nombre){
		File fichero=new File (nombre+".txt");
		Object c=null;
			if(lectorArchivo==null)
				try {
					lectorArchivo = new ObjectInputStream(new FileInputStream(fichero));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					c=lectorArchivo.readObject();
				} catch (ClassNotFoundException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	return c;		
	}    
}
