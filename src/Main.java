public class Main {
    public static void main(String[] args) {
        Modulo login = new Modulo();
        login.nombre = "Login";
        login.lenguaje = "Java";
        login.version = "1.0.0";
        login.terminado = true;

        Modulo inventario = new Modulo();
        inventario.nombre = "Inventario";
        inventario.lenguaje = "Java";
        inventario.version = "0.5.2";
        inventario.terminado = false;

        Modulo reportes = new Modulo();
        reportes.nombre = "Reportes";
        reportes.lenguaje = "Python";
        reportes.version = "0.1.0";
        reportes.terminado = false;

        login.mostrarInformacion();
        System.out.println();

        inventario.mostrarInformacion();
        inventario.marcarTerminado(); 
        inventario.mostrarEstado();
        System.out.println();

        reportes.mostrarInformacion();
    }
}