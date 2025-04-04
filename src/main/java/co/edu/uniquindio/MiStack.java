package co.edu.uniquindio;

public class MiStack<T> {
    private int tamanio;
    private Nodo<T> cima;

    public MiStack() {
        tamanio = 0;
        cima = null;
    }

    //TAD Mostrar
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if(!esVacio()) {
            Nodo<T> actual = cima;
            while(actual.getSiguiente() != null) {
                sb.append(actual).append(", ");
                actual = actual.getSiguiente();
            }
            sb.append(actual);
        } else {
            sb.append(" ");
        }
        sb.append("]");

        return sb.toString();
    }

    //TAD Verificar es Vacío
    public boolean esVacio() {
        return cima == null;
    }

    //TAD Agregar a la cima (push)
    public void insertar(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);

        nuevoNodo.setSiguiente(cima);
        cima = nuevoNodo;
        tamanio++;
    }

    //TAD Quitar de la cima
    public void eliminarCima() {
        if(!esVacio()) {
            cima = cima.getSiguiente();
            tamanio--;
        }
    }

    //TAD Obtener la cima y quitarlo
    public T sacarCima() {
        T elemento = null;
        if(!esVacio()) {
            elemento = cima.getElemento();
            cima = cima.getSiguiente();
            tamanio--;
        }
        return elemento;
    }


    //TAD Obtener la cima sin quitarlo
    public T obtenerCima() {
        T elemento = null;
        if(!esVacio()) {
            elemento = cima.getElemento();
        }
        return elemento;
    }

}
