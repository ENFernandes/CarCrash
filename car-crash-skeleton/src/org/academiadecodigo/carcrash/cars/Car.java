package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

import java.util.Objects;
abstract  public class Car {
    /** The position of the car on the grid */

    private Position pos=new Position();
    private boolean isCrashed=false;
    private int contP=8;
    private int i =0;
    private int lastI;
    public Position getPos() {
        return pos;
    }
    public boolean isCrashed() {
        return isCrashed;
    }

    public void setCrashed(boolean crashed) {
        isCrashed = crashed;

    }
    public void move() {
        int newmove=0;

        if(lastI==i)
        {
            contP++;
        }
        if(contP>10) {
            i = (int) (Math.random() * 4);
            contP=0;
        }
        else i=lastI;
        switch (i) {
            case 0:
                newmove=pos.getCol()+1;
                pos.setCol(newmove);
                lastI=i;
                break;
            case 1:
                newmove=pos.getCol()-1;
                pos.setCol(newmove);
                lastI=i;
                break;
            case 2:
                newmove=pos.getRow()+1;
                pos.setRow(newmove);
                lastI=i;
                break;
            case 3:
                newmove=pos.getRow()-1;
                pos.setRow(newmove);
                lastI=i;
                break;
        }
        if (pos.getCol() <= 0) pos.setCol(100);
        else if (pos.getCol() >= 100) pos.setCol(0);
        if (pos.getRow() <= 0) pos.setRow(25);
        else if (pos.getRow() >= 25) pos.setRow(0);
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

