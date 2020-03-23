package com.company;

import static java.lang.Math.random;

public class TwoDemencialMatrixPositive extends TwoDemencialMatrix {

    public TwoDemencialMatrixPositive(int row, int column){
        this.row = row;
        this.column = column;
        this.nameMatrix=this.getNameMatrix();
        matrix = new int[row][column];

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                matrix[r][c] = (int) ((random() * 9)+1);
            }
        }
    }
}
