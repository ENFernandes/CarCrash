package org.academiadecodigo.carcrash.cars;

public class CarFactory {

    public static Car getNewCar() {
        Car v = new Bois();
        Car r = new Vaca();

        r.equals(v);

        Car[] aCar = {v,r};
        int i = (int)(Math.random()*2);
        return aCar[i];
    }
}
