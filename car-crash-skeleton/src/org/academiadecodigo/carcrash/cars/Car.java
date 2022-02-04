package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

import java.util.Objects;
abstract  public class Car {
    /** The position of the car on the grid */

    private Position pos=new Position();
    private boolean isCrashed=false;
    public Position getPos() {
        return pos;
    }
    public boolean isCrashed() {
        return isCrashed;
    }

    public void setCrashed(boolean crashed) {
        isCrashed = crashed;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return isCrashed() == car.isCrashed() && Objects.equals(getPos(), car.getPos());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getPos(), isCrashed());
    }
}

