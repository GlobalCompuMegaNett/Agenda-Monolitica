package It4.Persistencia;
import java.io.IOException;
public class GestorModificar {

	public static void ModificarContacto(String nombreborrar,String nombrenuevo,String telefono){
		try {
			ContactoDaoModificar.ModificarContacto(nombreborrar, nombrenuevo, telefono);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
