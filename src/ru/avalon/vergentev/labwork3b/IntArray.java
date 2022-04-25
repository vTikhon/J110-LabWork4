package ru.avalon.vergentev.labwork3b;

import java.util.Arrays;

public class IntArray implements ArrayBehaviour {
    int [] array2 = new int[SIZE/32]; //выделил память под массив


    //метод получения значения бита элемента массива с заданным индексом (СЧИТАЕТ СПРАВА НАЛЕВО)
    @Override
    public void get(int i) {
        int numberOfIndexArray = i / 32;
        int numberOfBit = i % 32;
        try {
            int bitValue = (array2[numberOfIndexArray] << (32 - numberOfBit)) >>> 31;
            System.out.println("Bit number " + i + " (" +  numberOfBit + " bit of " + (numberOfIndexArray+1) + " array element)" + " is " + bitValue + ". Value of array element " + numberOfIndexArray + " is: " + array2[numberOfIndexArray] + " (binary code: " + Integer.toBinaryString(array2[numberOfIndexArray]) + "). ");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index of massive is out of the range.");
        }
    }


    //метод установки значения бита элемента массива с заданным индексом (СЧИТАЕТ СПРАВА НАЛЕВО)
    @Override
    public void set(int i, boolean value) {
        try {
            int numberOfIndexArray = i / 32;
            int numberOfBit = i % 32;
            int bitValue = (array2[numberOfIndexArray] << (32-numberOfBit)) >>> 31;
            if (!value && bitValue == 0) {
                int b = (array2[numberOfIndexArray]) ^ (bitValue << (numberOfBit - 1));
                array2[numberOfIndexArray] = b;
            }
            else if (value && bitValue == 0) {
                int b = (array2[numberOfIndexArray]) ^ (1 << (numberOfBit - 1));
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
            System.out.print("Bit number " + i + " (" +  numberOfBit + " bit of " + (numberOfIndexArray+1) + " array element) (number " + array2[numberOfIndexArray] + " in binary " + Integer.toBinaryString(array2[numberOfIndexArray]));
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
            System.out.print("Bit number " + i + " (" +  numberOfBit + " bit of " + (numberOfIndexArray+1) + " array element) (number " + array2[numberOfIndexArray] + " in binary " + Integer.toBinaryString(array2[numberOfIndexArray]));
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
        int bitValue = (array2[numberOfIndexArray] << (32 - numberOfBit)) >>> 31;
        System.out.print("Bit number " + i + " (" +  numberOfBit + " bit of " + (numberOfIndexArray+1) + " array element)" + " is " + bitValue);
        bitValue = (1^bitValue);
        System.out.print(" was inversed to ");
        System.out.println(bitValue + ". ");
        set(i, bitValue == 1);
    }

    //метод счёта битов элементов массива со значением 1
    @Override
    public void countTrues() {
        int N = 0;
        for (int i : array2) {
            for (int numberOfBit = 1; numberOfBit <= 32; numberOfBit++) {
                if ((i << (32 - numberOfBit)) >>> 31 == 1) {
                    N = N + 1;
                }
            }
        }
        System.out.println("Number of 1-bit values is: " + N);
    }

    @Override
    public String toString() {
        for (int i = 0; i < array2.length; i++) {
            int numberOfIndexArray = i / 32;
            for (int j = 1; j <= 32; j++) {
                int numberOfBit = j % 32;
                int bitValue = (array2[numberOfIndexArray] << (32 - numberOfBit)) >>> 31;
                System.out.println("Element " + (i+1)  + ", bit number " + j + " (" + (32*i+j) + ") is: " + bitValue);
            }
        }
        return Arrays.toString(array2);
    }

}
