package Presentacion;

import java.io.IOException;
import java.util.Scanner;

import Persistencia.Gestor;


public class Interfaz {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	final Scanner teclado=new Scanner(System.in);

		int num=1;
		String nada,nombre,telefono;
		String menu="Introduce un numero para realizar la operacion a realizar\n"
				  + "1 Añadir contacto\n"
				  + "2 Borrar contacto\n"
				  + "3 Modificar contacto\n"
				  + "4 Buscar contacto\n"
				  + "5 Salir\n";
		System.out.println(""+menu);
         num=teclado.nextInt();
         
         while(num>0){
            
             switch(num){
             	case 1:
                      System.out.println("Nombre nuevo");
                      nada=teclado.nextLine();
                      nombre=teclado.nextLine();                                                                
                      System.out.println("Telefono nuevo");
                      telefono=teclado.nextLine();              
                      Gestor.guardarContacto(nombre,telefono);
                      break;
                      
             	case 2:
             		System.out.println("Nombre Contacto que quieres borrar");
             		nada=teclado.nextLine();
                    nombre=teclado.nextLine();   
        	        Gestor.BorrarContacto(nombre);
                    break;
                    
             	case 3:
             		System.out.println("Contacto a modificar");
             		nada=teclado.nextLine();
             		nombre=teclado.nextLine(); 
                    System.out.println("Nombre nuevo");
                    String nombreguardar=teclado.nextLine();                                                                
                    System.out.println("Telefono nuevo");
                    telefono=teclado.nextLine(); 
                    Gestor.ModificarContacto(nombre,nombreguardar, telefono);
                    break;
                    
             	case 4:
             		System.out.println("Contacto a buscar");
             		nada=teclado.nextLine();
                    nombre=teclado.nextLine(); 
                	
					try {
						String busqueda=Gestor.BuscarContacto(nombre);
	             		System.out.println(""+busqueda);
					} catch (IOException e) {
						e.printStackTrace();
					}
             		break;
          }
             System.out.println(""+menu);
             num=teclado.nextInt();
         }
	}
}
