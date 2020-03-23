package com.company;

import static java.lang.Math.random;

// Класс одномерной матрицы реализует интерфейс
public class OneDemencialMatrix implements MatrixInterface{

    private int[] array;
    private int amount;
    private String nameMatrix;

    public int getAmount() {
        return amount;
    }

    //Конструктор класса, заполняем 5 случайными элементами
    public OneDemencialMatrix (){
        nameMatrix="OneDemencialMatrix";
        amount = 5;
        array = new int[amount];
        for(int i=0; i<array.length;i++)
            array[i]=(int)((random()*12)-6);
    }

    //Конструктор класса, перегружаем
    public OneDemencialMatrix (int amount){
        nameMatrix="OneDemencialMatrix";
        this.amount = amount;
        array = new int[amount];
        for(int i=0; i<array.length;i++)
            array[i]=(int)((random()*12)-6);
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

    public void printMatrix(){
        for(int i=0; i<array.length;i++)
            System.out.println(array[i]);
    }
    public void printName(){
        System.out.println(nameMatrix);
    }
}
