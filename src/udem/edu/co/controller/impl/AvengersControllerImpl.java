package udem.edu.co.controller.impl;

import udem.edu.co.controller.AvengersController;
import udem.edu.co.model.Avenger;
import udem.edu.co.model.impl.AvengerImpl;
import udem.edu.co.model.impl.AvengersManagerImpl;
import udem.edu.co.view.AvengersView;

public class AvengersControllerImpl implements AvengersController {
    private AvengersView avengersView;
    private AvengersManagerImpl avengersManagerImpl;

    public AvengersControllerImpl(AvengersView avengersView) {
        this.avengersView = avengersView;
        this.avengersManagerImpl = new AvengersManagerImpl();
    }

    // Iniciar la aplicación
    public void iniciar() {
        int choice;
        do {
            choice = avengersView.mostrarMenu();
            switch (choice) {
                case 1:
                    mostrarAvengers();
                    break;
                case 2:
                    agregarAvenger();
                    break;
                case 3:
                    avengersView.mostrarMensaje("Saliendo del programa...");
                    break;
                default:
                    avengersView.mostrarMensaje("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (choice != 3);
    }

    // Mostrar Avengers
    private void mostrarAvengers() {
        avengersView.mostrarMensaje(avengersManagerImpl.obtenerListaAvengers());
    }

    // Agregar Avenger
    private void agregarAvenger() {
        Avenger nuevoAvenger = avengersView.obtenerNuevoAvenger();
        avengersManagerImpl.agregarAvenger((AvengerImpl) nuevoAvenger);
        avengersView.mostrarMensaje("Avenger agregado con éxito.");
    }
}
