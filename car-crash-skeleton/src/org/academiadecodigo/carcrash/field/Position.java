package org.academiadecodigo.carcrash.field;

import java.util.Objects;

public class Position {
    private int col = (int)(Math.random()*100);
    private int row = (int)(Math.random()*25);
    /*private int col = 1;
    private int row = 1;*/
    public int getCol() {
        return col;
    }
    public int getRow() {
        return row;
    }
    public void move(){
        int i = (int)(Math.random()*4);
        switch (i)
        {
            case 0:
                col+=1;
                break;
            case 1:
                col-=1;
                break;
            case 2:
                row-=1;
                break;
            case 3:
                row+=1;
                break;
        }
        if(col<=0)col=100;
        else if(col>=100)col=0;
        if(row<=0)row=25;
        else if(row>=25)row=0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;
        Position position = (Position) o;
        return getCol() == position.getCol() && getRow() == position.getRow();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCol(), getRow());
    }
}
