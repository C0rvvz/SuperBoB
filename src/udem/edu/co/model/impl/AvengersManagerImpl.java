package udem.edu.co.model.impl;

import udem.edu.co.model.AvengerManager;

public class AvengersManagerImpl implements AvengerManager {
    private AvengerImpl[] avengersImpl = new AvengerImpl[10];
    private int contador = 0;

    // Agregar Avenger
    public void agregarAvenger(AvengerImpl avengerImpl) {
        if (contador < avengersImpl.length) {
            avengersImpl[contador++] = avengerImpl;
        } else {
            System.out.println("No se puede agregar más Avengers. Capacidad máxima alcanzada.");
        }
    }

    // Obtener lista de Avengers
    public String obtenerListaAvengers() {
        StringBuilder listaAvengers = new StringBuilder();
        if (contador == 0) {
            listaAvengers.append("No hay Avengers para mostrar.");
        } else {
            listaAvengers.append("=== Lista de Avengers ===\n");
            for (int i = 0; i < contador; i++) {
                listaAvengers.append((i + 1)).append(". Nombre: ").append(avengersImpl[i].getNombre()).append(", Poder: ").append(avengersImpl[i].getPoder()).append("\n");
            }
        }
        return listaAvengers.toString();
    }
}
