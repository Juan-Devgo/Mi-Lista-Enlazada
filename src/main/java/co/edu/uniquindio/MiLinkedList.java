package co.edu.uniquindio;

public class MiLinkedList<T> {
    private Nodo<T> cabeza;
    private int tamanio;

    public MiLinkedList() {
        cabeza = null;
        tamanio = 0;
    }

    //TAD Mostrar

    @Override
    public String toString() {
        Nodo<T> nodoRecorrido = cabeza; StringBuilder lista = new StringBuilder(); lista.append("[");
        if(cabeza != null) {
            while (nodoRecorrido.getSiguiente() != null) {
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
        if (cabeza != null) {
            Nodo<T> nodoRecorrido = cabeza;
            while (nodoRecorrido.getSiguiente() != null) {
                nodoRecorrido = nodoRecorrido.getSiguiente();
            }
            nodoRecorrido.setSiguiente(nuevoNodo);
            tamanio++;
            return;
        }

        cabeza = nuevoNodo;
        tamanio++;
    }

    public void agregarAlInicio(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        nuevoNodo.setSiguiente(cabeza);
        cabeza = nuevoNodo;
        tamanio++;
    }

    public void agregarEnPosicion(T elemento, int posicion) {
        if(tamanio > posicion && posicion >= 0) {

            Nodo<T> nuevoNodo = new Nodo<>(elemento);

            if(posicion == 0){
                nuevoNodo.setSiguiente(cabeza);
                cabeza = nuevoNodo;
                tamanio++;
                return;
            }

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

            Nodo<T> nodoRecorrido = cabeza;

            while (nodoRecorrido.getSiguiente() != null) {
                nodoRecorrido = nodoRecorrido.getSiguiente();
            }

            elemento = nodoRecorrido.getElemento();
        }
        return elemento;
    }

    //TAD Eliminación

    public void eliminar(int posicion) {
        if(tamanio > 0) {
            if (tamanio > posicion && posicion >= 0) {

                if (posicion == 0) {
                    cabeza = cabeza.getSiguiente();
                    tamanio--;
                    return;
                }

                Nodo<T> nodoRecorrido = cabeza;
                for (int i = 0; i < posicion - 1; i++) {
                    nodoRecorrido = nodoRecorrido.getSiguiente();
                }

                nodoRecorrido.setSiguiente(nodoRecorrido.getSiguiente().getSiguiente());
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
                tamanio--;
            }

            Nodo<T> nodoRecorrido = cabeza;
            while (nodoRecorrido.getSiguiente() != null) {
                if(elemento.equals(nodoRecorrido.getSiguiente().getElemento())) {
                    nodoRecorrido.setSiguiente(nodoRecorrido.getSiguiente().getSiguiente());
                    tamanio--;
                    break;
                }
                nodoRecorrido = nodoRecorrido.getSiguiente();
            }

        }
    }

    public void eliminarPrimero() {
        if(tamanio > 0) {
            cabeza = cabeza.getSiguiente();
            tamanio--;
        }
    }

    public void eliminarUltimo() {
        if(tamanio > 0) {

            Nodo<T> nodoRecorrido = cabeza;
            while (nodoRecorrido.getSiguiente().getSiguiente() != null) {
                nodoRecorrido = nodoRecorrido.getSiguiente();
            }

            nodoRecorrido.setSiguiente(null);
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
        if(tamanio > 0) {

            if (cabeza.getElemento().equals(elemento)) {

                contiene = true;

            } else {
                Nodo<T> nodoRecorrido = cabeza;

                while (nodoRecorrido.getSiguiente() != null) {

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
