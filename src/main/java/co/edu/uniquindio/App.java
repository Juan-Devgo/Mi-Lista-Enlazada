package co.edu.uniquindio;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        //Creación de la listaCircular
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$ Lista Simple $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
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
        //Creación de la listaCircular circular
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

    }
}