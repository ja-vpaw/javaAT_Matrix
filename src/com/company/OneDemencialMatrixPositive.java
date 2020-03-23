package com.company;

import static java.lang.Math.random;

public class OneDemencialMatrixPositive extends OneDemencialMatrix{
    private int[] array;
    private  int amoumt;
    private String nameMatrix;

    public OneDemencialMatrixPositive (){
        nameMatrix="OneDemencialMatrixPositive";
        amoumt = 5;
        array = new int[amoumt];
        for(int i=0; i<array.length;i++)
            array[i]=(int)((random()*12));
    }

    //Конструктор класса, перегружаем
    public OneDemencialMatrixPositive (int a){
        nameMatrix="OneDemencialMatrixPositive";
        amoumt = a;
        array = new int[amoumt];
        for(int i=0; i<array.length;i++)
            array[i]=(int)((random()*12));
    }


}
