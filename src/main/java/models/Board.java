package models;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<List<Cell>> cells;
    private int size;

    public Board( int size) {
            this.size = size;
            //N -> N*N arrayList
            cells = new ArrayList<>();
            //creates the board for us
            for(int i=0 ; i<size ; i++) {
                cells.add(new ArrayList<>());
                for(int j=0 ; j<size ; j++) {
                    cells.get(i).add(new Cell(i,j));
                }
            }


    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getCells() {
        return cells;
    }

    public void setCells(List<List<Cell>> cells) {
        this.cells = cells;
    }
}
