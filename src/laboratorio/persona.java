package laboratorio;
import java.util.Scanner;
public class persona {
	private
	  String nom;
	  int edad;
	  
    public
      persona(){
    	
    }
    void leer(){
    	Scanner lee= new Scanner (System.in);
    	System.out.println("Nombre:");
    	nom = lee.nextLine();
    	System.out.println("edad");
    	edad = lee.nextInt();
    }
    void mostrar(){
    	System.out.println("Nombre:"+nom);
    	System.out.println("edad:"+edad);
    }
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
    
}
