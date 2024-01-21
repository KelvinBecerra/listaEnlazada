package listasenlazadassimples;

public class listaEnlazada {

    private Nodo cabeza;
    private int contador;

    public listaEnlazada() {
        this.cabeza = null;
        this.contador = 0;
    }

    public boolean isempty() {
        return getcabeza() == null;
    }

    public void Agregarprincipio(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (isempty()) {
            setcabeza(nuevo);

        } else {
            nuevo.setsiguiente(getcabeza());
            setcabeza(nuevo);
        }

        contador++;

    }

    public Nodo eliminarinicio() {
        if (isempty()) {
            System.out.println("lista vacia");
            return null;
        } else {
            Nodo head = new Nodo(getcabeza());
            Nodo secondcabeza = getcabeza().getSiguiente();
            //nextcabeza.getSiguiente();
            setcabeza(secondcabeza);
            head.setsiguiente(null);
            contador--;
            return head;
        }
    }

    public void Agregarfinal(Object dato) {
        Nodo nuevo = new Nodo(dato);

        if (isempty()) {
            setcabeza(nuevo);
            contador++;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setsiguiente(nuevo);
            contador++;

        }

    }

    

    public void eliminarfinal(){
        if (isempty()){
            System.out.println("lista vacia");
        }else{
            Nodo temp=getcabeza();
            while(temp.getSiguiente().getSiguiente()!=null){
                temp=temp.getSiguiente();
            }
            temp.setsiguiente(null);
            contador--;
        }
        
    }

    public void mostrarlista() {
        Nodo actual = getcabeza();
        if (isempty()) {
            System.out.println("la lista esta vacia");
        } else {
            while (actual != null) {
                System.out.print("[" + actual.getdato() + "]");
                actual = actual.getSiguiente();
            }
            System.out.println("");
        }

    }

    public void insertarIndice(int indice, Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (isempty() || indice == 0) {
            Agregarprincipio(dato);

        } else {
            if (getcontador() > indice - 1) {
                Nodo actual = getcabeza();
                int cont = 0;
                while (cont < indice - 2) {
                    actual = actual.getSiguiente();
                    cont++;
                }
                Nodo temporal = actual.getSiguiente();
                nuevo.setsiguiente(temporal);
                actual.setsiguiente(nuevo);
                contador++;
            } else if (indice == getcontador()) {
                Agregarfinal(dato);
            } else {
                System.out.println("Error de indice");
            }

        }

    }

    public Nodo eliminarindice(int indice) {
        if (isempty()) {
            System.out.println("lista vacia, no hay nada para eliminar");
            return null;
        } else if (indice == 0) {

            return eliminarinicio();
        } else if (getcontador() > indice) {
            int cont = 0;
            Nodo actual = getcabeza();

            while (cont < indice - 1) {//actual es diferente de nulo? y es menor que el contador?
                actual = actual.getSiguiente();//se mueve a la siguiente
                cont++;

            }
            Nodo nodoeliminar = actual.getSiguiente();
            actual.setsiguiente(nodoeliminar.getSiguiente());
            nodoeliminar.setsiguiente(null);
            contador--;
            return nodoeliminar;
        } else {
            System.out.println("inidice no valido");
            return null;
        }

    }

    public Nodo getcabeza() {
        return cabeza;

    }

    public void setcabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public int getcontador() {
        return contador;

    }

    public void setcontador(int contador) {
        this.contador = contador;
    }
}
