package co.edu.uniquindio;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        //Creación de la lista
        MiLinkedList<String> lista = new MiLinkedList<>();

        //Pruebas de Insersión
        lista.agregarAlInicio("hola xd");
        lista.agregar("chao dx");
        lista.agregarEnPosicion("Hey", 1);
        lista.agregarAlInicio("Hola");

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
    }
}