package ru.avalon.vergentev.labwork3b;

import java.util.Arrays;

public class IntArray implements ArrayBehaviour {
    int [] array2 = new int[SIZE/32]; //выделил память под массив

    //метод установки элемента массива с заданным индексом
    @Override
    public void setArray(int i, boolean value) {
        try {
            if (value == true) {
                array2[i] = 1;
            } else {
                array2[i] = 0;
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index of massive is out of the range.");
        }
    }

    //метод получения значения бита элемента массива с заданным индексом (СЧИТАЕТ СПРАВА НАЛЕВО)
    @Override
    public boolean get(int i) {
        int numberOfIndexArray = i / 32;
        int numberOfBit = i % 32;
        int a = 0;
        try {
            a = (array2[numberOfIndexArray] << (32 - numberOfBit)) >>> 31;
            System.out.println("Bit number " + i + " (" +  numberOfBit + " bit of " + numberOfIndexArray + " array element)" + " is " + a + ". Value of array element " + numberOfIndexArray + " is: " + array2[numberOfIndexArray] + " (binary code: " + Integer.toBinaryString(array2[numberOfIndexArray]) + "). ");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index of massive is out of the range.");
        }
        if (a == 1) {
            return true;
        }
        return false;
    }


    //метод установки значения бита элемента массива с заданным индексом (СЧИТАЕТ СПРАВА НАЛЕВО)
    @Override
    public void set(int i, boolean value) {
        try {
            int numberOfIndexArray = i / 32;
            int numberOfBit = i % 32;
            int a = (array2[numberOfIndexArray] << (32-numberOfBit)) >>> 31;
            if (value == false && a == 0) {
                int b = (array2[numberOfIndexArray]) ^ (a << (numberOfBit - 1));
                array2[numberOfIndexArray] = b;
            } else if (value == false && a == 1) {
                int b = (array2[numberOfIndexArray]) ^ (a << (numberOfBit - 1));
                array2[numberOfIndexArray] = b;
            } else if (value == true && a == 0) {
                int b = (array2[numberOfIndexArray]) ^ (1 << (numberOfBit - 1));
                array2[numberOfIndexArray] = b;
            } else if (value == true && a == 1) {
                int b = (array2[numberOfIndexArray]) | (a << (numberOfBit - 1));
                array2[numberOfIndexArray] = b;
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index of massive is out of the range.");
        }
    }

    //метод установки элемента массива с заданным индексом в значение 1
    @Override
    public void setTrue(int i) {
        int numberOfIndexArray = i / 32;
        int numberOfBit = i % 32;
        try {
            System.out.print("Bit number " + i + " (" +  numberOfBit + " bit of " + numberOfIndexArray + " array element) (" + array2[numberOfIndexArray] + " = " + Integer.toBinaryString(array2[numberOfIndexArray]));
            set(i, true);
            System.out.println(") is forced set to 1 (new value " + array2[numberOfIndexArray] + " = " + Integer.toBinaryString(array2[numberOfIndexArray]) + "). ");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index of massive is out of the range.");
        }
    }
    //метод установки элемента массива с заданным индексом в значение 0
    @Override
    public void setFalse(int i) {
        int numberOfIndexArray = i / 32;
        int numberOfBit = i % 32;
        try {
            System.out.print("Bit number " + i + " (" +  numberOfBit + " bit of " + numberOfIndexArray + " array element) (" + array2[numberOfIndexArray] + " = " + Integer.toBinaryString(array2[numberOfIndexArray]));
            set(i, false);
            System.out.println(") is forced set to 0 (new value " + array2[numberOfIndexArray] + " = " + Integer.toBinaryString(array2[numberOfIndexArray]) + "). ");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index of massive is out of the range.");
        }
    }

    //метод инвертирования элемента массива с заданным индексом
    @Override
    public void inverseElement(int i) {
        int numberOfIndexArray = i / 32;
        int numberOfBit = i % 32;
        int a = (array2[numberOfIndexArray] << (32 - numberOfBit)) >>> 31;
        System.out.print("Bit number " + i + " (" +  numberOfBit + " bit of " + numberOfIndexArray + " array element)" + " is " + a);
        a = (1^a);
        System.out.print(" was inversed to ");
        System.out.println(a + ". ");
        if (a == 1) {
            set(i, true);
        } else if (a==0) {
            set(i, false);
        }
    }

    //метод счёта битов элементов массива со значением 1
    @Override
    public int countTrues() {
        int N = 0;
        for (int i : array2) {
            for (int numberOfBit = 1; numberOfBit <= 32; numberOfBit++) {
                if ((i << (32 - numberOfBit)) >>> 31 == 1) {
                    N = N + 1;
                }
            }
        }
        System.out.println("Number of 1-bit values is: " + N);
        return N;
    }

    @Override
    public String toString() {
        for (int i = 0; i < array2.length; i++) {
            int numberOfIndexArray = i / 32;
            int numberOfBit = i % 32;
            int a = (array2[numberOfIndexArray] << (32 - numberOfBit)) >>> 31;
            System.out.println("Element " + i + " , bit number " + numberOfBit + " is: " + a);

        }
        return Arrays.toString(array2);
    }

}
