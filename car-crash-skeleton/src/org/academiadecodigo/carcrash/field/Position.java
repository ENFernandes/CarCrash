package org.academiadecodigo.carcrash.field;


public class Position {

    private int col = (int)(Math.random()*100);
    private int row = (int)(Math.random()*25);


    public int getCol() {
        return col;
    }
    public int getRow() {
        return row;
    }
}
