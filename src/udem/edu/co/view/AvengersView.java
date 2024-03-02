package udem.edu.co.view;
import java.util.Scanner;
import udem.edu.co.model.Avenger;
import udem.edu.co.model.impl.AvengerImpl;

public class AvengersView {
    private Scanner scanner;

    public AvengersView() {
        this.scanner = new Scanner(System.in);
    }

    // Mostrar menú
    public int mostrarMenu() {
        System.out.println("=== Menú de los Avengers ===");
        System.out.println("1. Mostrar todos los Avengers");
        System.out.println("2. Agregar un nuevo Avenger");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    // Obtener datos de un nuevo Avenger
    public Avenger obtenerNuevoAvenger() {
        scanner.nextLine(); // Limpiar el buffer de entrada
        System.out.print("Ingrese el nombre del Avenger: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el poder del Avenger: ");
        String poder = scanner.nextLine();
        return new AvengerImpl(nombre, poder);
    }

    // Mostrar mensajes
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}