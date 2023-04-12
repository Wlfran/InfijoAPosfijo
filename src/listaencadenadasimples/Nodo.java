package listaencadenadasimples;
/**
 * @author USUARIO
 */
public class Nodo {
    public int info;
    public Nodo sig;
	public Nodo ant;
    
    public Nodo(int info){
        this.info=info;
        this.sig=null;
        this.ant=null;
    }
}
