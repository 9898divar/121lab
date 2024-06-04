package laboratorio;

public class Nodo {
	private
	   persona A;
	   Nodo izq;
	   Nodo der;
	   
    public 
       Nodo()
    {
    	izq=null;
    	der=null;
    	
    }

	public persona getA() {
		return A;
	}

	public void setA(persona a) {
		A = a;
	}

	public Nodo getIzq() {
		return izq;
	}

	public void setIzq(Nodo izq) {
		this.izq = izq;
	}

	public Nodo getDer() {
		return der;
	}

	public void setDer(Nodo der) {
		this.der = der;
	}
    
          
}
