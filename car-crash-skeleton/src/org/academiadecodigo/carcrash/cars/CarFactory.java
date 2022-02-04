package org.academiadecodigo.carcrash.cars;

public class CarFactory {

    public static Car getNewCar() {
        V v = new V();
        R r = new R();

        r.equals(v);

        Car[] aCar = {v,r};
        int i = (int)(Math.random()*2);
        return aCar[i];
    }
}
