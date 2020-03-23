package com.company;

import static java.lang.Math.random;

public class TwoDemencialMatrixSum0 extends TwoDemencialMatrix {

    public TwoDemencialMatrixSum0 (int row, int column){
        this.row = row;
        this.column = column;
        this.nameMatrix=this.getNameMatrix();
        matrix = new int[row][column];
        int summatrix = 1;

        while (summatrix != 0){
            for (int r = 0; r < matrix.length; r++) {
                for (int c = 0; c < matrix[0].length; c++) {
                    matrix[r][c] = (int) ((random() * 12) - 6);
                }
            }
            summatrix = sumMatrix();
        }
    }
}
