package lesson03;

import java.sql.SQLOutput;

import static java.lang.System.*;

public class HomeWork03 {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        changeArray();

        System.out.println();

        System.out.println("Задача 2");
        Array100();

        System.out.println();

        System.out.println("Задача 3");
        changeArray2();

        System.out.println();
        System.out.println();

        System.out.println("Задача 4");
        diagonalArray();


        System.out.println();
        System.out.println();

        System.out.println("Задача 5");
        valueArray(15, 8);

        System.out.println();
        System.out.println();

        System.out.println("Задача 6");
        maxMin();

        System.out.println();
        System.out.println();

        System.out.println("Задача 7");

        equalArray(6);

        System.out.println();
        System.out.println();







    }
// Задание 1
    //Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void changeArray() {
        int[] newArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == 0) {
                newArray[i] = 1;
            } else {
                newArray[i] = 0;
            }

            System.out.print(newArray[i] + " ");
        }
    }
//Задание 2
    // Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void Array100() {
        int[] orderArray = new int[100];
        for (int i = 0; i < orderArray.length; i++) {
            orderArray[i] = i + 1;
            System.out.print(orderArray[i] + " ");
        }
    }

    //Задание 3
    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void changeArray2() {
        int array[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            } /*else {
                array[i] = array[i];
            }*/
            System.out.print(array[i] + " ");
        }
    }

    //Задание 4
    // Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
    // если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
    // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

    public static void diagonalArray() {
        int[][] array = new int[7][7];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || i + j == array.length - 1) {
                    array[i][j] = 1;
                } else array[i][j] = 0;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }


    //Задание 5
    //Написать метод, принимающий на вход два аргумента: len и initialValue,
    // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue

    public static void valueArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
            System.out.print(array[i] + "\t");
        }


    }

    //Задание 6
    //Задать одномерный массив и найти в нем минимальный и максимальный элементы

    public static void maxMin() {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }

            if (min > array[i]) {
                min = array[i];
            }
        }

        System.out.println("Максимальное значение >> " + max);
        System.out.println("Минимальное значение >> " + min);
    }


    //Задание 7
    //Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.

    public static void equalArray(int len) {

        /*int array[] = {2, 2, 2, 1, 2, 2, 10, 1};
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + "\t");
        }*/

        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        int totalSum = 0;
        int partSum = 0;
        String result = "false";

        for (int i = 0; i < array.length; i++) {
            totalSum = totalSum + array[i];
        }

        for (int i = 0; i < array.length; i++) {
            partSum = partSum + array[i];

            if (totalSum - partSum == partSum) {
                result = "true";
            }

            }
System.out.println(result);

        }



    }





