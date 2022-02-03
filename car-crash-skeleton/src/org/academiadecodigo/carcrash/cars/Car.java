package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

abstract  public class Car {
    /** The position of the car on the grid */
    private Position pos ;
    public Position getPos() {
        pos=new Position();
        return pos;
    }
    public boolean isCrashed() {

        return true;
    }
    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
