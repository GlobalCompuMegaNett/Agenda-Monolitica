package It2.Presentacion;

import It2.Persistencia.GestorBuscar;

import java.io.IOException;
import java.util.Scanner;

public class Interfaz {

	public static void main(String[] args) {
			// TODO Auto-generated method stub

	final Scanner teclado=new Scanner(System.in);

		
                      System.out.println("Que contacto buscas");
                      String nada=teclado.nextLine();
                      String nombre=teclado.nextLine();   
				
					
					try {
						String busqueda=GestorBuscar.BuscarContacto(nombre);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

			
	}
}
