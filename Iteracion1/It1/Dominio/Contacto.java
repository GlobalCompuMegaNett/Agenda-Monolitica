package It1.Dominio;
import java.io.Serializable;

public class Contacto implements Serializable{
	
	private static final long serialVersionUID = -4145592449633654082L;
	private String nombre;
	private String telefono;       
       
    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
                     
        
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTelefono() {
		return this.telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	        
	public String toString(){
		return "Nombre: "+nombre+"\n"+ "Telefono: "+telefono+"\n";
	}
        
}
