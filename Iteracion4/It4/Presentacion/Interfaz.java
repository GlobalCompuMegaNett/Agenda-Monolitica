package It4.Presentacion;


import It4.Persistencia.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Interfaz {

	public static void main(String[] args) {
			// TODO Auto-generated method stub

		final Scanner teclado=new Scanner(System.in);
		
		System.out.println("modificar contacto");
        String nombreborrar=teclado.nextLine();                                                                
        System.out.println("contacto nuevo");
        String nombreguardar=teclado.nextLine();                                                                
        String telefono=teclado.nextLine();                                                               
        GestorModificar.ModificarContacto(nombreborrar,nombreguardar, telefono);
	}
}
