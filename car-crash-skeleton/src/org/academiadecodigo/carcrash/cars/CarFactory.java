package org.academiadecodigo.carcrash.cars;

public class CarFactory {

    public static Car getNewCar() {
        Volvo v = new Volvo();
        Renault r = new Renault();
        Car[] aCar = {v,r};
        int i = (int)(Math.random()*2);
        return v;
    }
}
