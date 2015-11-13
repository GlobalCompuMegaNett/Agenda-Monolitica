package It3.Persistencia;
import It3.Dominio.*;

import java.io.IOException;

public class GestorBorrar {

	public static void BorrarContacto(String nombre) throws IOException {
		ContactoDaoBorrar.BorrarContacto(nombre);
	}

}
