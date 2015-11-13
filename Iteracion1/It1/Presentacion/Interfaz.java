package It1.Presentacion;
import It1.Persistencia.GestorAnadir;

import java.io.IOException;
import java.util.Scanner;

public class Interfaz {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	final Scanner teclado=new Scanner(System.in);

	System.out.println("nombre ");
    String nombre=teclado.nextLine();                                                                
    System.out.println(" telefono");
    String telefono=teclado.nextLine();              
    GestorAnadir.guardarContacto(nombre,telefono);
                     
	}
}