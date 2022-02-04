package org.academiadecodigo.carcrash.field;

import java.util.Objects;

public class Position {
    private int col = (int) (Math.random() * Field.getWidth());
    private int row = (int) (Math.random() * Field.getHeight());

    /*private int col = 1;
    private int row = 1;*/
    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
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
