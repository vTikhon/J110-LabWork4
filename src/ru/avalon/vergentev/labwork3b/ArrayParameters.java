package ru.avalon.vergentev.labwork3b;

import java.util.Arrays;

public class ArrayParameters implements ArrayBehaviour {
    boolean [] array = new boolean[SIZE]; //������� ������ ��� ������

    //����� ��������� �������� ������� � �������� ��������
    @Override
    public boolean get(int i) {
        System.out.println("Value of element " + i + " is: " + array[i]);
        return array[i];
    }
    //����� ��������� �������� ������� � �������� ��������
    @Override
    public void set(int i, boolean value) {
        array[i] = value;
    }

    //����� ��������� �������� ������� � �������� �������� � �������� true
    @Override
    public void setTrue(int i) {
        array[i] = true;
        System.out.println("Value of element " + i + " set to true. ");
    }
    //����� ��������� �������� ������� � �������� �������� � �������� false
    @Override
    public void setFalse(int i) {
        array[i] = false;
        System.out.println("Value of element " + i + " set to false. ");
    }

    //����� �������������� �������� ������� � �������� ��������
    @Override
    public void inverseElement(int i) {
        if (array[i] = false) {
            array[i] = true;
            System.out.println("Element " + i + " inversed to true. ");
        } else {
            array[i] = false;
            System.out.println("Element " + i + " inversed to false. ");
        }
    }

    //����� ����� ��������� ������� �� ��������� true
    @Override
    public int countTrues() {
        int N = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == true) {
                N = N + 1;
            }
        }
        System.out.println("Number of true values is: " + N);
        return N;
    }

    @Override
    public String toString(int i) {
        if (array[i] == true) {
            System.out.println("Element " + i + " is 1.");
        } else {
            System.out.println("Element " + i + " is 0.");
        }

        return Arrays.toString(array);
    }
}
