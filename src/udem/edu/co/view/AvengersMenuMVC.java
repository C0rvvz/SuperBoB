package udem.edu.co.view;

import udem.edu.co.controller.impl.AvengersControllerImpl;

public class AvengersMenuMVC {
    public static void main(String[] args) {
        AvengersView avengersView = new AvengersView();
        AvengersControllerImpl avengersControllerImpl = new AvengersControllerImpl(avengersView);
        avengersControllerImpl.iniciar();
    }
}
