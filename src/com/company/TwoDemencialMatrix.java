package com.company;

import java.util.ArrayList;

import static java.lang.Math.random;

public class TwoDemencialMatrix implements MatrixInterface {

    public int matrix[][];
    public int row;
    public int column;
    public String nameMatrix;

    public String getNameMatrix() {
        nameMatrix = this.getClass().getSimpleName()+"-"+row+"x"+column;
        return nameMatrix;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    //Конструктор класса, заполняем 5 случайными элементами
    public TwoDemencialMatrix (){
        row = 5;
        column = 5;
        this.nameMatrix=this.getNameMatrix();
        matrix = new int[row][column];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                matrix[r][c] = (int)((random()*12)-6);
            }
        }
    }

    //Конструктор класса, перегружаем
    public TwoDemencialMatrix (int row, int column){
        this.row = row;
        this.column = column;
        this.nameMatrix=this.getNameMatrix();
        matrix = new int[row][column];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                matrix[r][c] = (int)((random()*12)-6);
            }
        }
    }

    //реализация метода
    @Override
    public int min() {
        return 0;
    }

    @Override
    public int max() {
        return 0;
    }

    public void printMatrix() {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                System.out.print(matrix[r][c] + "\t");
            }
            System.out.println();
        }
    }

    public void printName(){
        System.out.println(nameMatrix+':');
    }

    public int sumMatrix() {
        int sum = 0;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                sum += matrix[r][c];
            }
        }
        return sum;
    }

    public void printSumMatrix() {
        System.out.println("sumMatrix="+sumMatrix());
    }

    public ArrayList snakeList() {

        ArrayList<Integer> SnakeList = new ArrayList<>();

        int rowStart=0;
        int rowLength=matrix.length-1;

        int colStart=0;
        int colLength = matrix[0].length-1;

        while(rowStart <= rowLength && colStart <= colLength){

            for (int i = rowStart; i <= colLength; i++) {
                SnakeList.add(matrix[rowStart][i]);
            }

            for (int j = rowStart+1; j <= rowLength; j++) {
                SnakeList.add(matrix[j][colLength]);
            }

            if(rowStart+1 <= rowLength){
                for (int k = colLength-1; k >= colStart; k--) {
                    SnakeList.add(matrix[rowLength][k]);
                }
            }
            if(colStart+1 <= colLength){
                for (int k = rowLength-1; k > rowStart; k--) {
                    SnakeList.add(matrix[k][colStart]);
                }
            }

            rowStart++;
            rowLength--;
            colStart++;
            colLength--;
        }
        return SnakeList;
    }

    public void printSnakeList() {
        System.out.println("snakeArray="+snakeList());
    }

    public void zeroCrossMatrix() {
        for (int r = 0; r < matrix.length; r++) {
            matrix[r][matrix.length / 2] = 0;
            if (matrix.length % 2 == 0) {
                matrix[r][matrix.length / 2 - 1] = 0;
            }

        }
        for (int c = 0; c < matrix[0].length; c++) {
            matrix[matrix[0].length / 2][c] = 0;
            if (matrix[0].length % 2 == 0) {
                matrix[matrix[0].length / 2 - 1][c] = 0;
            }
        }
        System.out.println("ZeroCross - "+nameMatrix);
        printMatrix();
    }
}
