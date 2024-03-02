package udem.edu.co.model.impl;

import udem.edu.co.model.Avenger;

public class AvengerImpl implements Avenger {
    private String nombre;
    private String poder;

    public AvengerImpl(String nombre, String poder) {
        this.nombre = nombre;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

}
