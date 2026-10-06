public class Modulo {

    public String nombre;
    public String lenguaje;

    String version;
    boolean terminado;

    public void mostrarInformacion() {
        System.out.println("--- MÓDULO DE SOFTWARE ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Lenguaje: " + lenguaje);
        System.out.println("Versión: " + version);
        System.out.println("Terminado: " + terminado);
    }

    public void marcarTerminado() {
        terminado = true;
        System.out.println("El módulo " + nombre + " ha sido marcado como terminado.");
    }

    void mostrarEstado() {
        System.out.println("El módulo " + nombre + " ¿está terminado?: " + terminado);
    }

    void mostrarVersion() {
        System.out.println("Versión actual de " + nombre + ": " + version);
    }
}