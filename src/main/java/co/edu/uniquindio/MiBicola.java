package co.edu.uniquindio;

public class MiBicola<T> extends MiCola<T> {

    public MiBicola() {
        tamanio = 0;
        cabeza = null;
        cola = null;
    }

    //TAD Agregar al inicio
    public void encolarCabeza(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        if(esVacia()) {
            cola = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(cabeza);
        }
        cabeza = nuevoNodo;
        tamanio++;
    }

    //TAD Obtener último elemento (sin eliminar)
    public T obtenerCola() {
        T elemento = null;
        if(!esVacia()) {
            elemento = cola.getElemento();
        }
        return elemento;
    }

    //TAD Sacar último elemento (eliminando el elemento)
    public T sacarCola() {
        T elemento = null;
        if(!esVacia()) {
            elemento = cola.getElemento();
            desencolarCola();
        }
        return elemento;
    }

    //TAD Quitar el último elemento
    public void desencolarCola() {
        if(!esVacia()) {
            Nodo<T> actual = cabeza;
            while(!actual.getSiguiente().equals(cola)) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(null);
            cola = actual;
            tamanio--;
        }
    }
}