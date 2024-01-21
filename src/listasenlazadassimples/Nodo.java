package listasenlazadassimples;

public class Nodo {

    private Object dato;
    private Nodo siguiente;

    public Nodo(Object dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    

    public Object getdato() {
        return dato;
    }

    public void setdato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setsiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
