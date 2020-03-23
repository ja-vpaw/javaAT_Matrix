package com.company;

public class Main {



    public static void main(String[] args) {
//        ArrayList<String> people = new ArrayList<>();
//        people.add("Kotlin1");
//        people.add("Kotlin2");
//        people.add("Kotlin3");
//        people.add("Kotlin4");
//        people.add("Kotlin5");
//
//        System.out.println(people.get(1));
//
//        people.set(1,"Gladiolus");
//
//        System.out.println(people.get(1));
//
//        if(people.contains("Kotlin3"))
//            System.out.println("True");
//        else
//            System.out.println("False");
//
//        people.remove(0);
//        System.out.println(people);
//        people.remove("Gladiolus");
//        people.add("Kotlin6");
//        System.out.println(people);
//
//        Object[] peopleArray = people.toArray();
//
//        for(Object person : peopleArray)
//            System.out.println(person);
//
//
//        OneDemencialMatrix myMatrixOne = new OneDemencialMatrix();//объект класса
//
//        try {
//            Field field=myMatrixOne.getClass().getDeclaredField("nameMatrix");
//            field.setAccessible(true);
//            System.out.println(field.get(myMatrixOne));
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }


 /*
        OneDemencialMatrixPositive myPositive = new OneDemencialMatrixPositive(20);
        myPositive.printName();
*/
        TwoDemencialMatrix myMatrix2D = new TwoDemencialMatrix();

        myMatrix2D.printName();
        myMatrix2D.printMatrix();

        TwoDemencialMatrix myMatrix2D10x10 = new TwoDemencialMatrix(10,10);

        myMatrix2D10x10.printName();
        myMatrix2D10x10.printMatrix();

        TwoDemencialMatrix MatrixNew = new TwoDemencialMatrix(2,2);

        MatrixNew.printName();
        MatrixNew.printMatrix();
        MatrixNew.printSumMatrix();

        TwoDemencialMatrixSum0 matrixSum0 = new TwoDemencialMatrixSum0(5,5);

        matrixSum0.printName();
        matrixSum0.printMatrix();
        matrixSum0.printSumMatrix();

        TwoDemencialMatrix matrixSnake3x3 = new TwoDemencialMatrix(3,3);

        matrixSnake3x3.printName();
        matrixSnake3x3.printMatrix();
        matrixSnake3x3.printSnakeList();
        matrixSnake3x3.zeroCrossMatrix();

        TwoDemencialMatrix matrixSnake4x4 = new TwoDemencialMatrix(4,4);

        matrixSnake4x4.printName();
        matrixSnake4x4.printMatrix();
        matrixSnake4x4.printSnakeList();
        matrixSnake4x4.zeroCrossMatrix();

        TwoDemencialMatrixPositive matrixCross5x5 = new TwoDemencialMatrixPositive(5,5);

        matrixCross5x5.printName();
        matrixCross5x5.printMatrix();
        matrixCross5x5.zeroCrossMatrix();

        TwoDemencialMatrixPositive matrixCross4x4 = new TwoDemencialMatrixPositive(4,4);

        matrixCross4x4.printName();
        matrixCross4x4.printMatrix();
        matrixCross4x4.zeroCrossMatrix();

        TwoDemencialMatrixPositive matrixCross8x8 = new TwoDemencialMatrixPositive(8,8);

        matrixCross8x8.printName();
        matrixCross8x8.printMatrix();
        matrixCross8x8.zeroCrossMatrix();

    }
}
