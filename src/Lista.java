import listaencadenadasimples.Nodo;

public class Lista {

	Nodo cab;
    int indor;
    public Lista(){
        cab=null;
        indor=0;
    }

    public void crear(int[] datos, int n){
    Nodo ant=null, nuevo;
        for(int i=0;i<n;i++){
            if(cab==null){
            cab=new Nodo(datos[i]);
            ant=cab;
            cab.ant=null;
            }
            else{
            nuevo=new Nodo(datos[i]);
            ant.sig=nuevo;
            nuevo.ant=ant;
            ant=nuevo;
            
            }
        }
    }

    
    public boolean modificar(int dato, int cambio){
    Nodo b=cab;
    while(b!=null){
        if(b.info==dato){
            b.info=cambio;
            return true;
        }
        b=b.sig;
    }
    return false;
    }

    
    public boolean eliminar(int dato){
    Nodo p = cab;
    Nodo ant = null;

    while (p != null && p.info != dato) {
        ant = p;
        p = p.sig;
    }

    if (p == null) {
    	System.out.println("No se encontro el dato en la lista");
    }
    else {
    	if (p == cab) {
            cab = p.sig;
            if (cab != null) {
                cab.ant = null;
            }
        } else {
            ant.sig = p.sig;
            if (p.sig != null) {
                p.sig.ant = ant;
            }
        }
    }

    
    return false;
}

    
    public void mostrar(){
        Nodo p=cab;
        while(p!=null){
            System.out.println(p.info+", ");
            p=p.sig;
        }
    }

    
    public void ordenar(){
        Nodo p=cab,ant,sig;
        int aux,indOrd;
        while(p!=null){
            sig=cab.sig;
            ant=cab;
                while(sig!=null){
                    if(ant.info>sig.info){
                        aux=ant.info;
                        ant.info=sig.info;
                        sig.info=aux;
                    }
                    sig=sig.sig;
                    ant=ant.sig;
            }
        p=p.sig; 
        
        }
    }

    
        public boolean insertar(int dato, int pos) {
        Nodo nuevo = new Nodo(dato);
        if (pos == 0) {
        	nuevo.ant=null;
            nuevo.sig = cab;
            cab.ant = nuevo;
            cab = nuevo;
        } else {
            Nodo p = cab;
            int cont = 0;
            while (p != null && cont < pos ) {
                p = p.sig;
                cont++;
            }
            if (p.sig == null) {
                //nuevo.sig = p.sig;
                nuevo.ant = p;
                nuevo.sig=null;
                p.sig = nuevo;
                return true;
            }
            
            if (p.sig != null) {
            	Nodo nuevo2 = new Nodo(dato);
            	nuevo2.sig=p.sig;
            	p.sig=nuevo;
            	nuevo.ant=p;
            	nuevo.sig=nuevo2.sig;
            	
                //nuevo.sig.ant = nuevo;
            }
        }
        return false;
    }
        
    public boolean indicadorOrd(){
    Nodo d=cab;
    if(d!=null){
        return true;
    }
    return false;
    }

}
