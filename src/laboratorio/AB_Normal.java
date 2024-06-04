package laboratorio;
import java.util.Scanner;
public class AB_Normal extends ArbolBinario {
	public
	   void crear(Nodo R){
		Scanner lee= new Scanner(System.in);
		if(R!=null)
		{
			persona x=new persona();
			x=new persona();
			x.leer();
			R.setA(x);
			System.out.println("Tendra izq ? s/n");
			String resp = lee.nextLine();
			if(resp.equals ("s") ){
				Nodo nuevo= new Nodo();
				R.setIzq(nuevo);
				crear(R.getIzq());
			}
			System.out.println("tendra der ? s/n");
			String resp1 = lee.nextLine();
			if(resp1.equals("s") ){
				Nodo nuevo= new Nodo();
				R.setDer(nuevo);
				crear(R.getDer());
			}
		}
		
	}
	void PreOrden(Nodo R){
		if(R!=null){
			R.getA().mostrar();
			PreOrden(R.getIzq());
			PreOrden(R.getDer());
		}
	}
	void InOrden(Nodo R){
		if(R!=null){
			InOrden(R.getIzq());
			R.getA().mostrar();
			InOrden(R.getDer());
		}
	}
	void PostOrden(Nodo R){
		if(R!=null){
			PostOrden(R.getIzq());
			PostOrden(R.getDer());
			R.getA().mostrar();
		}
	}
	void Niveles(){
		colaSimple nivel =new colaSimple();
		colaSimple desc =new colaSimple();
		nivel.adicionar(raiz);
		while(!nivel.esVacia()){
			while(!nivel.esVacia()){
				Nodo x = new Nodo ();
				x.getA().mostrar();
				if(x.getIzq()!=null){
					desc.adicionar(x.getIzq());
				}
				if(x.getDer()!=null){
					desc.adicionar(x.getDer());
				}
			}
			nivel.vaciar(desc);
		}
	}
	void CantNodosNivel(){
		colaSimple nivel =new colaSimple();
		colaSimple desc =new colaSimple();
		nivel.adicionar(raiz);
		while(!nivel.esVacia()){
			System.out.println(nivel.nroElementos());
			while(!nivel.esVacia()){
				Nodo x =nivel.eliminar();
				x.getA().mostrar();
				if(x.getIzq()!=null){
					desc.adicionar(x.getIzq());
				}
				if(x.getDer()!=null){
					desc.adicionar(x.getDer());
				}
			}
			nivel.vaciar(desc);
		}
	}
	
	int nroNodos(){
		int c=0;
		colaSimple nivel =new colaSimple();
		colaSimple desc =new colaSimple();
		nivel.adicionar(raiz);
		while(!nivel.esVacia()){
			while(!nivel.esVacia()){
				Nodo x =nivel.eliminar();
				c++;
				if(x.getIzq()!=null){
					desc.adicionar(x.getIzq());
				}
				if(x.getDer()!=null){
					desc.adicionar(x.getDer());
				}
			}
			nivel.vaciar(desc);
		}
		return c;
	}
	void Hojas(Nodo R){
		if(R!=null){
		   if(R.getIzq()==null && R.getDer()==null ){
			   R.getA().mostrar();
		   }
		   Hojas(R.getIzq());
		   Hojas(R.getDer());
		}
	}
	int nroHojas(Nodo R){
		if(R!=null){
			int c=0;
			c=nroHojas(R.getIzq())+nroHojas(R.getDer());
			if(R.getIzq()==null && R.getDer()==null){
				c++;
			}
			return c;
			
		}else{
			return 0;
		}
	}

	
	
	

}
