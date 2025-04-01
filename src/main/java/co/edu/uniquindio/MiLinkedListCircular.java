package co.edu.uniquindio;

public class MiLinkedListCircular<T> {
    private Nodo<T> cabeza;
    private Nodo<T> cola;
    private int tamanio;

    public MiLinkedListCircular() {
        cabeza = null;
        cola = null;
        tamanio = 0;
    }

    //TAD Mostrar

    @Override
    public String toString() {
        Nodo<T> nodoRecorrido = cabeza; StringBuilder lista = new StringBuilder(); lista.append("[");
        if(cabeza != null) {

            for (int i = 0; i < tamanio - 1; i++) {
                lista.append(nodoRecorrido).append(", ");
                nodoRecorrido = nodoRecorrido.getSiguiente();
            }
            lista.append(nodoRecorrido);
        } else {
            lista.append(" ");
        }
        lista.append("]");
        return lista.toString();
    }

    //TAD Insersión

    public void agregar(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        if (cabeza != null && cola != null) {
            cola.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(cabeza);
            cola = nuevoNodo;
            tamanio++;
            return;
        }

        cabeza = nuevoNodo;
        cola = nuevoNodo;
        cola.setSiguiente(cabeza);
        tamanio++;
    }

    public void agregarAlInicio(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);

        if(cabeza != null && cola != null) {
            nuevoNodo.setSiguiente(cabeza);
            cabeza = nuevoNodo;
            cola.setSiguiente(cabeza);
            tamanio++;
            return;
        }

        cabeza = nuevoNodo;
        cola = nuevoNodo;
        cola.setSiguiente(cabeza);
        tamanio++;
    }

    public void agregarEnPosicion(T elemento, int posicion) {
        if(tamanio >= posicion && posicion >= 0) {

            if(posicion == 0){
                agregarAlInicio(elemento);
                return;
            }

            if(posicion == tamanio){
                agregar(elemento);
                return;
            }

            Nodo<T> nuevoNodo = new Nodo<>(elemento);
            Nodo<T> nodoRecorrido = cabeza;

            for (int i = 0; i < posicion - 1; i++) {
                nodoRecorrido = nodoRecorrido.getSiguiente();
            }

            nuevoNodo.setSiguiente(nodoRecorrido.getSiguiente());
            nodoRecorrido.setSiguiente(nuevoNodo);
            tamanio++;

        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    //TAD Obtener

    public T obtener(int posicion) {

        T elemento = null;

        if(tamanio != 0) {
            if (tamanio > posicion && posicion >= 0) {

                Nodo<T> nodoRecorrido = cabeza;

                for (int i = 0; i < posicion; i++) {
                    nodoRecorrido = nodoRecorrido.getSiguiente();
                }

                elemento = nodoRecorrido.getElemento();

            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        return elemento;
    }

    public T obtenerPrimero() {

        T elemento = null;

        if(tamanio != 0){
            elemento = cabeza.getElemento();
        }

        return elemento;
    }

    public T obtenerUltimo() {

        T elemento = null;

        if(tamanio != 0) {
            elemento = cola.getElemento();
        }

        return elemento;
    }

    //TAD Eliminación

    public void eliminar(int posicion) {
        if(tamanio > 0) {
            if (tamanio > posicion && posicion >= 0) {

                if (posicion == 0) {
                    cabeza = cabeza.getSiguiente();
                    cola.setSiguiente(cabeza);
                    tamanio--;
                    return;
                }


                Nodo<T> nodoRecorrido = cabeza;
                for (int i = 0; i < posicion - 1; i++) {
                    nodoRecorrido = nodoRecorrido.getSiguiente();
                }

                nodoRecorrido.setSiguiente(nodoRecorrido.getSiguiente().getSiguiente());

                if(posicion == tamanio - 1){
                    cola = nodoRecorrido;
                }
                tamanio--;


            } else {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    public void eliminar(T elemento) {
        if(tamanio > 0) {

            if(cabeza.getElemento().equals(elemento)) {
                cabeza = cabeza.getSiguiente();
                cola.setSiguiente(cabeza);
                tamanio--;
                return;
            }

            Nodo<T> nodoRecorrido = cabeza;
            while (!nodoRecorrido.getSiguiente().equals(cabeza)) {
                if(elemento.equals(nodoRecorrido.getSiguiente().getElemento())) {
                    nodoRecorrido.setSiguiente(nodoRecorrido.getSiguiente().getSiguiente());
                    tamanio--;

                    if(nodoRecorrido.getSiguiente().equals(cabeza)){
                        cola = nodoRecorrido;
                    }
                }
            }
        }
    }

    public void eliminarPrimero() {
        if(tamanio > 0) {
            cabeza = cabeza.getSiguiente();
            cola.setSiguiente(cabeza);
            tamanio--;
        }
    }

    public void eliminarUltimo() {
        if(tamanio > 0) {

            Nodo<T> nodoRecorrido = cabeza;
            while (!nodoRecorrido.getSiguiente().getSiguiente().equals(cabeza)) {
                nodoRecorrido = nodoRecorrido.getSiguiente();
            }

            cola = nodoRecorrido;
            nodoRecorrido.setSiguiente(cabeza);
            tamanio--;
        }
    }

    //TAD Buscar

    public int buscar(T elemento) {

        int pos = -1;
        if(tamanio > 0){

            Nodo<T> nodoRecorrido = cabeza;
            for (int i = 0; i < tamanio; i++) {

                if(nodoRecorrido.getElemento().equals(elemento)) {
                    pos = i;
                    break;
                }

                nodoRecorrido = nodoRecorrido.getSiguiente();
            }
        }

        return pos;
    }

    public boolean contiene(T elemento) {

        boolean contiene = false;
        if(tamanio > 0){

            if(cabeza.getElemento().equals(elemento)) {

                contiene = true;

            }else {
                Nodo<T> nodoRecorrido = cabeza;
                while (!nodoRecorrido.getSiguiente().equals(cabeza)) {

                    if (nodoRecorrido.getElemento().equals(elemento)) {
                        contiene = true;
                        break;
                    }

                    nodoRecorrido = nodoRecorrido.getSiguiente();
                }
            }
        }

        return contiene;
    }

    public int getTamanio() {
        return tamanio;
    }
}