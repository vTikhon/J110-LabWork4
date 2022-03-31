package ru.avalon.vergentev.labwork3b;

import java.util.Arrays;

public class IntArray implements ArrayBehaviour {
    int [] array2 = new int[SIZE/32]; //������� ������ ��� ������

    //����� ��������� �������� ������� � �������� ��������
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

    //����� ��������� �������� ���� �������� ������� � �������� �������� (������� ������ ������)
    @Override
    public boolean get(int i) {
        int numberOfIndexArray = i / 32;
        int numberOfBit = i % 32;
        int bitValue = 0;
        try {
            bitValue = (array2[numberOfIndexArray] << (32 - numberOfBit)) >>> 31;
            System.out.println("Bit number " + i + " (" +  numberOfBit + " bit of " + numberOfIndexArray + " array element)" + " is " + bitValue + ". Value of array element " + numberOfIndexArray + " is: " + array2[numberOfIndexArray] + " (binary code: " + Integer.toBinaryString(array2[numberOfIndexArray]) + "). ");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index of massive is out of the range.");
        }
        if (bitValue == 1) {
            return true;
        }
        return false;
    }


    //����� ��������� �������� ���� �������� ������� � �������� �������� (������� ������ ������)
    @Override
    public void set(int i, boolean value) {
        try {
            int numberOfIndexArray = i / 32;
            int numberOfBit = i % 32;
            int bitValue = (array2[numberOfIndexArray] << (32-numberOfBit)) >>> 31;
            if (value == false && bitValue == 0) {
                int b = (array2[numberOfIndexArray]) ^ (bitValue << (numberOfBit - 1));
                array2[numberOfIndexArray] = b;
            } else if (value == false && bitValue == 1) {
                int b = (array2[numberOfIndexArray]) ^ (bitValue << (numberOfBit - 1));
                array2[numberOfIndexArray] = b;
            } else if (value == true && bitValue == 0) {
                int b = (array2[numberOfIndexArray]) ^ (1 << (numberOfBit - 1));
                array2[numberOfIndexArray] = b;
            } else if (value == true && bitValue == 1) {
                int b = (array2[numberOfIndexArray]) | (bitValue << (numberOfBit - 1));
                array2[numberOfIndexArray] = b;
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index of massive is out of the range.");
        }
    }

    //����� ��������� �������� ������� � �������� �������� � �������� 1
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
    //����� ��������� �������� ������� � �������� �������� � �������� 0
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

    //����� �������������� �������� ������� � �������� ��������
    @Override
    public void inverseElement(int i) {
        int numberOfIndexArray = i / 32;
        int numberOfBit = i % 32;
        int bitValue = (array2[numberOfIndexArray] << (32 - numberOfBit)) >>> 31;
        System.out.print("Bit number " + i + " (" +  numberOfBit + " bit of " + numberOfIndexArray + " array element)" + " is " + bitValue);
        bitValue = (1^bitValue);
        System.out.print(" was inversed to ");
        System.out.println(bitValue + ". ");
        if (bitValue == 1) {
            set(i, true);
        } else if (bitValue==0) {
            set(i, false);
        }
    }

    //����� ����� ����� ��������� ������� �� ��������� 1
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
            for (int j = 1; j <= 32; j++) {
                int numberOfBit = j % 32;
                int bitValue = (array2[numberOfIndexArray] << (32 - numberOfBit)) >>> 31;
                System.out.println("Element " + (i+1)  + ", bit number " + j + " (" + (32*i+j) + ") is: " + bitValue);
            }
        }
        return Arrays.toString(array2);
    }

}
