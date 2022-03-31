package ru.avalon.vergentev.labwork3b;

import java.util.Arrays;

public class BooleanArray implements ArrayBehaviour {
    boolean [] array = new boolean[SIZE]; //выделил память под массив

    //метод установки значений массива
    @Override
    public void setArray(int i, boolean value) {
        try {
            array[i] = true;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index of massive out of the range.");
        }
    }

    //метод получения элемента массива с заданным индексом
    @Override
    public boolean get(int i) {
        try {
            System.out.println("Value of element " + i + " is: " + array[i]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index of massive out of the range.");
        }   return false;
    }
    //метод установки элемента массива с заданным индексом
    @Override
    public void set(int i, boolean value) {
        try {
            array[i] = value;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index of massive out of the range.");
        }
    }

    //метод установки элемента массива с заданным индексом в значение true
    @Override
    public void setTrue(int i) {
        try {
            array[i] = true;
            System.out.println("Value of element " + i + " force set to true. ");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index of massive out of the range.");
        }
    }
    //метод установки элемента массива с заданным индексом в значение false
    @Override
    public void setFalse(int i) {
        try {
            array[i] = false;
            System.out.println("Value of element " + i + " force set to false. ");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index of massive out of the range.");
        }
    }

    //метод инвертирования элемента массива с заданным индексом
    @Override
    public void inverseElement(int i) {
        try {
            if (array[i]) {
                array[i] = false;
                System.out.println("Element " + i + " inversed to true. ");
            } else {
                array[i] = true;
                System.out.println("Element " + i + " inversed to false. ");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index of massive out of the range.");
        }

    }

    //метод счёта элементов массива со значением true
    @Override
    public int countTrues() {
        int N = 0;
        for (boolean i : array) {
            if (i) {
                N = N + 1;
            }
        }
        System.out.println("Number of true values is: " + N);
        return N;
    }

    @Override
    public String toString() {
        for (int i = 0; i < array.length; i++) {
            if (array[i]) {
                System.out.println("Element " + i + " is 1 (true).");
            } else {
                System.out.println("Element " + i + " is 0 (false).");
            }
        }
        return Arrays.toString(array);
    }

}
