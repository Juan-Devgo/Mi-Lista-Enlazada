package co.edu.uniquindio;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$ Lista Simple $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        //Creación de la Lista Simple
        MiLinkedList<String> lista = new MiLinkedList<>();

        //Pruebas de Insersión
        lista.agregarAlInicio("1");
        lista.agregar("3");
        lista.agregarEnPosicion("2", 1);
        lista.agregarAlInicio("0");
        lista.agregarAlInicio("-1");

        //Prueba de Muestra de los Datos
        System.out.println(lista);

        //Prueba de Obtención de los Datos
        System.out.println(lista.obtener(2));
        System.out.println(lista.obtenerPrimero());
        System.out.println(lista.obtenerUltimo());

        //Prueba de Eliminación de Datos
        lista.eliminar(1);
        System.out.println(lista);

        lista.eliminarPrimero();
        System.out.println(lista);

        lista.eliminarUltimo();
        System.out.println(lista);

        lista.eliminar("1");
        System.out.println(lista);

        //Prueba de Búsqueda
        System.out.println(lista.contiene("1"));
        System.out.println(lista.contiene("2"));

        lista.agregarAlInicio("1");
        lista.agregar("4");

        System.out.println(lista);

        System.out.println(lista.buscar("5"));
        System.out.println(lista.buscar("4"));


        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$ Lista Circular $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        //Creación de la Lista Circular
        MiLinkedListCircular<String> listaCircular = new MiLinkedListCircular<>();

        //Pruebas de Insersión
        listaCircular.agregarAlInicio("1");
        listaCircular.agregar("3");
        listaCircular.agregarEnPosicion("2", 1);
        listaCircular.agregarAlInicio("0");
        listaCircular.agregarAlInicio("-1");


        //Prueba de Muestra de los Datos
        System.out.println(listaCircular);

        //Prueba de Obtención de los Datos
        System.out.println(listaCircular.obtener(2));
        System.out.println(listaCircular.obtenerPrimero());
        System.out.println(listaCircular.obtenerUltimo());

        //Prueba de Eliminación de Datos
        listaCircular.eliminar(1);
        System.out.println(listaCircular);

        listaCircular.eliminarPrimero();
        System.out.println(listaCircular);

        listaCircular.eliminarUltimo();
        System.out.println(listaCircular);

        listaCircular.eliminar("1");
        System.out.println(listaCircular);

        //Prueba de Búsqueda
        System.out.println(listaCircular.contiene("1"));
        System.out.println(listaCircular.contiene("2"));

        listaCircular.agregarAlInicio("1");
        listaCircular.agregar("3");

        System.out.println(listaCircular);

        System.out.println(listaCircular.buscar("4"));
        System.out.println(listaCircular.buscar("1"));

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$ Lista Doblemente Enlazada $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        //Creación de la listaDoble circular
        MiListaDoblementeEnlazada<String> listaDoble = new MiListaDoblementeEnlazada<>();

        //Pruebas de Insersión
        listaDoble.agregarAlInicio("1");
        listaDoble.agregar("3");
        listaDoble.agregarEnPosicion("2", 1);
        listaDoble.agregarAlInicio("0");
        listaDoble.agregarAlInicio("-1");


        //Prueba de Muestra de los Datos
        System.out.println(listaDoble);

        //Prueba de Obtención de los Datos
        System.out.println(listaDoble.obtener(2));
        System.out.println(listaDoble.obtenerPrimero());
        System.out.println(listaDoble.obtenerUltimo());

        //Prueba de Eliminación de Datos
        listaDoble.eliminarPosicion(1);
        System.out.println(listaDoble);

        listaDoble.eliminarPrimero();
        System.out.println(listaDoble);

        listaDoble.eliminarUltimo();
        System.out.println(listaDoble);

        listaDoble.eliminar("1");
        System.out.println(listaDoble);

        //Prueba de Búsqueda
        System.out.println(listaDoble.contiene("1"));
        System.out.println(listaDoble.contiene("2"));

        listaDoble.agregarAlInicio("1");
        listaDoble.agregar("3");

        System.out.println(listaDoble);

        System.out.println(listaDoble.buscar("4"));
        System.out.println(listaDoble.buscar("1"));

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$ Cola $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        //Creación de la cola
        MiCola<Integer> cola = new MiCola<>();

        //Verificar si tiene elementos
        System.out.println(cola.esVacia());

        //Pruebas de Insersión
        cola.encolarCola(1);
        cola.encolarCola(2);
        cola.encolarCola(3);
        cola.encolarCola(4);
        cola.encolarCola(5);

        //Verificar si tiene elementos
        System.out.println(cola.esVacia());

        //Pruebas de Muestra de los Datos
        System.out.println(cola);

        //Prubas de Obtención de los Datos
        System.out.println(cola.obtenerPrimerElemento());
        System.out.println(cola.obtenerPrimerElemento());
        System.out.println(cola.sacarPrimerElemento());
        System.out.println(cola.sacarPrimerElemento());
        System.out.println(cola.sacarPrimerElemento());

        System.out.println(cola);

        //Pruebas de Eliminación de Datos
        cola.desencolarCabeza();
        System.out.println(cola);

        cola.desencolarCabeza();
        System.out.println(cola);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$ Bicola $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        //Creación de la cola
        MiBicola<Integer> bicola = new MiBicola<>();

        //Verificar si tiene elementos
        System.out.println(bicola.esVacia());

        //Pruebas de Insersión

        bicola.encolarCola(3);
        bicola.encolarCola(4);
        bicola.encolarCola(5);
        bicola.encolarCabeza(2);
        bicola.encolarCabeza(1);
        bicola.encolarCola(6);

        //Verificar si tiene elementos
        System.out.println(bicola.esVacia());

        //Pruebas de Muestra de los Datos
        System.out.println(bicola);

        //Prubas de Obtención de los Datos
        System.out.println(bicola.obtenerPrimerElemento());
        System.out.println(bicola.obtenerUltimoElemento());
        System.out.println(bicola.sacarPrimerElemento());
        System.out.println(bicola.sacarPrimerElemento());
        System.out.println(bicola.sacarUltimoElemento());

        System.out.println(bicola);

        //Pruebas de Eliminación de Datos
        bicola.desencolarCabeza();
        System.out.println(bicola);

        bicola.desencolarCola();
        System.out.println(bicola);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$ Pila/Stack $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        //Creación de la cola
        MiStack<Integer> stack = new MiStack<>();

        //Verificar si tiene elementos
        System.out.println(stack.esVacio());

        //Pruebas de Insersión
        stack.insertar(1);
        stack.insertar(2);
        stack.insertar(3);
        stack.insertar(4);
        stack.insertar(5);

        //Verificar si tiene elementos
        System.out.println(stack.esVacio());

        //Pruebas de Muestra de los Datos
        System.out.println(stack);

        //Prubas de Obtención de los Datos
        System.out.println(stack.obtenerCima());
        System.out.println(stack.obtenerCima());
        System.out.println(stack.sacarCima());
        System.out.println(stack.sacarCima());
        System.out.println(stack.sacarCima());

        System.out.println(stack);

        //Pruebas de Eliminación de Datos
        stack.eliminarCima();
        System.out.println(stack);

        stack.eliminarCima();
        System.out.println(stack);
    }
}