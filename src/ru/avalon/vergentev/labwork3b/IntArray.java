package ru.avalon.vergentev.labwork3b;

public class IntArray implements ArrayBehaviour {
    int [] array = new int[SIZE/32]; //выделил память под массив

    //метод получения элемента массива с заданным индексом
    @Override
    public void get(int i) {
        try {
            System.out.println("Value of element " + i + " is: " + array[i] + " (" + Integer.toBinaryString(array[i]) + "). ");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index of massive is out of the range.");
        }
    }
    //метод получения значения бита элемента массива с заданным индексом (СЧИТАЕТ СПРАВА НАЛЕВО)
    public void getBit(int i, int numberOfBit) {
        try {
            int a = (array[i] << (32-numberOfBit)) >>> 31;
            System.out.println("Value of element " + i + " is: " + array[i] + " (" + Integer.toBinaryString(array[i]) + "). " + "And value of bit " + numberOfBit + " is " + a + ". ");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index of massive is out of the range.");
        }
    }

    //метод установки элемента массива с заданным индексом
    @Override
    public void set(int i, int value) {
        try {
            array[i] = value;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index of massive is out of the range.");
        }
    }
    //метод установки значения бита элемента массива с заданным индексом (СЧИТАЕТ СПРАВА НАЛЕВО)
    public void setBit(int i, int numberOfBit, int value) {
        try {
            int a = (array[i] << (32-numberOfBit)) >>> 31;
            if (value == 0 && a == 0) {
                int b = (array[i]) ^ (a << (numberOfBit - 1));
                array[i] = b;
            } else if (value == 0 && a == 1) {
                int b = (array[i]) ^ (a << (numberOfBit - 1));
                array[i] = b;
            } else if (value == 1 && a == 0) {
                a = value;
                int b = (array[i]) ^ (a << (numberOfBit - 1));
                array[i] = b;
            } else if (value == 1 && a == 1) {
                int b = (array[i]) | (a << (numberOfBit - 1));
                array[i] = b;
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index of massive is out of the range.");
        }
    }

    //метод установки элемента массива с заданным индексом в значение 1
    @Override
    public void setTrue(int i, int numberOfBit) {
        try {
            System.out.print("Bit number " + numberOfBit + " of element " + i + " (" + array[i] + " = " + Integer.toBinaryString(array[i]));
            setBit(i, numberOfBit, 1);
            System.out.println(") is forced set to 1 (new value " + array[i] + " = " + Integer.toBinaryString(array[i]) + "). ");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index of massive is out of the range.");
        }
    }
    //метод установки элемента массива с заданным индексом в значение 0
    @Override
    public void setFalse(int i, int numberOfBit) {
        try {
            System.out.print("Bit number " + numberOfBit + " of element " + i + " (" + array[i] + " = " + Integer.toBinaryString(array[i]));
            setBit(i, numberOfBit, 0);
            System.out.println(") is forced set to 0 (new value " + array[i] + " = " + Integer.toBinaryString(array[i]) + "). ");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index of massive is out of the range.");
        }
    }

    //метод инвертирования элемента массива с заданным индексом
    @Override
    public void inverseElement(int i) {
        try {
            array[i] = ~array [i];
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index of massive is out of the range.");
        }

    }

    //метод счёта битов элементов массива со значением 1
    @Override
    public void countTrues() {
        int N = 0;
        for (int i : array) {
            for (int numberOfBit = 1; numberOfBit <= 32; numberOfBit++) {
                if ((i << (32 - numberOfBit)) >>> 31 == 1) {
                    N = N + 1;
                }
            }
        }
        System.out.println("Number of 1-bit values is: " + N);
    }


}
