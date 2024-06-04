package laboratorio;

public class index {

	public static void main(String[] args) {
		AB_Normal b= new AB_Normal();
		Nodo r = new Nodo();
		b.setRaiz(r);
		b.crear(b.getRaiz());
		System.out.println("preorden");
		b.PreOrden(r);
		System.out.println("inorden");
		b.InOrden(r);
		System.out.println("postorden");
		b.PostOrden(r);

	}

}
