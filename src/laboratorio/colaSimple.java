package laboratorio;
public class colaSimple extends ColaEst{
    public
        colaSimple(){
            super();
        }
        boolean esVacia(){
            return fi == fr;
        }
        boolean esLlena(){
            return fi == max-1;
        }
        void adicionar(Nodo elemento){
            if(esLlena()){
                System.out.println("Cola Llena!!");
            }else{
                fi++;
                v[fi] = elemento;
            }
        }
        Nodo eliminar(){
            Nodo elemento = null;
            if(esVacia()){
                System.out.println("Cola Vacia!!");
            }else{
                fr++;
                elemento = v[fr];
            }
            return elemento;
        }
        int nroElementos(){
            return (fi - fr);
        }
        void vaciar(colaSimple cS){
            while (!cS.esVacia()) {
                adicionar(cS.eliminar());
            }
        }
        // void Llenar(int n){
        //     for(int i = 0; i< n; i++){
        //         String x = new String();
        //         x.leer();
        //         adicionar(x);
        //     }
        // }
        void mostrar(){
            colaSimple aux = new colaSimple();
            Nodo elemento = null ;
            System.out.println("\033[0;34m" + "\n---------------DATOS COLA-----------------" + "\033[0m");
            while (!esVacia()) {
                elemento = eliminar();
                System.out.println(elemento);
                aux.adicionar(elemento);
            }
            System.out.println("\033[0;34m" + "--------------------------------------------" + "\033[0m");
            vaciar(aux);
        }
        void eliminarDatosMedio(){
            colaSimple aux = new colaSimple();
            Nodo elemento = null ;
            int posicionPar1=0, posicionPar2=0, posicionImpar=0, co=0;
            int nroElemntos = nroElementos();
            if(nroElemntos % 2 == 0){
                posicionPar1 = nroElemntos/2;
                posicionPar2 = (nroElemntos/2)+1;
            }else{
                posicionImpar = (nroElemntos/2)+1;
            }
            while (!esVacia()) {
                elemento = eliminar();
                co++;
                if(nroElemntos % 2 == 0){
                    if(co != posicionPar1 && co != posicionPar2){
                        aux.adicionar(elemento);
                    }
                }else{
                    if(co != posicionImpar){
                        aux.adicionar(elemento);
                    }
                }
            }
            vaciar(aux);
        }


}
