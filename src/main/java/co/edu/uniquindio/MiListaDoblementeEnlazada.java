package co.edu.uniquindio;

public class MiListaDoblementeEnlazada<T> {
    private NodoDoble<T> cabeza;
    private NodoDoble<T> cola;
    private int tamanio;

    public MiListaDoblementeEnlazada() {
        cabeza = null;
        cola = null;
        tamanio = 0;
    }

    //TAD Mostrar
    @Override
    public String toString() {
        NodoDoble<T> actual = cabeza; StringBuilder lista = new StringBuilder(); lista.append("[");
        if(cabeza != null) {
            while (actual.getSiguiente() != null) {
                lista.append(actual).append(", ");
                actual = actual.getSiguiente();
            }
        }
        lista.append(actual).append("]");
        return lista.toString();
    }

    //TAD Insersión
    public void agregar(T elemento) {
        NodoDoble<T> nuevoNodo = new NodoDoble<>(elemento);
        if(cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            tamanio++;
            return;
        }

        cola.setSiguiente(nuevoNodo);
        nuevoNodo.setAnterior(cola);
        cola = nuevoNodo;
        tamanio++;
    }

    public void agregarAlInicio(T elemento) {
        NodoDoble<T> nuevoNodo = new NodoDoble<>(elemento);

        if(cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            tamanio++;
            return;
        }
        nuevoNodo.setSiguiente(cabeza);
        cabeza.setAnterior(nuevoNodo);
        cabeza = nuevoNodo;
        tamanio++;
    }

    public void agregarEnPosicion(T elemento, int posicion) {
        if(posicion <= tamanio && posicion >= 0) {

            if(posicion == 0) {
                agregarAlInicio(elemento);
                return;
            }

            if(posicion == tamanio) {
                agregar(elemento);
                return;
            }

            NodoDoble<T> nuevoNodo = new NodoDoble<>(elemento);
            NodoDoble<T> actual = cabeza;
            for(int i = 0; i < posicion; i++) {
                actual = actual.getSiguiente();
            }
            actual.getAnterior().setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(actual.getAnterior());
            actual.setAnterior(nuevoNodo);
            nuevoNodo.setSiguiente(actual);

            tamanio++;

        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    //TAD Obtener
    public T obtener(int posicion) {
        T elemento = null;

        if(posicion < tamanio && posicion >= 0) {

            NodoDoble<T> actual = cabeza;

            for(int i = 0; i < posicion; i++) {
                actual = actual.getSiguiente();
            }

            elemento = actual.getElemento();
        } else {
            throw new IndexOutOfBoundsException();
        }

        return elemento;
    }

    public T obtenerPrimero() {
        T elemento = null;

        if(cabeza != null) {
            elemento = cabeza.getElemento();
        }

        return elemento;
    }

    public T obtenerUltimo() {
        T elemento = null;

        if(cola != null) {
            elemento = cola.getElemento();
        }

        return elemento;
    }

    //TAD Eliminación
    public void eliminarPosicion(int posicion) {
        if(tamanio > 0) {
            if (posicion < tamanio && posicion >= 0) {

                if(posicion == 0) {
                    eliminarPrimero();
                    return;
                }

                if(posicion == tamanio - 1) {
                    eliminarUltimo();
                    return;
                }

                NodoDoble<T> actual = cabeza;
                for (int i = 0; i < posicion; i++) {
                    actual = actual.getSiguiente();
                }

                actual.getAnterior().setSiguiente(actual.getSiguiente());
                actual.getSiguiente().setAnterior(actual.getAnterior());
                tamanio--;

            } else {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    public void eliminar(T elemento) {
        if(tamanio > 0) {

            if(cabeza.getElemento().equals(elemento)) {
                eliminarPrimero();
                return;
            }

            if(cola.getElemento().equals(elemento)) {
                eliminarUltimo();
                return;
            }

            NodoDoble<T> actual = cabeza;
            while (actual.getSiguiente() != null) {

                if(actual.getElemento().equals(elemento)) {
                    actual.getAnterior().setSiguiente(actual.getSiguiente());
                    actual.getSiguiente().setAnterior(actual.getAnterior());
                    tamanio--;
                    break;
                }

                actual = actual.getSiguiente();
            }
        }
    }

    public void eliminarPrimero() {
        if(tamanio > 0) {
            cabeza = cabeza.getSiguiente();
            cabeza.setAnterior(null);
            tamanio--;
        }
    }

    public void eliminarUltimo() {
        if(tamanio > 0) {
            cola = cola.getAnterior();
            cola.setSiguiente(null);
            tamanio--;
        }
    }

    //TAD Buscar
    public boolean contiene(T elemento) {
        boolean contiene = false;

        if(tamanio > 0) {
            if(!cabeza.getElemento().equals(elemento)) {

                NodoDoble<T> actual = cabeza;
                while(actual.getSiguiente() != null) {

                    if(actual.getElemento().equals(elemento)) {
                        contiene = true;
                        break;
                    }
                }
                actual = actual.getSiguiente();

            } else {
                contiene = true;
            }
        }

        return contiene;
    }

    public int buscar(T elemento) {
        int posicion = -1;

        if(tamanio > 0) {
            if(!cabeza.getElemento().equals(elemento)) {

                NodoDoble<T> actual = cabeza;
                for(int i = 0; i < tamanio; i++) {

                    if(actual.getElemento().equals(elemento)) {
                        posicion = i;
                        break;
                    }
                }

            } else {
                posicion = 0;
            }
        }

        return posicion;
    }

    public int getTamanio() {
        return tamanio;
    }
}
