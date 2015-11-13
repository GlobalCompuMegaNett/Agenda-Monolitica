package It3.Presentacion;


import It3.Persistencia.GestorBorrar;

	import java.io.IOException;
import java.util.Scanner;

public class Interfaz {
	public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub

		final Scanner teclado=new Scanner(System.in);
	
			System.out.println("nombre a borrar");
	        String nada=teclado.nextLine();
	        String nombre=teclado.nextLine();                                                                             
	        GestorBorrar.BorrarContacto(nombre);
	}
}
